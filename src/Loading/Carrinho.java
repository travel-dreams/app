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
        
        String retorno = null;
        try {
            this.conectar.executarSQL("select id_produto from carrinho");
            
            while(this.conectar.getResultSet().next()){    
                retorno = this.conectar.getResultSet().getString(1);
            }    
            produtoCarrinho1.setText(P.pegaParaCarrinho("nome", retorno));
            
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
        produtoCarrinho1 = new javax.swing.JLabel();
        produtoCarrinho4 = new javax.swing.JLabel();
        produtoCarrinho2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        produtoCarrinho3 = new javax.swing.JLabel();
        produtoCarrinho5 = new javax.swing.JLabel();
        valorTotal = new javax.swing.JLabel();
        produtoCarrinho6 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        produtoCarrinho7 = new javax.swing.JLabel();
        produtoCarrinho8 = new javax.swing.JLabel();
        produtoCarrinho10 = new javax.swing.JLabel();
        produtoCarrinho9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        produtoCarrinho1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho1.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho1.setText("Produto 1");

        produtoCarrinho4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho4.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho4.setText("Produto 4");

        produtoCarrinho2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho2.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho2.setText("Produto 2");

        jButton1.setText("Finalizar Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        produtoCarrinho3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho3.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho3.setText("Produto 3");

        produtoCarrinho5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho5.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho5.setText("Produto 5");

        valorTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valorTotal.setForeground(new java.awt.Color(16, 97, 218));
        valorTotal.setText("R$00.00");

        produtoCarrinho6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho6.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho6.setText("Produto 6");

        Total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Total.setForeground(new java.awt.Color(16, 97, 218));
        Total.setText("Total:");

        produtoCarrinho7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho7.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho7.setText("Produto 7");

        produtoCarrinho8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho8.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho8.setText("Produto 8");

        produtoCarrinho10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho10.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho10.setText("Produto 10");

        produtoCarrinho9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produtoCarrinho9.setForeground(new java.awt.Color(16, 97, 218));
        produtoCarrinho9.setText("Produto 9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(produtoCarrinho1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtoCarrinho2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtoCarrinho3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtoCarrinho4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtoCarrinho5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtoCarrinho6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtoCarrinho7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtoCarrinho8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtoCarrinho10, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(produtoCarrinho9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(713, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTotal))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(produtoCarrinho1)
                .addGap(18, 18, 18)
                .addComponent(produtoCarrinho2)
                .addGap(18, 18, 18)
                .addComponent(produtoCarrinho3)
                .addGap(18, 18, 18)
                .addComponent(produtoCarrinho4)
                .addGap(18, 18, 18)
                .addComponent(produtoCarrinho5)
                .addGap(18, 18, 18)
                .addComponent(produtoCarrinho6)
                .addGap(18, 18, 18)
                .addComponent(produtoCarrinho7)
                .addGap(18, 18, 18)
                .addComponent(produtoCarrinho8)
                .addGap(18, 18, 18)
                .addComponent(produtoCarrinho9)
                .addGap(18, 18, 18)
                .addComponent(produtoCarrinho10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorTotal)
                    .addComponent(Total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel produtoCarrinho1;
    private javax.swing.JLabel produtoCarrinho10;
    private javax.swing.JLabel produtoCarrinho2;
    private javax.swing.JLabel produtoCarrinho3;
    private javax.swing.JLabel produtoCarrinho4;
    private javax.swing.JLabel produtoCarrinho5;
    private javax.swing.JLabel produtoCarrinho6;
    private javax.swing.JLabel produtoCarrinho7;
    private javax.swing.JLabel produtoCarrinho8;
    private javax.swing.JLabel produtoCarrinho9;
    private javax.swing.JLabel valorTotal;
    // End of variables declaration//GEN-END:variables
}
