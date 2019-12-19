package ua.ihorshulha.ht_07.model;

public enum AccountStatus {

    ACTIVE(1), BANNED(2), DELETED(3);

    private int status;

    AccountStatus(int id) {
        this.status = id;
    }

    public int getAccountStatus() {
        return this.status;
    }
}
