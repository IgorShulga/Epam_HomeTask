package ua.ihorshulha.ht_09.structural.decorator;

public class SmartTv extends DeviceDecorator {

    public SmartTv(Device device) {
        super(device);
    }

    public String surfWww(){
        return " surf internet";
    }

    @Override
    public String work() {
        return super.work() + surfWww();
    }
}
