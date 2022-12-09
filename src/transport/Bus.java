package transport;

public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, Float engineVolume) {
        super(brand, model, engineVolume, "D");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус на питстопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса");
    }
}