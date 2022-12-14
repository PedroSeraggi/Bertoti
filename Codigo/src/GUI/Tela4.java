/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dao.UsuarioDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.medDTO;

/**
 *
 * @author Pedro
 */
public class Tela4 extends javax.swing.JFrame {

    private medDTO remedios;

    public Tela4(medDTO remedios) {
        initComponents();
        CarregarCampos(remedios);

        this.remedios = remedios;

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        CarID = new javax.swing.JTextField();
        CarPreço = new javax.swing.JTextField();
        CarQuant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CarNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CarDesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CarRecomendacao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 18, 75));
        jLabel2.setText("Configuração");

        CarID.setEditable(false);
        CarID.setBackground(new java.awt.Color(204, 204, 204));
        CarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarIDActionPerformed(evt);
            }
        });

        CarPreço.setBackground(new java.awt.Color(204, 204, 204));
        CarPreço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarPreçoActionPerformed(evt);
            }
        });

        CarQuant.setBackground(new java.awt.Color(204, 204, 204));
        CarQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarQuantActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(68, 18, 69));
        jLabel5.setText("Quantidade no estoque: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(68, 18, 69));
        jLabel8.setText("Preço:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(68, 18, 69));
        jLabel10.setText("Nome:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 18, 69));
        jLabel9.setText("ID");

        CarNome.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(68, 18, 69));
        jLabel4.setText("Descrição:");

        CarDesc.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(68, 18, 69));
        jLabel6.setText("Recomendação:");

        CarRecomendacao.setEditable(false);
        CarRecomendacao.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 62, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CarID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CarPreço, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CarQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CarRecomendacao, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(CarDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CarID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CarPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CarQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(CarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(9, 9, 9)
                                .addComponent(CarRecomendacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(58, 58, 58)))
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CarDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarIDActionPerformed

    private void CarPreçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarPreçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarPreçoActionPerformed

    private void CarQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarQuantActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AlterarCanal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Tela2 tela2 = new Tela2();
        tela2.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void CarregarCampos(medDTO remedios) {
        int id;
        String nome, recomendacao, preco, quant, desc;

        id = remedios.getId();
        nome = remedios.getNome();
        recomendacao = remedios.getRecomendacao();
        preco = remedios.getPreco();
        desc = remedios.getDesc();
        quant = remedios.getQuant();

        CarID.setText(Integer.toString(id));
        CarNome.setText(nome);
        CarPreço.setText(preco);
        CarQuant.setText(quant);
        CarRecomendacao.setText(recomendacao);
        CarDesc.setText(desc);

    }

    private void AlterarCanal() {
        int id_canal;
        String nome, desc, recomendacao, preco, quant;

        id_canal = Integer.parseInt(CarID.getText());
        nome = CarNome.getText();
        recomendacao = CarRecomendacao.getText();
        desc = CarDesc.getText();
        quant = CarQuant.getText();
        preco = CarPreço.getText();

        medDTO objmedsdto = new medDTO();
        objmedsdto.setId(id_canal);
        objmedsdto.setNome(nome);
        objmedsdto.setPreco(preco);
        objmedsdto.setQuant(quant);
        objmedsdto.setRecomendacao(recomendacao);
        objmedsdto.setDesc(desc);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.alterarCadastro(objmedsdto);

        JOptionPane.showMessageDialog(null, "Alteração feita!");
        dispose();

        Tela2 objListausergui = new Tela2();
        objListausergui.setVisible(true);  //abri a pagina se o login for correto

        dispose();

    }

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
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CarDesc;
    private javax.swing.JTextField CarID;
    private javax.swing.JTextField CarNome;
    private javax.swing.JTextField CarPreço;
    private javax.swing.JTextField CarQuant;
    private javax.swing.JTextField CarRecomendacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
