import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("--- Vehicle Rental System ---");

                // objects creation
                Car sampleCar = new Car("Ferrari", 50);
                Bike sampleBike = new Bike("Spiro", 30);

                System.out.println("[Default Test for 5 Days]");
                System.out.println(sampleCar.getBrand() + " Car Cost for 5 days: $" + sampleCar.calculateRentCost(5));
                System.out.println(sampleBike.getBrand() + " Bike Cost for 5 days: $" + sampleBike.calculateRentCost(5));
                System.out.println("-------------------------------------");

                // Dynamic User Input Requirement
                System.out.print("Enter vehicle type (1 for Car, 2 for Bike): ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Vehicle Brand: ");
                String brand = scanner.nextLine();

                System.out.print("Enter Rental Price per day: ");
                double price = scanner.nextDouble();

                System.out.print("Enter Number of Rental Days: ");
                int days = scanner.nextInt();

                Vehicle userVehicle = null;

        int rentalPrice = 0;
        if (choice == 1) {
                    userVehicle = new Car(brand, rentalPrice);
                } else if (choice == 2) {
                    userVehicle = new Bike(brand, rentalPrice);
                } else {
                    System.out.println("Invalid choice execution stopped.");
                    return;
                }

                // Displaying final dynamic bill
                System.out.println("***** FINAL RENTAL BILL *****");
                System.out.println("Vehicle Brand: " + userVehicle.getBrand());
                System.out.println("Rental Duration: " + days + " days");
                System.out.println("Total Cost: $" + userVehicle.calculateRentCost(days));
                System.out.println("*****************************");
            }
        }

