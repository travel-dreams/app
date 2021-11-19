
package Loading;
import objetos.Produtos;
import objetos.CarrinhoCadastra;
import conexoes.MySql;

public class Transporte extends javax.swing.JFrame {

    Produtos P = new Produtos();
    CarrinhoCadastra C = new CarrinhoCadastra();
    
    public Transporte() {
        initComponents();
        String nome1 = this.P.pegaNome(2, "nome",1);
        nomeProdTrans1.setText(nome1);
        
        String nome2 = this.P.pegaNome(2, "nome",2);
        nomeProdTrans2.setText(nome2);
        
        String nome3 = this.P.pegaNome(2, "nome",3);
        nomeProdTrans3.setText(nome3);
    
        String preco1 = this.P.pegaNome(2, "preco",1);
        precoProdTrans1.setText(preco1);
        
        String preco2 = this.P.pegaNome(2, "preco",2);
        precoProdTrans2.setText(preco2);
        
        String preco3 = this.P.pegaNome(2, "preco",3);
        precoProdTrans3.setText(preco3);
        
        String img1 = this.P.pegaNome(2, "imagem",1);
        System.out.print(img1);
        imgProd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loading/" + img1)));
        
        String img2 = this.P.pegaNome(2, "imagem",2);
        System.out.print(img2);
        imgProd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loading/" + img2 )));
        
        String img3 = this.P.pegaNome(2, "imagem",3);
        System.out.print(img3);
        imgProd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loading/" + img3 )));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        imgProd1 = new javax.swing.JButton();
        nomeProdTrans1 = new javax.swing.JLabel();
        precoProdTrans1 = new javax.swing.JLabel();
        buttonTransporte1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        imgProd2 = new javax.swing.JButton();
        nomeProdTrans2 = new javax.swing.JLabel();
        precoProdTrans2 = new javax.swing.JLabel();
        buttonTransporte2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        imgProd3 = new javax.swing.JButton();
        nomeProdTrans3 = new javax.swing.JLabel();
        precoProdTrans3 = new javax.swing.JLabel();
        buttonTransporte3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 97, 218));
        jLabel5.setText("<");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(16, 97, 218));
        jLabel6.setText("Transporte");

        jPanel8.setBackground(new java.awt.Color(16, 97, 218));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(16, 97, 218), 1, true));
        jPanel8.setForeground(new java.awt.Color(16, 97, 218));

        imgProd1.setBackground(new java.awt.Color(0, 0, 0));
        imgProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgProd1ActionPerformed(evt);
            }
        });

        nomeProdTrans1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomeProdTrans1.setForeground(new java.awt.Color(255, 255, 255));
        nomeProdTrans1.setText("Nome do Produto");

        precoProdTrans1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoProdTrans1.setForeground(new java.awt.Color(255, 255, 255));
        precoProdTrans1.setText("R$00,00");

        buttonTransporte1.setText("Adicionar ao Carrinho");
        buttonTransporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransporte1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTransporte1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeProdTrans1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(precoProdTrans1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(imgProd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeProdTrans1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoProdTrans1)
                .addGap(18, 18, 18)
                .addComponent(buttonTransporte1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(16, 97, 218));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(16, 97, 218), 1, true));
        jPanel7.setForeground(new java.awt.Color(16, 97, 218));

        imgProd2.setBackground(new java.awt.Color(0, 0, 0));
        imgProd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgProd2ActionPerformed(evt);
            }
        });

        nomeProdTrans2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomeProdTrans2.setForeground(new java.awt.Color(255, 255, 255));
        nomeProdTrans2.setText("Nome do Produto");

        precoProdTrans2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoProdTrans2.setForeground(new java.awt.Color(255, 255, 255));
        precoProdTrans2.setText("R$00,00");

        buttonTransporte2.setText("Adicionar ao Carrinho");
        buttonTransporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransporte2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTransporte2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeProdTrans2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(precoProdTrans2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(imgProd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeProdTrans2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoProdTrans2)
                .addGap(18, 18, 18)
                .addComponent(buttonTransporte2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(16, 97, 218));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(16, 97, 218), 1, true));
        jPanel3.setForeground(new java.awt.Color(16, 97, 218));

        imgProd3.setBackground(new java.awt.Color(0, 0, 0));
        imgProd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgProd3ActionPerformed(evt);
            }
        });

        nomeProdTrans3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomeProdTrans3.setForeground(new java.awt.Color(255, 255, 255));
        nomeProdTrans3.setText("Nome do Produto");

        precoProdTrans3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoProdTrans3.setForeground(new java.awt.Color(255, 255, 255));
        precoProdTrans3.setText("R$00,00");

        buttonTransporte3.setText("Adicionar ao Carrinho");
        buttonTransporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransporte3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTransporte3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeProdTrans3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(precoProdTrans3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(imgProd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeProdTrans3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoProdTrans3)
                .addGap(18, 18, 18)
                .addComponent(buttonTransporte3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(351, 351, 351)
                        .addComponent(jLabel6)
                        .addContainerGap(403, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imgProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgProd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgProd1ActionPerformed

    private void buttonTransporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransporte1ActionPerformed
        C.insereCarrinho(P.pegaNome(2, "id", 1));
    }//GEN-LAST:event_buttonTransporte1ActionPerformed

    private void imgProd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgProd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgProd2ActionPerformed

    private void buttonTransporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransporte2ActionPerformed
        C.insereCarrinho(P.pegaNome(2, "id", 2));
    }//GEN-LAST:event_buttonTransporte2ActionPerformed

    private void imgProd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgProd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgProd3ActionPerformed

    private void buttonTransporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransporte3ActionPerformed
        C.insereCarrinho(P.pegaNome(2, "id", 3));
    }//GEN-LAST:event_buttonTransporte3ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Home home = new Home();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Transporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonTransporte1;
    private javax.swing.JButton buttonTransporte2;
    private javax.swing.JButton buttonTransporte3;
    private javax.swing.JButton imgProd1;
    private javax.swing.JButton imgProd2;
    private javax.swing.JButton imgProd3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel nomeProdTrans1;
    private javax.swing.JLabel nomeProdTrans2;
    private javax.swing.JLabel nomeProdTrans3;
    private javax.swing.JLabel precoProdTrans1;
    private javax.swing.JLabel precoProdTrans2;
    private javax.swing.JLabel precoProdTrans3;
    // End of variables declaration//GEN-END:variables
}
