package tarefasEBAC.modulo15.factory;

public interface IAbstractFactory<T> {

    T criar(String tipo);
}
