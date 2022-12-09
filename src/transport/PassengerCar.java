package transport;

public class PassengerCar extends Transport implements Competing{

    public PassengerCar(String brand, String model, Float engineVolume) {
        super(brand, model, engineVolume, "A");
    }

    @Override
    public void pitStop() {
        System.out.println("Легкий автомобиль на питстопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг легкового автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля");
    }
}
