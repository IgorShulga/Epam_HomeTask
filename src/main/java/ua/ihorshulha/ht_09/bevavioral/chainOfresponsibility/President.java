package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public class President extends Approver {

    public President(Approver approver) {
        super(approver);
    }

    @Override
    public void processRequest(Purchase purchase) {
        if(purchase.getAmount() < 100000.0){
            System.out.println(this.getClass().getSimpleName()+" approved request #"+ purchase.getNumber());
        }else {
            System.out.println("Request #"+purchase.getNumber()+" requires an executive meeting!");
        }
    }

}
