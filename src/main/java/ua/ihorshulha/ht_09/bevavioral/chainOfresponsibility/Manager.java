package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public class Manager extends Approver {

    public Manager(int sum) {
        super(sum);
    }

    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() < sum) {
            System.out.println("Manager approved request #" + purchase.getNumber());
        } else if (nextApprover != null) {
            nextApprover.processRequest(purchase);
        }
    }
}
