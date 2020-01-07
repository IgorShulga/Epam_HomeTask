package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public class President extends Approver {

    President(int sum) {
        super(sum);
    }

    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() < sum) {
            System.out.println("President approved request #" + purchase.getNumber());
        } else {
            System.out.println("Request #" + purchase.getNumber() + " requires an executive meeting!");
        }
    }
}
