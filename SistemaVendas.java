package curso_programacao;
import java.util.ArrayList;
import java.util.List;

public class SistemaVendas {
    private List<Produto> produtos;

    public SistemaVendas() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public static void main(String[] args) {
        SistemaVendas sistemaVendas = new SistemaVendas();

        Produto produto1 = new Produto("arroz", 2.50, 100);
        Produto produto2 = new Produto("feijão", 10.20, 50);

        sistemaVendas.adicionarProduto(produto1);
        sistemaVendas.adicionarProduto(produto2);

        sistemaVendas.exibirProdutos();
    }
}