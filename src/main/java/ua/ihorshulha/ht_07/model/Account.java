package ua.ihorshulha.ht_07.model;

import java.util.Objects;

public class Account {

    private Long id;
    private AccountStatus status;

    public Account(Long id, AccountStatus status) {
        this.id = id;
        this.status = status;
    }

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public enum AccountStatus {
        ACTIVE, BANNED, DELETED;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) &&
                status == account.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}
