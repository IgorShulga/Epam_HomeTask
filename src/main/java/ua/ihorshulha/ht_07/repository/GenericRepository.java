package ua.ihorshulha.ht_07.repository;

import java.util.List;

public interface GenericRepository<T, ID> {

    void save(T t);

    void update(ID id);

    void remove(ID id);

    T getById (ID id);

    List<T> getAll();
}
