package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public class Director extends Approver {

    Director(int sum) {
        super(sum);
    }

    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() < sum) {
            System.out.println("Director approved request #" + purchase.getNumber());
        } else if (nextApprover != null) {
            nextApprover.processRequest(purchase);
        }
    }
}
