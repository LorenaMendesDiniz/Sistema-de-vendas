package curso_programacao;

public class Produto {
    private String nome;
    private double precoCompra;
    private int quantidadeEstoque;

    public Produto(String nome, double precoCompra, int quantidadeEstoque) {
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço de Compra: R$" + precoCompra + ", Quantidade em Estoque: " + quantidadeEstoque;
    }
}

