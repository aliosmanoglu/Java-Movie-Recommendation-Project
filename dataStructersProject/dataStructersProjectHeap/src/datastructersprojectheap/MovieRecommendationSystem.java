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
public class MovieRecommendationSystem {
 
    
    

    public int[][] readUserMovieMatrixFromFile(String fileName) {
        int[][] kullaniciFilmMatrisi = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            List<int[]> rows = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                int[] row = new int[values.length];
                for (int i = 0; i < values.length; i++) {

                    row[i] = Integer.parseInt(values[i]);
                }
                rows.add(row);
            }
            kullaniciFilmMatrisi = new int[rows.size()][];
            for (int i = 0; i < rows.size(); i++) {
                kullaniciFilmMatrisi[i] = rows.get(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return kullaniciFilmMatrisi;
    }
    
    public String[][] readStringFromFile(String filePath) {
        List<String[]> dataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                dataList.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int rows = dataList.size();
        int cols = dataList.get(0).length;

        String[][] dataArray = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] data = dataList.get(i);
            for (int j = 0; j < cols; j++) {
                dataArray[i][j] = data[j];
            }
        }

        return dataArray;
    }

    public String[] readCSVToArray(String filePath) {
        List<String> dataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                for (String value : data) {
                    dataList.add(value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] dataArray = new String[dataList.size()];
        return dataList.toArray(dataArray);
    }

    public double cosineSimilarity(int[] kullanici1, int[] kullanici2) {
        if (kullanici1.length != kullanici2.length) {
            throw new IllegalArgumentException("Kullanıcı vektörleri aynı uzunlukta olmalıdır.");
        }

        double dotProduct = 0.0;
        double norm1 = 0.0;
        double norm2 = 0.0;

        for (int i = 1; i < kullanici1.length; i++) {
            dotProduct += kullanici1[i] * kullanici2[i];
            norm1 += Math.pow(kullanici1[i], 2);
            norm2 += Math.pow(kullanici2[i], 2);
        }

        double similarity = dotProduct / (Math.sqrt(norm1) * Math.sqrt(norm2));
        return similarity;
    }
}
