package Model;

public class ProdutoSimples extends Produto {
    public ProdutoSimples(String nome, double preco) {
        super(nome, preco);
    }

    public void exibirDetalhes() {
        System.out.println("Produto Simples: " + nome + ", Preço: " + preco);
    }
}
