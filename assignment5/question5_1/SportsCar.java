package question5_1;

public class SportsCar extends CarDecorator {
    Car car;

    public SportsCar(Car car) {
        super(car);
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print("Adding features of Sports Car. ");
    }
}
