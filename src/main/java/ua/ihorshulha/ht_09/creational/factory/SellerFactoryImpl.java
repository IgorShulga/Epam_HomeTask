package ua.ihorshulha.ht_09.creational.factory;

public class SellerFactoryImpl implements StaffFactory {
    @Override
    public Staff createStaff() {
        return new Seller();
    }
}
