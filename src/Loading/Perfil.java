
package Loading;

import javax.swing.JOptionPane;
import conexoes.MySql;


public class Perfil extends javax.swing.JFrame {

    MySql conectar = new MySql();

    public Perfil() {
        initComponents();
        atualizaDadosNaTela();
    }
    
    public void atualizaDadosNaTela(){
        this.conectar.conectaBanco();
        try {
            this.conectar.executarSQL("select cpfLogado from usuarioLogado;");
            String cpfLogado = "";
            while(this.conectar.getResultSet().next()){    
                cpfLogado = this.conectar.getResultSet().getString(1);
            }    
            System.out.println(cpfLogado);
            
                try{                
                    this.conectar.executarSQL("SELECT nome, cpf, email, usuario, telefone FROM usuario WHERE cpf=" + cpfLogado );

                    while(this.conectar.getResultSet().next()){    
                        String nomeLogado = this.conectar.getResultSet().getString(1);
                        String cpfLogadoBanco = this.conectar.getResultSet().getString(2);
                        String emailLogado = this.conectar.getResultSet().getString(3);
                        String usuarioLogado = this.conectar.getResultSet().getString(4);
                        String telefoneLogado = this.conectar.getResultSet().getString(5);

                        perfilNome.setText(nomeLogado);
                        perfilCpf.setText(cpfLogadoBanco);
                        perfilEmail.setText(emailLogado);
                        perfilUsuario.setText(usuarioLogado);
                        perfilTelefone.setText(telefoneLogado);
                        nomeNoPerfil.setText(nomeLogado);

                    }   

                } catch (Exception e) {    

                    System.out.println("Erro ao consultar cliente " +  e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro ao buscar dados do perfil");

                }finally{

                }  

        } catch (Exception e) {            
            System.out.println("Erro ao buscar cliente logado " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente logado");
            
        }finally{
            this.conectar.fechaBanco();  
        }  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nomeNoPerfil = new javax.swing.JLabel();
        Carrinho2 = new javax.swing.JLabel();
        perfilNome = new javax.swing.JTextField();
        perfilEmail = new javax.swing.JTextField();
        perfilCpf = new javax.swing.JTextField();
        perfilTelefone = new javax.swing.JTextField();
        perfilUsuario = new javax.swing.JTextField();
        atualizarDados = new javax.swing.JButton();
        Carrinho3 = new javax.swing.JLabel();
        Carrinho4 = new javax.swing.JLabel();
        Carrinho5 = new javax.swing.JLabel();
        Carrinho6 = new javax.swing.JLabel();
        Carrinho7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 97, 218));
        jLabel5.setText("<");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        nomeNoPerfil.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nomeNoPerfil.setForeground(new java.awt.Color(16, 97, 218));
        nomeNoPerfil.setText("Nome");

        Carrinho2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Carrinho2.setForeground(new java.awt.Color(16, 97, 218));
        Carrinho2.setText("Perfil");

        perfilNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        perfilEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        perfilCpf.setEditable(false);
        perfilCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        perfilUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        atualizarDados.setText("Atualizar Dados");
        atualizarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizarDadosMouseClicked(evt);
            }
        });
        atualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarDadosActionPerformed(evt);
            }
        });

        Carrinho3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Carrinho3.setForeground(new java.awt.Color(16, 97, 218));
        Carrinho3.setText("Nome");

        Carrinho4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Carrinho4.setForeground(new java.awt.Color(16, 97, 218));
        Carrinho4.setText("CPF");

        Carrinho5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Carrinho5.setForeground(new java.awt.Color(16, 97, 218));
        Carrinho5.setText("Telefone");

        Carrinho6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Carrinho6.setForeground(new java.awt.Color(16, 97, 218));
        Carrinho6.setText("Usuário");

        Carrinho7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Carrinho7.setForeground(new java.awt.Color(16, 97, 218));
        Carrinho7.setText("E-mail");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loading/imgs/fotoPerfil.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(perfilTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(perfilEmail)
                                .addComponent(perfilNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(perfilUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                                .addComponent(perfilCpf)
                                .addComponent(Carrinho3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Carrinho4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carrinho5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Carrinho6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Carrinho7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(343, 343, 343)
                        .addComponent(Carrinho2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(atualizarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeNoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeNoPerfil)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(Carrinho3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(perfilNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(Carrinho4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(perfilCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(Carrinho2)))
                        .addGap(18, 18, 18)
                        .addComponent(Carrinho7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perfilEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addComponent(Carrinho6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(Carrinho5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perfilTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Home home = new Home();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void atualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarDadosActionPerformed

    }//GEN-LAST:event_atualizarDadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atualizarDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarDadosMouseClicked
        String nomeDigitado = perfilNome.getText();
        String emailDigitado = perfilEmail.getText();
        String usuarioDigitado = perfilUsuario.getText();
        String telefoneDigitado = perfilTelefone.getText();
        this.conectar.conectaBanco();
        try{   
        
            conectar.atualizaUsuario("UPDATE usuario SET "
                    + "nome='"+nomeDigitado+"',"
                    + " email='"+emailDigitado+"',"
                    + " usuario='"+usuarioDigitado+"',"
                    + " telefone='"+telefoneDigitado+"'");
            }
            
        catch (Exception e) {  
            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados do perfil");

        }finally{
            atualizaDadosNaTela();
            this.conectar.fechaBanco();
        }  
        
        
    }//GEN-LAST:event_atualizarDadosMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carrinho2;
    private javax.swing.JLabel Carrinho3;
    private javax.swing.JLabel Carrinho4;
    private javax.swing.JLabel Carrinho5;
    private javax.swing.JLabel Carrinho6;
    private javax.swing.JLabel Carrinho7;
    private javax.swing.JButton atualizarDados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nomeNoPerfil;
    private javax.swing.JTextField perfilCpf;
    private javax.swing.JTextField perfilEmail;
    private javax.swing.JTextField perfilNome;
    private javax.swing.JTextField perfilTelefone;
    private javax.swing.JTextField perfilUsuario;
    // End of variables declaration//GEN-END:variables
}
