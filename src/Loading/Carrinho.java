package Loading;
import conexoes.MySql;
import javax.swing.JOptionPane;
import objetos.Cliente;
import objetos.Produtos;


public class Carrinho extends javax.swing.JFrame {
    
    MySql conectar = new MySql();
    Produtos P = new Produtos();

    public Carrinho() {
        initComponents();
        this.conectar.conectaBanco();
       
        try {
            this.conectar.executarSQL("select id_produto from carrinho;");
            int i = 0;
            String retorno[] = {"", "", "", "", "", "", "", "", "", "", ""};
            while(this.conectar.getResultSet().next()){    
                retorno[i] = this.conectar.getResultSet().getString(1);
                i++;
            }    
            System.out.println(retorno[0]);
            
            produtoCarrinho1.setText(retorno[0] != "" ? P.pegaParaCarrinho("nome", retorno[0]) : " ");
            produtoCarrinho2.setText(retorno[1] != "" ? P.pegaParaCarrinho("nome", retorno[1]) : " ");
            produtoCarrinho3.setText(retorno[2] != "" ? P.pegaParaCarrinho("nome", retorno[2]) : " ");
            produtoCarrinho4.setText(retorno[3] != "" ? P.pegaParaCarrinho("nome", retorno[3]) : " ");
            produtoCarrinho5.setText(retorno[4] != "" ? P.pegaParaCarrinho("nome", retorno[4]) : " ");
            produtoCarrinho6.setText(retorno[5] != "" ? P.pegaParaCarrinho("nome", retorno[5]) : " ");
            
            precoProduto1.setText(retorno[0] != "" ? "R$" + P.pegaParaCarrinho("preco", retorno[0]) : " ");
            precoProduto2.setText(retorno[1] != "" ? "R$" + P.pegaParaCarrinho("preco", retorno[1]) : " ");
            precoProduto3.setText(retorno[2] != "" ? "R$" + P.pegaParaCarrinho("preco", retorno[2]) : " ");
            precoProduto4.setText(retorno[3] != "" ? "R$" + P.pegaParaCarrinho("preco", retorno[3]) : " ");
            precoProduto5.setText(retorno[4] != "" ? "R$" + P.pegaParaCarrinho("preco", retorno[4]) : " ");
            precoProduto6.setText(retorno[5] != "" ? "R$" + P.pegaParaCarrinho("preco", retorno[5]) : " ");
            
            int preco1 = retorno[0] != "" ? Integer.parseInt(P.pegaParaCarrinho("preco", retorno[0]).replace(".", "")) : 0;
            int preco2 = retorno[1] != "" ? Integer.parseInt(P.pegaParaCarrinho("preco", retorno[1]).replace(".", "")) : 0;
            int preco3 = retorno[2] != "" ? Integer.parseInt(P.pegaParaCarrinho("preco", retorno[2]).replace(".", "")) : 0;
            int preco4 = retorno[3] != "" ? Integer.parseInt(P.pegaParaCarrinho("preco", retorno[3]).replace(".", "")) : 0;
            int preco5 = retorno[4] != "" ? Integer.parseInt(P.pegaParaCarrinho("preco", retorno[4]).replace(".", "")) : 0;
            int preco6 = retorno[5] != "" ? Integer.parseInt(P.pegaParaCarrinho("preco", retorno[5]).replace(".", "")) : 0;
            
            int total = preco1 + preco2 + preco3 + preco4 + preco5 + preco6;
            valorTotal.setText("R$" + String.valueOf(total/100));
            
            
            
        } catch (Exception e) {            
            System.out.println("Erro ao buscar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto");
            
        }finally{
           this.conectar.fechaBanco();  
        }  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        valorTotal = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        precoProduto1 = new javax.swing.JLabel();
        produtoCarrinho1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        produtoCarrinho6 = new javax.swing.JLabel();
        precoProduto6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        produtoCarrinho2 = new javax.swing.JLabel();
        precoProduto2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        produtoCarrinho3 = new javax.swing.JLabel();
        precoProduto3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        produtoCarrinho4 = new javax.swing.JLabel();
        precoProduto4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        produtoCarrinho5 = new javax.swing.JLabel();
        precoProduto5 = new javax.swing.JLabel();
        Carrinho = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Finalizar Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 200, 52));

        valorTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valorTotal.setForeground(new java.awt.Color(16, 97, 218));
        valorTotal.setText("R$00.00");
        jPanel1.add(valorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 120, -1));

        Total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Total.setForeground(new java.awt.Color(16, 97, 218));
        Total.setText("Total:");
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 60, -1));

        precoProduto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        precoProduto1.setForeground(new java.awt.Color(16, 97, 218));
        precoProduto1.setText("R$00.00");

        produtoCarrinho1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho1.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho1.setText("Produto 1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtoCarrinho1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 582, Short.MAX_VALUE)
                .addComponent(precoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoProduto1)
                    .addComponent(produtoCarrinho1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 820, 60));

        produtoCarrinho6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho6.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho6.setText("Produto 6");

        precoProduto6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        precoProduto6.setForeground(new java.awt.Color(16, 97, 218));
        precoProduto6.setText("R$00.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtoCarrinho6, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(precoProduto6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtoCarrinho6)
                    .addComponent(precoProduto6))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 820, -1));

        produtoCarrinho2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho2.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho2.setText("Produto 2");

        precoProduto2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        precoProduto2.setForeground(new java.awt.Color(16, 97, 218));
        precoProduto2.setText("R$00.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtoCarrinho2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(precoProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtoCarrinho2)
                    .addComponent(precoProduto2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        produtoCarrinho3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho3.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho3.setText("Produto 3");

        precoProduto3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        precoProduto3.setForeground(new java.awt.Color(16, 97, 218));
        precoProduto3.setText("R$00.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtoCarrinho3, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(precoProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtoCarrinho3)
                    .addComponent(precoProduto3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        produtoCarrinho4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho4.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho4.setText("Produto 4");

        precoProduto4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        precoProduto4.setForeground(new java.awt.Color(16, 97, 218));
        precoProduto4.setText("R$00.00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtoCarrinho4, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(precoProduto4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtoCarrinho4)
                    .addComponent(precoProduto4))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 820, -1));

        produtoCarrinho5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho5.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho5.setText("Produto 5");

        precoProduto5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        precoProduto5.setForeground(new java.awt.Color(16, 97, 218));
        precoProduto5.setText("R$00.00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtoCarrinho5, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(precoProduto5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtoCarrinho5)
                    .addComponent(precoProduto5))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 820, -1));

        Carrinho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Carrinho.setForeground(new java.awt.Color(16, 97, 218));
        Carrinho.setText("Carrinho");
        jPanel1.add(Carrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 97, 218));
        jLabel5.setText("<");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Home home = new Home();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carrinho;
    private javax.swing.JLabel Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel precoProduto1;
    private javax.swing.JLabel precoProduto2;
    private javax.swing.JLabel precoProduto3;
    private javax.swing.JLabel precoProduto4;
    private javax.swing.JLabel precoProduto5;
    private javax.swing.JLabel precoProduto6;
    private javax.swing.JLabel produtoCarrinho1;
    private javax.swing.JLabel produtoCarrinho2;
    private javax.swing.JLabel produtoCarrinho3;
    private javax.swing.JLabel produtoCarrinho4;
    private javax.swing.JLabel produtoCarrinho5;
    private javax.swing.JLabel produtoCarrinho6;
    private javax.swing.JLabel valorTotal;
    // End of variables declaration//GEN-END:variables
}
