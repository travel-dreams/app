
package objetos;

import conexoes.MySql;
import javax.swing.JOptionPane;

public class CarrinhoCadastra {
    
    MySql conectar = new MySql();
    
    public String insereCarrinho(String id_produto){
        this.conectar.conectaBanco();
        
        try {
                        
            this.conectar.cadastraUsuario("INSERT INTO carrinho values (1, " + id_produto + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar produto no carrinho " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto no carrinho");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Carrinho atualizado com sucesso");
            //novoCliente.limpaCliente();
        }    
        
        return null;
    }
    
}
