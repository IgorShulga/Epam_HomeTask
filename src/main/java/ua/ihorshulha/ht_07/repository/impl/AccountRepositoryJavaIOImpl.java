package ua.ihorshulha.ht_07.repository.impl;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Account;
import ua.ihorshulha.ht_07.repository.AccountRepository;

import java.io.IOException;
import java.util.List;

public class AccountRepositoryJavaIOImpl implements AccountRepository {
    @Override
    public Account save(Account account) throws ApplicationException {
        return null;
    }

    @Override
    public void update(Long aLong) throws IOException {

    }

    @Override
    public void remove(Long aLong) {

    }

    @Override
    public Account getById(Long aLong) {
        return null;
    }

    @Override
    public List<Account> getAll() {
        return null;
    }
}
