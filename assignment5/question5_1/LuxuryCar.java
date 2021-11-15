package question5_1;

public class LuxuryCar extends CarDecorator {
    Car car;

    public LuxuryCar(Car car) {
        super(car);
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print("Adding features of Luxury Car. ");
    }
}
