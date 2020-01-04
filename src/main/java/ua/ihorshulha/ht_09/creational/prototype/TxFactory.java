package ua.ihorshulha.ht_09.creational.prototype;

public class TxFactory {
    Tx tx;

    public TxFactory(Tx tx) {
        this.tx = tx;
    }

    public void setTx(Tx tx) {
        this.tx = tx;
    }

    Tx cloneTx(){
        return (Tx) tx.copy();
    }
}
