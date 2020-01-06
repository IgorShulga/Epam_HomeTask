package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public class ChainRunner {
    public static void main(String[] args) {
        Approver president = new President(director);
        Approver director = new Director(manager);
        Approver manager = new Manager(director);


        manager.setSuccessor(director);
        director.setSuccessor(president);

        Purchase purchase = new Purchase(1000, 3050.00, "Library Books");
        manager.processRequest(purchase);

        purchase = new Purchase(1001, 30500.10, "Lab Machines");
        director.processRequest(purchase);

        purchase = new Purchase(1002, 130500.00, "Apple Mac Books");
        president.processRequest(purchase);
    }

}
