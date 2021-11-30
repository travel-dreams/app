
package objetos;

public class Produto {
    //atributos
    private String id_categoria = "";
    private String nome = "";
    private String imagem = "";
    private String descricao = "";
    private String preco = "";
    private String preco_promocional = "";

    
     public String getId_Categoria() {
        return id_categoria;
    }

    public void setId_Categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getPreco_Promocional() {
        return preco_promocional;
    }

    public void setPreco_Promocional(String preco_promocional) {
        this.preco_promocional = preco_promocional;
    }

    
    public void limpaProduto(){
    id_categoria = "";
    nome = "";
    imagem = "";
    descricao = "";
    preco = "";
    preco_promocional = "";
    }   

}


