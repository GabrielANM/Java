package Lista2_Exercicio2;

public class Item {
    private Integer numeroDoItem;
    private String descricao;
    private Integer quantidadeComprada;
    private Double preco;

    public Integer getNumeroDoItem() {
        return numeroDoItem;
    }

    public void setNumeroDoItem(Integer numeroDoItem) {
        this.numeroDoItem = numeroDoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(Integer quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Item(Integer numeroDoItem, String descricao, Integer quantidadeComprada, Double preco) {
        this.numeroDoItem = numeroDoItem;
        this.descricao = descricao;

        if (quantidadeComprada > 0) {
        this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }

        if (preco > 0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "numeroDoItem=" + numeroDoItem +
                ", descricao='" + descricao + '\'' +
                ", quantidadeComprada=" + quantidadeComprada +
                ", preco=" + preco +
                '}';
    }
}
