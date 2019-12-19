package ua.ihorshulha.ht_07.controller;

import ua.ihorshulha.ht_07.model.Account;
import ua.ihorshulha.ht_07.repository.impl.AccountRepositoryJavaIOImpl;

import java.util.List;

public class AcountController {

private final AccountRepositoryJavaIOImpl accountRepo = new AccountRepositoryJavaIOImpl();


    public void getAllAccounts() {
        System.out.println("List all accounts: ");
        List<Account> all = accountRepo.getAll();
        all.stream().forEach(System.out::println);
    }

    public void getAccountById(String input) {
    }

    public void addAccount(String input) {
    }

    public void updateAccountById(String input) {
    }

    public void removeAccountById(String input) {

    }
}
