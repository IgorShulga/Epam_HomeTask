package ua.ihorshulha.ht_09.structural.decorator;

public class GameBoxTv extends DeviceDecorator {
    public GameBoxTv(Device device) {
        super(device);
    }

    public String playsGame(){
        return " plays game";
    }

    @Override
    public String work() {
        return super.work() + playsGame();
    }
}
