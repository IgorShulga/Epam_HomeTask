package ua.ihorshulha.ht_07.repository;

import ua.ihorshulha.ht_07.exception.ApplicationException;

import java.io.IOException;
import java.util.List;

public interface GenericRepository<ID, T> {

    void save(T t) throws ApplicationException;

    void update(ID id) throws IOException;

    void remove(ID id);

    T getById (ID id);

    List<T> getAll();
}
