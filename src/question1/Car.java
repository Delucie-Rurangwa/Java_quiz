package question1;

public class Car extends Vehicle {

    public Car(String brand,int rentalPrice) {
        super(brand,  rentalPrice);
    }

    @Override
    public int calculateRentCost(int days) {
        int rentalPrice= 10;
        return rentalPrice * days;
    }
}

