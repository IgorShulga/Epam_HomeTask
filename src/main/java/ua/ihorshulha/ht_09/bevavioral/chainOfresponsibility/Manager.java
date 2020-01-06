package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public class Manager extends Approver {
    public Manager(Approver approver) {
        super(approver);
    }

    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() < 1000.0) {
            System.out.println(this.getClass().getSimpleName() + " approved request #" + purchase.getNumber());
        } else if (approver != null) {
            approver.processRequest(purchase);
        }
    }
}
