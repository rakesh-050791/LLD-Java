import java.util.Comparator;

public class Car implements Comparable<Car> {
    public int Price;
    public int Speed;

    @Override
    public int compareTo(Car otherCar) {
        return this.Price - otherCar.Price;
    }
}