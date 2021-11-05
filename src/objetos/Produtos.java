
package objetos;

import Loading.Home;
import javax.swing.JOptionPane;
import conexoes.MySql;
import java.sql.SQLException;
import java.util.Arrays;


public class Produtos {
    
    MySql conectar = new MySql();

    public String[][] pegaProdutos(int id){
        this.conectar.conectaBanco();
        int valor = id;
                try {
            this.conectar.executarSQL("select nome, preco, nome_categoria, imagem, id, descricao from produtos join categoria on produtos.id_categoria = categoria.id_categoria where categoria.id_categoria = " + valor + ";");
            
            
            String produto[][] = null;
            int i = 0;
            while(this.conectar.getResultSet().next()){    
               String nome = this.conectar.getResultSet().getString(1);
               float preco = this.conectar.getResultSet().getFloat(2);
               String nome_categoria = this.conectar.getResultSet().getString(3);
               String imagem = this.conectar.getResultSet().getString(4);
               int id2 = this.conectar.getResultSet().getInt(5);
               String descricao = this.conectar.getResultSet().getString(6);
                           
             produto[i][0] = nome;
             produto[i][1] = String.valueOf(preco);
             produto[i][2] = nome_categoria;
             produto[i][3] = imagem;
             produto[i][4] = String.valueOf(id2);
             produto[i][5] = descricao;
              i++;
              
              System.out.println(nome);
            }    
        } catch (SQLException e) {            
            System.out.println("Erro ao buscar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto");
            
        }finally{
            this.conectar.fechaBanco();  
        }  
        return null;
    
    
}
}

