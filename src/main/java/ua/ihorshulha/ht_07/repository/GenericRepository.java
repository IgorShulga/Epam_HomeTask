package ua.ihorshulha.ht_07.repository;

import ua.ihorshulha.ht_07.exception.ApplicationException;

import java.util.List;

public interface GenericRepository<ID, T> {

    void save(T t) throws ApplicationException;

    void update(ID id);

    void remove(ID id);

    T getById (ID id);

    List<T> getAll();
}
