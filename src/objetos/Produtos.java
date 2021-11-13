
package objetos;

import Loading.Home;
import javax.swing.JOptionPane;
import conexoes.MySql;
import java.util.Arrays;


public class Produtos {
    
    MySql conectar = new MySql();
    // public String nome;

    public String pegaNome(int id, String campo, int id_produto){
        this.conectar.conectaBanco();
        int valor = id;
        int i = 0;
        String retorno1 = null;
        String retorno2 = null;
        String retorno3 = null;
        String retorno = null;
        try {
            this.conectar.executarSQL("select " + campo + " from produtos join categoria on produtos.id_categoria = categoria.id_categoria where categoria.id_categoria = " + valor + ";");
            
            while(this.conectar.getResultSet().next()){    
                if(i == 0){
                  retorno1 = this.conectar.getResultSet().getString(1);  
                }else if(i == 1){
                 retorno2 = this.conectar.getResultSet().getString(1);   
                }else{
               retorno3 = this.conectar.getResultSet().getString(1);
                }
               System.out.print(retorno);
              i++;
            }    
            
            switch(id_produto){
                case 1:
                    retorno = retorno1;
                    break;
                case 2:
                    retorno = retorno2;
                    break;
                case 3:
                    retorno = retorno3;
                    break;
            }
          
        } catch (Exception e) {            
            System.out.println("Erro ao buscar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto");
            
        }finally{
           this.conectar.fechaBanco();  
        }  
         System.out.print(retorno);
        return retorno;
    }
    
    public String pegaParaCarrinho(String campo, String id ){
        this.conectar.conectaBanco();
        
        String retornoCarrinho = null;
        try {
            this.conectar.executarSQL("select " + campo + " from produtos where id = " + id);
            
            while(this.conectar.getResultSet().next()){    
                
                retornoCarrinho = this.conectar.getResultSet().getString(1);  
         
            }    
            
          
        } catch (Exception e) {            
            System.out.println("Erro ao buscar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto");
            
        }finally{
           this.conectar.fechaBanco();  
        }  
         System.out.print(retornoCarrinho);
        return retornoCarrinho;
    }
 
}

