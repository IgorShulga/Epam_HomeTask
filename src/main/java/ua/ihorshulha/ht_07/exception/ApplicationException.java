package ua.ihorshulha.ht_07.exception;

public class ApplicationException extends Exception {

    private String messageOfException;

    public ApplicationException(String messageOfException) {
        this.messageOfException = messageOfException;
        System.out.println(messageOfException);
    }
}
