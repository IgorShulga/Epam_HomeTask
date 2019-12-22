package ua.ihorshulha.ht_07.repository.impl;

import ua.ihorshulha.ht_07.exception.ApplicationException;
import ua.ihorshulha.ht_07.model.Account;
import ua.ihorshulha.ht_07.model.AccountStatus;
import ua.ihorshulha.ht_07.repository.AccountRepository;
import ua.ihorshulha.ht_07.utils.ReadAndWriteFile;

import java.io.IOException;
import java.util.List;

import static ua.ihorshulha.ht_07.utils.Constants.*;

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
    public Account getById(Long id) {
        ReadAndWriteFile workFile = new ReadAndWriteFile();
        List<String> dateFile = workFile.readFromFile(SET_PATH + ACCOUNT_FILE);
        Account account = new Account();
        for (String str : dateFile) {
            long idFromFile = Long.parseLong(str.split(SPLIT_FIELDS)[0].trim());
            if (idFromFile == id) {
                account.setId(Long.parseLong(str.split(SPLIT_FIELDS)[0].trim()));
                account.setAccountStatus(AccountStatus.valueOf(str.split(SPLIT_FIELDS)[1].trim()));
            }
        }
        return account;
    }

    @Override
    public List<Account> getAll() {
        return null;
    }
}
