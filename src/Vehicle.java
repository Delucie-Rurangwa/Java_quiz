public class Vehicle {
    private String brand;
     private int rentalprice;
      int amount = 2;

    public Vehicle(String brand, int rentalprice) {
        this.brand = brand;
        this.rentalprice = rentalprice;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRentalprice() {
        return rentalprice;
    }

    public void setRentalprice(int rentalprice) {
        this.rentalprice = rentalprice;
    }
    // method
     public  int calculateRentCost(int days)
     {
        return(amount);
     }

}
