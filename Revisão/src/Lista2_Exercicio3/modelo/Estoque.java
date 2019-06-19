package Lista2_Exercicio3.modelo;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(Integer qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public Integer getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(Integer qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        if (qtdAtual > 0) {
            this.qtdAtual = qtdAtual;
        }
        if (qtdMinima > 0) {
            this.qtdMinima = qtdMinima;
        }
    }

    public Estoque() {
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "nome='" + nome + '\'' +
                ", qtdAtual=" + qtdAtual +
                ", qtdMinima=" + qtdMinima +
                '}';
    }

    public void mudarNome (String nome) {
        this.nome = nome;
    }
    public void mudarQtdMinima (Integer qtdMinima) {
        this.qtdMinima -= qtdMinima;
    }

    public void repor (Integer qtd) {
        this.qtdAtual += qtd;
    }

    public void darBaixa (Integer qtd) {
        this.qtdAtual -= qtd;
    }

    public String mostra() {
        return "Nome do produto: " + this.nome + ", quantidado minima " + this.qtdMinima + ", Quantidado atual " + this.qtdAtual;
    }

    public Boolean precisaRepor () {
        if (qtdAtual <= qtdMinima) {
            return true;
        } else {
            return false;
        }
    }





}
