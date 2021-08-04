package Origem;


public class Produto {
    private int idProduto;
    private String nome;
    private Double preco;
    private int quantidade_Estoque;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade_Estoque() {
        return quantidade_Estoque;
    }

    public void setQuantidade_Estoque(int quantidade_Estoque) {
        this.quantidade_Estoque = quantidade_Estoque;
    }
}
