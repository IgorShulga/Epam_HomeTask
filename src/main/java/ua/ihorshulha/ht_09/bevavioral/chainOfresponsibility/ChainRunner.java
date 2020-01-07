package ua.ihorshulha.ht_09.bevavioral.chainOfresponsibility;

public class ChainRunner {
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase(1000, 3050.00, "Library Books");
        Purchase purchase2 = new Purchase(1001, 30500.10, "Lab Machines");
        Purchase purchase3 = new Purchase(1002, 130500.00, "Apple Mac Books");

        Approver manager = new Manager(10000);
        Approver director = new Director(25000);
        Approver president = new President(100000);

        manager.setNextApprover(director);
        director.setNextApprover(president);

        manager.processRequest(purchase1);
        director.processRequest(purchase2);
        president.processRequest(purchase3);
    }

}
