/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datastructersprojectheap;

import java.util.ArrayList;


/**
 *
 * @author Ali Haydar
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    
    MovieRecommendationSystem m;
    int[][] targetUserMatris;
    int[][] movieMatris;
    String[][] movies;
    MaxHeap heap;
    
    public GUI() {
        initComponents();
        m = new MovieRecommendationSystem();
        
        movieMatris = m.readUserMovieMatrixFromFile("C:\\Users\\Ali Haydar\\Documents\\NetBeansProjects\\dataStructersProjectHeap\\src\\datastructersprojectheap\\main_data.csv");
        targetUserMatris = m.readUserMovieMatrixFromFile("C:\\Users\\Ali Haydar\\Documents\\NetBeansProjects\\dataStructersProjectHeap\\src\\datastructersprojectheap\\target_user.csv");
         
        movies = m.readStringFromFile("C:\\Users\\Ali Haydar\\Documents\\NetBeansProjects\\dataStructersProjectHeap\\src\\datastructersprojectheap\\movies.csv");
         
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmb_users = new javax.swing.JComboBox<>();
        label_x = new javax.swing.JTextField();
        label_k = new javax.swing.JTextField();
        brn_recommendation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_movie1 = new javax.swing.JComboBox<>();
        cmb_movie2 = new javax.swing.JComboBox<>();
        cmb_movie3 = new javax.swing.JComboBox<>();
        cmb_movie4 = new javax.swing.JComboBox<>();
        cmb_movie5 = new javax.swing.JComboBox<>();
        txt_movie1 = new javax.swing.JTextField();
        txt_movie2 = new javax.swing.JTextField();
        txt_movie3 = new javax.swing.JTextField();
        txt_movie4 = new javax.swing.JTextField();
        txt_movie5 = new javax.swing.JTextField();
        btn_getUsers = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea_movie = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmb_users.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User 1", "User 2", "User 3", "User 4", "User 5", "User 6", "User 7", "User8", "User 9", "User 10" }));
        cmb_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_usersActionPerformed(evt);
            }
        });

        label_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_xActionPerformed(evt);
            }
        });

        brn_recommendation.setText("Get Recommendation");
        brn_recommendation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brn_recommendationActionPerformed(evt);
            }
        });

        text_area.setColumns(20);
        text_area.setRows(5);
        jScrollPane1.setViewportView(text_area);

        jLabel1.setText("X :");

        jLabel2.setText("K:");

        jLabel3.setText("Target User");

        cmb_movie1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Georgia (1995)", "Babe (1995)", "Nadja (1994)", "Only You (1994)", "Underneath (1995)", "Higher Learning (1995)", "Blue Sky (1994)", "Toy Story (1995)", "Casino (1995)", "Clueless (1995)", "Madeline (1998)", "Frenzy (1972)", "Strangeland (1998)", "Extremities (1986)" }));

        cmb_movie2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Georgia (1995)", "Babe (1995)", "Nadja (1994)", "Only You (1994)", "Underneath (1995)", "Higher Learning (1995)", "Blue Sky (1994)", "Toy Story (1995)", "Casino (1995)", "Clueless (1995)", "Madeline (1998)", "Frenzy (1972)", "Strangeland (1998)", "Extremities (1986)" }));

        cmb_movie3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Georgia (1995)", "Babe (1995)", "Nadja (1994)", "Only You (1994)", "Underneath (1995)", "Higher Learning (1995)", "Blue Sky (1994)", "Toy Story (1995)", "Casino (1995)", "Clueless (1995)", "Madeline (1998)", "Frenzy (1972)", "Strangeland (1998)", "Extremities (1986)" }));

        cmb_movie4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Georgia (1995)", "Babe (1995)", "Nadja (1994)", "Only You (1994)", "Underneath (1995)", "Higher Learning (1995)", "Blue Sky (1994)", "Toy Story (1995)", "Casino (1995)", "Clueless (1995)", "Madeline (1998)", "Frenzy (1972)", "Strangeland (1998)", "Extremities (1986)" }));

        cmb_movie5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Georgia (1995)", "Babe (1995)", "Nadja (1994)", "Only You (1994)", "Underneath (1995)", "Higher Learning (1995)", "Blue Sky (1994)", "Toy Story (1995)", "Casino (1995)", "Clueless (1995)", "Madeline (1998)", "Frenzy (1972)", "Strangeland (1998)", "Extremities (1986)" }));

        btn_getUsers.setText("Get Recommendation");
        btn_getUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getUsersActionPerformed(evt);
            }
        });

        txtArea_movie.setColumns(20);
        txtArea_movie.setRows(5);
        jScrollPane2.setViewportView(txtArea_movie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_users, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_x, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_k, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brn_recommendation))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_getUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cmb_movie1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmb_movie2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmb_movie3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmb_movie4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(cmb_movie5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_movie1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(txt_movie2)
                                            .addComponent(txt_movie3)
                                            .addComponent(txt_movie4)
                                            .addComponent(txt_movie5))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brn_recommendation)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_movie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_movie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_movie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_movie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_movie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_movie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_movie4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_movie4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_movie5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_movie5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_getUsers))
                    .addComponent(jScrollPane2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_xActionPerformed

    private void brn_recommendationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brn_recommendationActionPerformed
        // TODO add your handling code here:
        String text = "";
        
        heap = new MaxHeap(movieMatris.length);
        int x_gui = Integer.parseInt(label_x.getText());
        int k_gui = Integer.parseInt(label_k.getText());
        
        int[] targetUser = createUserArray(targetUserMatris, cmb_users.getSelectedIndex() + 1);
        //heap.insertHeap(targetUser);
        for (int i = 1; i < movieMatris.length; i++) {
            double cosine = m.cosineSimilarity(targetUser, createUserArray(movieMatris, i));
            heap.insert(cosine,i);
        }
        
        ArrayList<Integer> users_id = new ArrayList<>();
        for (int i = 0; i < x_gui; i++) {
            Node maxNode = heap.extractMax();
            double maxValue = maxNode.data;
            int maxID = maxNode.user_id;
            text +="Id = " + maxID + " Cosine : "+ maxValue + "\n";
            users_id.add(maxID);
        }
        
        text += "-----------\n";
          for (int i = 0; i < users_id.size(); i++) {
            for (int j = 1; j < movieMatris.length; j++) {
                if(movieMatris[j][0] == users_id.get(i)){
                    MaxHeap users_movies = new MaxHeap(movieMatris[0].length);
                    for (int k = 1; k < movieMatris[j].length - 1; k++) {
                        users_movies.insert(movieMatris[j][k], k);
                    }
                    text += "ID = " + users_id.get(i) + " Best Movies" + "\n";
                    for (int k = 0; k < k_gui; k++) {
                        int index = users_movies.extractMax().user_id;
                        for (int l = 1; l < movies.length; l++) {
                            if(Integer.parseInt(movies[l][0]) == index){
                                text += "Movie " + (k+1) + ": " + movies[l][1] + "\n";
                            }
                        }
                        
                    }
                    break;
                }
            }
            text += "-------------\n";
        }
        
        
        text_area.setText(text);
    }//GEN-LAST:event_brn_recommendationActionPerformed

    private void cmb_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_usersActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmb_usersActionPerformed

    private void btn_getUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getUsersActionPerformed
        // TODO add your handling code here:
        String text = "";
        
        Node[] movieID = new Node[5];
        movieID[0] = new Node(Double.parseDouble(txt_movie1.getText()), switchCase(cmb_movie1.getSelectedIndex()));
        movieID[1] = new Node(Double.parseDouble(txt_movie2.getText()), switchCase(cmb_movie2.getSelectedIndex()));
        movieID[2] = new Node(Double.parseDouble(txt_movie3.getText()), switchCase(cmb_movie3.getSelectedIndex()));
        movieID[3] = new Node(Double.parseDouble(txt_movie4.getText()), switchCase(cmb_movie4.getSelectedIndex()));
        movieID[4] = new Node(Double.parseDouble(txt_movie5.getText()), switchCase(cmb_movie5.getSelectedIndex()));
        
        int [] newUser = new int[movieMatris[1].length];
        
        for (int i = 0; i < newUser.length; i++) {
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
        
        
        MaxHeap h = new MaxHeap(movieMatris.length);
        
         for (int i = 1; i < movieMatris.length; i++) {
            int[] arr = createUserArray(movieMatris, i);
            
             double cosine = m.cosineSimilarity(newUser, arr);
             h.insert(cosine,i);
        }
        text += ("En çok eşleşen kullanıcılar. \n");
        for (int i = 0; i < 10; i++) {
            Node maxNode = h.extractMax();
            double maxValue = maxNode.data;
            int maxID = maxNode.user_id;
            text += ("ID = " + maxID + " cosine = " + maxValue +"\n");
        }
        
        txtArea_movie.setText(text);
    }//GEN-LAST:event_btn_getUsersActionPerformed
    
    public int switchCase(int index){
        int ind = -1;
        switch (index){
            case 0:
                ind = 51;
                break;
            case 1:
                ind = 33;
                break;
            case 2:
                ind = 156;
                break;
            case 3:
                ind = 251;
                break;
            case 4:
                ind = 294;
                break;
            case 5:
                ind = 317;
                break;
            case 6:
                ind = 370;
                break;
            case 7:
                ind = 1;
                break;
            case 8:
                ind = 16;
                break;
            case 9:
                ind = 36;
                break;
            case 10:
                ind = 1401;
                break;
            case 11:
                ind = 1633;
                break;
            case 12:
                ind = 1711;
                break;
            case 13:
                ind = 1820;
                break;
        }
        return ind;
    }
    
     public int[] createUserArray(int[][] matris, int row){
        int length = matris[row].length;
        
        int[] userArray = new int[length];
        
        for (int i = 0; i < length; i++) {
            userArray[i] = matris[row][i];
        }
        return userArray;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brn_recommendation;
    private javax.swing.JButton btn_getUsers;
    private javax.swing.JComboBox<String> cmb_movie1;
    private javax.swing.JComboBox<String> cmb_movie2;
    private javax.swing.JComboBox<String> cmb_movie3;
    private javax.swing.JComboBox<String> cmb_movie4;
    private javax.swing.JComboBox<String> cmb_movie5;
    private javax.swing.JComboBox<String> cmb_users;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField label_k;
    private javax.swing.JTextField label_x;
    private javax.swing.JTextArea text_area;
    private javax.swing.JTextArea txtArea_movie;
    private javax.swing.JTextField txt_movie1;
    private javax.swing.JTextField txt_movie2;
    private javax.swing.JTextField txt_movie3;
    private javax.swing.JTextField txt_movie4;
    private javax.swing.JTextField txt_movie5;
    // End of variables declaration//GEN-END:variables
}
