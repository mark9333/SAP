package file.processing;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class Dashboard extends javax.swing.JFrame {
    ArrayList<ArrayList<String>> lines = new ArrayList<>();

    public Dashboard() {
        initComponents();
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pathDir = new javax.swing.JTextField();
        line1st = new javax.swing.JTextField();
        line2nd = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lineS1 = new javax.swing.JTextField();
        word = new javax.swing.JTextField();
        lineS2 = new javax.swing.JTextField();
        word2nd = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        ddd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pathDir.setToolTipText("file path");

        line1st.setToolTipText("Swith this line");

        line2nd.setToolTipText("with this line");
        line2nd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line2ndActionPerformed(evt);
            }
        });

        jButton2.setText("Switch Lines");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lineS1.setToolTipText("Line number");

        word.setToolTipText("Word");

        lineS2.setToolTipText("2nd Line Number");

        word2nd.setToolTipText("2nd Word");

        jButton3.setText("Switch Words");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ddd.setText("Process");
        ddd.setEnabled(false);

        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ddd, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lineS1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lineS2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(word2nd))
                            .addComponent(pathDir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(line1st)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(line2nd, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(pathDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(line1st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(line2nd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lineS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lineS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(word2nd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddd)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        pack();
    }

    private void line2ndActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(lines != null && !lines.isEmpty()){
                lines.clear();
        }
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
        int r = j.showOpenDialog(null); 
        if (r == JFileChooser.APPROVE_OPTION) { 
            File file = j.getSelectedFile(); 
            pathDir.setText(file.getPath()); 
            try (BufferedReader fileBufferReader = new BufferedReader(new FileReader(file))) {
                String fileLineContent;
                while ((fileLineContent = fileBufferReader.readLine()) != null) {
                    String[] words = fileLineContent.split(" "); 
                    ArrayList<String> wordL = new  ArrayList<>(); 
                    wordL.addAll(Arrays.asList(words));
                    lines.add(wordL);
                }
            } catch (IOException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else 
            JOptionPane.showMessageDialog(null, "Please Select a File!", "Warning", JOptionPane.WARNING_MESSAGE);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int line = Integer.valueOf(line1st.getText());
            int line2 = Integer.valueOf(line2nd.getText());
            line--;
            line2--;
            ArrayList<String> line1L = lines.get(line);
            ArrayList<String> line2L = lines.get(line2);
            
            lines.set(line, line2L);
            lines.set(line2, line1L);
            JOptionPane.showMessageDialog(null, "Done Swithching Lines!", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erorr", JOptionPane.ERROR);
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        PrintWriter out = null; 
        try {
            out = new PrintWriter(new FileWriter(pathDir.getText()));
            for (ArrayList<String> words : lines) {
                String l = "";
                for(String n: words){
                    l = l.concat(n + " ");
                }
                out.println(l);
            }             
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erorr", JOptionPane.ERROR);

        } finally {
            if (out != null) {
                out.close();
                JOptionPane.showMessageDialog(null, "Done Saving!", "Done", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int line = Integer.valueOf(lineS1.getText());
            int line2 = Integer.valueOf(lineS2.getText());
            line--;
            line2--;
            int word1 = Integer.valueOf(word.getText());
            int word2 = Integer.valueOf(word2nd.getText());
            word1--;
            word2--;
            ArrayList<String> line1L = lines.get(line);
            ArrayList<String> line2L = lines.get(line2);
            
            String wordS1 = line1L.get(word1);
            String wordS2 = line2L.get(word2);
            
            line1L.set(word1, wordS2); 
            line2L.set(word2, wordS1);
            
            lines.set(line, line1L);
            lines.set(line2, line2L);
            JOptionPane.showMessageDialog(null, "Done Swithching words!", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erorr", JOptionPane.ERROR);
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    private javax.swing.JButton ddd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JTextField line1st;
    private javax.swing.JTextField line2nd;
    private javax.swing.JTextField lineS1;
    private javax.swing.JTextField lineS2;
    private javax.swing.JTextField pathDir;
    private javax.swing.JTextField word;
    private javax.swing.JTextField word2nd;
}