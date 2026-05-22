package question1;

public class Bike extends Vehicle {

    public Bike(String brand, int rentalPrice)
    {
        super(brand,  rentalPrice);
    }

    // method
    @Override
    public  int calculateRentCost(int days)
    {
        int rentalPrice = 5;
        return((rentalPrice * days) - 10);
    }


}

