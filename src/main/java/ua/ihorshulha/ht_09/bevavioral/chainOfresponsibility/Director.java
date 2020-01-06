package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public class Director extends Approver {

    public Director(Approver approver) {
        super(approver);
    }

    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() < 25000.0) {
            System.out.println(this.getClass().getSimpleName() + " approved request #" + purchase.getNumber());
        } else if (approver != null) {
            approver.processRequest(purchase);
        }
    }
}
