package ua.ihorshulha.ht_09.creational.factory;

public class Work {
    public static void main(String[] args) {
        StaffFactory staffFactory = createWorkerByKindOfWork("seller");
        Staff worker = staffFactory.createStaff();
        worker.doWork();
    }

    private static StaffFactory createWorkerByKindOfWork(String kindOfWork) {
        switch (kindOfWork.toLowerCase()) {
            case "seller":
                return new SellerFactoryImpl();
            case "manager":
                return new ManagerFactoryImpl();
            case "cleaner":
                return new CleanerFactory();
            default:
                throw new RuntimeException(kindOfWork + " is not exist");
        }
    }
}
