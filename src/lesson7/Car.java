package lesson7;

public class Car {
    private String brand;
    private int maxSpeed;
    private int oilType;
    private double weight;
    private static int [][] field = new int[50][70];

    public Car(String brand, int maxSpeed, int oilTyte, double weight) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.oilType = oilTyte;
        this.weight = weight;
    }


    public static void main(String[] args) {
        Car car = new Car("Ford", 150, 95, 14.6);
        System.out.println(car.maxSpeed);
        System.out.println(car.brand);
        System.out.println(car.weight);
        System.out.println(field.length);
        System.out.println(field[0].length);
    }

}
