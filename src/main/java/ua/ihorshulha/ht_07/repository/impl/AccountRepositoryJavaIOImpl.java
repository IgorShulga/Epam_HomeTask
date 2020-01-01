package ua.ihorshulha.ht_07.repository.impl;

import ua.ihorshulha.ht_07.model.Account;
import ua.ihorshulha.ht_07.repository.AccountRepository;
import ua.ihorshulha.ht_07.utils.InputFromKeyboard;
import ua.ihorshulha.ht_07.utils.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static ua.ihorshulha.ht_07.utils.Constants.*;

public class AccountRepositoryJavaIOImpl implements AccountRepository {

    private InputFromKeyboard inputFromKeyboard = new InputFromKeyboard();
    private ReadAndWriteFile workFile = new ReadAndWriteFile();


    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public void update(Long id) throws IOException {
        List<Account> allAcc = getAll();
        for (int i = 0; i < allAcc.size(); i++) {
            if (id.equals(allAcc.get(i).getId())) {
                allAcc.get(i).setAccountStatus(inputNewStatus(allAcc));
            }
        }
        String collect = allAcc.stream().map(Objects::toString).collect(Collectors.joining(SPLIT_OBJECTS));
        workFile.writeToFile(SET_PATH + ACCOUNT_FILE, collect);
    }

    private Account.AccountStatus inputNewStatus(List<Account> allAcc) throws IOException {
        Account.AccountStatus newStatus = null;
        Account.AccountStatus[] values = Account.AccountStatus.values();
        allAcc.forEach(System.out::println);
        System.out.println("Enter new name status...");
        String input = null;
        do {
            System.out.println("Name must not be empty or null.");
            input = inputFromKeyboard.input();
        } while (Objects.isNull(input) || input.isEmpty());
        for(Account.AccountStatus status : values){
            if(input.equalsIgnoreCase(String.valueOf(status)));
            newStatus = status;
        }
        return newStatus;
    }

    @Override
    public void remove(Long id) {
        ReadAndWriteFile file = new ReadAndWriteFile();
        List<String> strings = file.readFromFile(SET_PATH + ACCOUNT_FILE);
        strings.removeIf(s -> (id == Long.parseLong(s.split(SPLIT_FIELDS)[0].trim())));
        String str = String.join(SPLIT_OBJECTS, strings);
        file.writeToFile(SET_PATH + ACCOUNT_FILE, str);
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
                account.setAccountStatus(Account.AccountStatus.valueOf(str.split(SPLIT_FIELDS)[1].trim()));
            }
        }
        return account;
    }

    @Override
    public List<Account> getAll() {
        ReadAndWriteFile workFile = new ReadAndWriteFile();
        List<String> dateFile = workFile.readFromFile(SET_PATH + ACCOUNT_FILE);
        List<Account> list = new ArrayList<>();
        for (String s : dateFile) {
            Account account = new Account();
            account.setId(Long.parseLong(s.split(SPLIT_FIELDS)[0].trim()));
            account.setAccountStatus(Account.AccountStatus.valueOf(s.split(SPLIT_FIELDS)[1].trim()));
            list.add(account);
        }
        return list;
    }
}
