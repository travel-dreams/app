
package Loading;
import objetos.Produtos;
import objetos.CarrinhoCadastra;
import conexoes.MySql;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Restaurantes extends javax.swing.JFrame {

    Produtos P = new Produtos();
    CarrinhoCadastra C = new CarrinhoCadastra();
    
    public Restaurantes() {
        initComponents();
        String nome1 = this.P.pegaNome(4, "nome",1);
        nomeProdRes1.setText(nome1);
        
        String nome2 = this.P.pegaNome(4, "nome",2);
        nomeProdRes2.setText(nome2);
        
        String nome3 = this.P.pegaNome(4, "nome",3);
        nomeProdRes3.setText(nome3);
    
        String preco1 = this.P.pegaNome(4, "preco",1);
        precoProdRes1.setText(preco1);
        
        String preco2 = this.P.pegaNome(4, "preco",2);
        precoProdRes2.setText(preco2);
        
        String preco3 = this.P.pegaNome(4, "preco",3);
        precoProd3.setText(preco3);
    
        String img1 = this.P.pegaNome(4, "imagem",1);
        System.out.print(img1);
        imgProd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loading/" + img1)));
        
        String img2 = this.P.pegaNome(4, "imagem",2);
        System.out.print(img2);
        imgProd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loading/" + img2 )));
        
        String img3 = this.P.pegaNome(4, "imagem",3);
        System.out.print(img3);
        imgProd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loading/" + img3 )));
        
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        imgProd1 = new javax.swing.JButton();
        nomeProdRes1 = new javax.swing.JLabel();
        precoProdRes1 = new javax.swing.JLabel();
        buttonRestaurante1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        imgProd2 = new javax.swing.JButton();
        nomeProdRes2 = new javax.swing.JLabel();
        precoProdRes2 = new javax.swing.JLabel();
        buttonRestaurante2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nomeProdRes3 = new javax.swing.JLabel();
        precoProd3 = new javax.swing.JLabel();
        buttonRestaurante3 = new javax.swing.JButton();
        imgProd3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(16, 97, 218));
        jLabel6.setText("Restaurantes");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 97, 218));
        jLabel5.setText("<");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(16, 97, 218));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(16, 97, 218), 1, true));
        jPanel8.setForeground(new java.awt.Color(16, 97, 218));

        imgProd1.setBackground(new java.awt.Color(0, 0, 0));
        imgProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgProd1ActionPerformed(evt);
            }
        });

        nomeProdRes1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomeProdRes1.setForeground(new java.awt.Color(255, 255, 255));
        nomeProdRes1.setText("Nome do Produto");

        precoProdRes1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoProdRes1.setForeground(new java.awt.Color(255, 255, 255));
        precoProdRes1.setText("R$00,00");

        buttonRestaurante1.setText("Adicionar ao Carrinho");
        buttonRestaurante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestaurante1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRestaurante1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeProdRes1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(precoProdRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(imgProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeProdRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(precoProdRes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRestaurante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        nomeProdRes2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomeProdRes2.setForeground(new java.awt.Color(255, 255, 255));
        nomeProdRes2.setText("Nome do Produto");

        precoProdRes2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoProdRes2.setForeground(new java.awt.Color(255, 255, 255));
        precoProdRes2.setText("R$00,00");

        buttonRestaurante2.setText("Adicionar ao Carrinho");
        buttonRestaurante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestaurante2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeProdRes2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(buttonRestaurante2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(precoProdRes2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeProdRes2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(precoProdRes2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRestaurante2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(16, 97, 218));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(16, 97, 218), 1, true));
        jPanel3.setForeground(new java.awt.Color(16, 97, 218));

        nomeProdRes3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomeProdRes3.setForeground(new java.awt.Color(255, 255, 255));
        nomeProdRes3.setText("Nome do Produto");

        precoProd3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoProd3.setForeground(new java.awt.Color(255, 255, 255));
        precoProd3.setText("R$00,00");

        buttonRestaurante3.setText("Adicionar ao Carrinho");
        buttonRestaurante3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRestaurante3MouseClicked(evt);
            }
        });
        buttonRestaurante3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestaurante3ActionPerformed(evt);
            }
        });

        imgProd3.setBackground(new java.awt.Color(0, 0, 0));
        imgProd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgProd3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRestaurante3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeProdRes3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precoProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(imgProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeProdRes3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(precoProd3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRestaurante3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(338, 338, 338)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imgProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgProd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgProd1ActionPerformed

    private void buttonRestaurante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestaurante1ActionPerformed
        // Insere produto 1 no carrinho
        C.insereCarrinho(P.pegaNome(4, "id", 1));
    }//GEN-LAST:event_buttonRestaurante1ActionPerformed

    private void imgProd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgProd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgProd2ActionPerformed

    private void buttonRestaurante2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestaurante2ActionPerformed
        // Insere produto 1 no carrinho
        C.insereCarrinho(P.pegaNome(4, "id", 2));
    }//GEN-LAST:event_buttonRestaurante2ActionPerformed

    private void imgProd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgProd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgProd3ActionPerformed

    private void buttonRestaurante3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestaurante3ActionPerformed
        C.insereCarrinho(P.pegaNome(4, "id", 3));
    }//GEN-LAST:event_buttonRestaurante3ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Home home = new Home();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void buttonRestaurante3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRestaurante3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRestaurante3MouseClicked

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
            java.util.logging.Logger.getLogger(Restaurantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRestaurante1;
    private javax.swing.JButton buttonRestaurante2;
    private javax.swing.JButton buttonRestaurante3;
    private javax.swing.JButton imgProd1;
    private javax.swing.JButton imgProd2;
    private javax.swing.JButton imgProd3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel nomeProdRes1;
    private javax.swing.JLabel nomeProdRes2;
    private javax.swing.JLabel nomeProdRes3;
    private javax.swing.JLabel precoProd3;
    private javax.swing.JLabel precoProdRes1;
    private javax.swing.JLabel precoProdRes2;
    // End of variables declaration//GEN-END:variables
}
