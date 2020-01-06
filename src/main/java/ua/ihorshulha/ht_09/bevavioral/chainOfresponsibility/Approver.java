package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public abstract class Approver {
    public Approver approver;

    public Approver(Approver approver) {
        this.approver = approver;
    }

    public void processRequest(Purchase purchase, double sum){
        if (purchase.getAmount() < sum) {
            write(purchase);
        }
        if (approver != null) {
            approver.processRequest(purchase, sum);
        }
    }

    public abstract void write(Purchase purchase);
}
