package ua.ihorshulha.ht_07.repository;

public interface GenericRepository<T, Id> {

    void save(T t);

    T update(Id id);

    void remove(Id id);

    T getById (Id id);

    void getAll();
}
