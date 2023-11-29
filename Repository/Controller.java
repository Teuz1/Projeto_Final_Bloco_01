package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Produto;
import Model.Repository;

public class Controller implements Repository<Produto> {
    private List<Produto> produtos;

    public Controller() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void adicionar(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo");
        }
        produtos.add(produto);
    }

    @Override
    public Produto buscar(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Produto produtoAtualizado) {
        if (produtoAtualizado == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo");
        }
        if (!produtos.contains(produtoAtualizado)) {
            throw new IllegalArgumentException("Produto não encontrado");
        }
        int index = produtos.indexOf(produtoAtualizado);
        produtos.set(index, produtoAtualizado);
    }

    @Override
    public void remover(String nome) {
        produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
    }

    // Método adicional para listar todos os produtos
    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }
}
