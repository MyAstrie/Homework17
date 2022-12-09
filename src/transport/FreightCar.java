package transport;

public class FreightCar extends Transport implements Competing{

    public FreightCar(String brand, String model, Float engineVolume) {
        super(brand, model, engineVolume, "C");
    }

    @Override
    public void pitStop() {
        System.out.println("Тяжелый автомобиль на питстопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг тяжелого автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость тяжелого автомобиля");
    }
}