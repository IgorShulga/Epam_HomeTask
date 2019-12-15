package ua.ihorshulha.ht_07.controller;

import ua.ihorshulha.ht_07.model.Account;
import ua.ihorshulha.ht_07.repository.impl.AccountRepositoryImpl;

import java.io.BufferedReader;
import java.util.List;

public class AcountController {

private final AccountRepositoryImpl accountRepo = new AccountRepositoryImpl();


    public void getAllAccounts() {
        System.out.println("List all accounts: ");
        List<Account> all = accountRepo.getAll();
        all.stream().forEach(System.out::println);
    }

    public void getAccountById(BufferedReader inputKeyboard) {
    }

    public void addAccount(BufferedReader inputKeyboard) {
    }

    public void updateAccountById(BufferedReader inputKeyboard) {
    }

    public void removeAccountById(BufferedReader inputKeyboard) {

    }
}
