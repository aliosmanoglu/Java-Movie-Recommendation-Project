/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructersprojectheap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali Haydar
 */
public class Test {
    
    public static int[] createUserArray(int[][] matris, int row){
        int length = matris[row].length;
        
        int[] userArray = new int[length];
        
        for (int i = 0; i < length; i++) {
            userArray[i] = matris[row][i];
        }
        return userArray;
    }
    
    public static void main(String[] args) {
        
        
        MovieRecommendationSystem m = new MovieRecommendationSystem();
        
        int[][] kullaniciFilmMatrisi = m.readUserMovieMatrixFromFile("C:\\Users\\Ali Haydar\\Documents\\NetBeansProjects\\dataStructersProjectHeap\\src\\datastructersprojectheap\\main_data.csv");
        int[][] targetUserMatris = m.readUserMovieMatrixFromFile("C:\\Users\\Ali Haydar\\Documents\\NetBeansProjects\\dataStructersProjectHeap\\src\\datastructersprojectheap\\target_user.csv");
        
        String[][] movies = m.readStringFromFile("C:\\Users\\Ali Haydar\\Documents\\NetBeansProjects\\dataStructersProjectHeap\\src\\datastructersprojectheap\\movies.csv");
        System.out.println(movies[1][1]);
        
        
        MaxHeap heap = new MaxHeap(kullaniciFilmMatrisi.length);
        int[] targetUser = createUserArray(targetUserMatris, 5);
        
        
        for (int i = 1; i < kullaniciFilmMatrisi.length; i++) {
            double cosine = m.cosineSimilarity(targetUser, createUserArray(kullaniciFilmMatrisi, i));
            heap.insert(cosine,i);
        }
        
        ArrayList<Integer> users_id = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            Node maxNode = heap.extractMax();
            double maxValue = maxNode.data;
            int maxID = maxNode.user_id;
            System.out.println(maxValue + " id = " + maxID);
            users_id.add(maxID);
        }
        
        System.out.println("----------------------");
        
        
        
        /*KULLANICILARIN FİLMLERİ*/
        
        
        for (int i = 0; i < users_id.size(); i++) {
            for (int j = 1; j < kullaniciFilmMatrisi.length; j++) {
                if(kullaniciFilmMatrisi[j][0] == users_id.get(i)){
                    MaxHeap users_movies = new MaxHeap(kullaniciFilmMatrisi[0].length);
                    for (int k = 1; k < kullaniciFilmMatrisi[j].length - 1; k++) {
                        if (k == 0) {
                            System.out.println(kullaniciFilmMatrisi[j].length);
                        }
                        users_movies.insert(kullaniciFilmMatrisi[j][k], k);
                    }
                    System.out.println("ID = " + users_id.get(i) + " Most vote movies");
                    for (int k = 0; k < 3; k++) {
                        int index = users_movies.extractMax().user_id;
                        System.out.println("Movie Index -> " + index);
                        for (int l = 1; l < movies.length; l++) {
                            if(Integer.parseInt(movies[l][0]) == index){
                                System.out.println("Movie " + (k+1) + ": " + movies[l][1]);
                            }
                        }
                        
                    }
                    break;
                }
            }
        }
        System.out.println("---------------");
        
        
        
        Node node1 = new Node(1, 20);
        Node node2 = new Node(0, 34);
        Node node3 = new Node(0, 24);
        Node node4 = new Node(0, 21);
        Node node5 = new Node(0, 10);
        Node node6 = new Node(0, 5);
        Node node7 = new Node(0, 6);
        Node node8 = new Node(0, 9);
        
        
        Node[] movieID = new Node[7];
        movieID[0] = node1;
        movieID[1] = node2;
        movieID[2] = node3;
        movieID[3] = node4;
        movieID[4] = node5;
        movieID[5] = node6;
        movieID[6] = node7;
        
        int [] newUser = new int[kullaniciFilmMatrisi[1].length];
        
        for (int i = 1; i < newUser.length; i++) {
            boolean bool = false;
            for (int j = 0; j < movieID.length; j++) {
                if(i == movieID[j].user_id){
                    newUser[i] = (int) movieID[j].data;
                    bool = true;
                    break;
                }
            }
            if(!bool) {
                    newUser[i] = 0;
                }
        }
        
        
        MaxHeap h = new MaxHeap(kullaniciFilmMatrisi.length);
        
         for (int i = 1; i < kullaniciFilmMatrisi.length; i++) {
            int[] arr = createUserArray(kullaniciFilmMatrisi, i);
            
             double cosine = m.cosineSimilarity(newUser, arr);
             h.insert(cosine,i);
        }
         System.out.println("En çok eşleşen kullanıcılar.");
        for (int i = 0; i < 10; i++) {
            Node maxNode = h.extractMax();
            double maxValue = maxNode.data;
            int maxID = maxNode.user_id;
            System.out.println("ID = " + maxID + " cosine = " + maxValue);
             
        }
        
        
        
        
        
    }
    
    
    
    
    
}
