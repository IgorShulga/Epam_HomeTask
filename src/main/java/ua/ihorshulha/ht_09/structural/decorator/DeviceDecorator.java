package ua.ihorshulha.ht_09.structural.decorator;

public class DeviceDecorator implements Device {

    Device device;

    public DeviceDecorator(Device device) {
        this.device = device;
    }

    @Override
    public String work() {
        return device.work();
    }
}
