package Model;

public interface Repository<T> {
    void adicionar(T item);
    T buscar(String nome);
    void atualizar(T item);
    void remover(String nome);
}
