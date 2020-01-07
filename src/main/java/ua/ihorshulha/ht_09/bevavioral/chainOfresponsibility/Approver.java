package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public abstract class Approver {

    public int sum;
    public Approver nextApprover;

    public Approver(int sum) {
        this.sum = sum;
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(Purchase purchase);
}
