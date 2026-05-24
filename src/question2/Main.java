package question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("*****SalaryPaycheck****");
                System.out.println("choose your status");
                System.out.println("1.Manager");
                System.out.println("2.Developer");
                System.out.println("******");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                String status = "";
                if (choice == 1) {
                    status = "Manager";
                } else if (choice == 2) {
                    status = "Developer";
                } else {
                    System.out.println("Invalid Selection.");
                    return;
                }


                System.out.print("Enter Employee ID: ");
                String id = scanner.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();

                // employee object
                Employee emp = new Employee(id, name, status, salary);

                Payment paymentProcessor = null;


                if (choice == 1) {
                    paymentProcessor = new ManagerPayment(emp);
                } else {
                    paymentProcessor = new DeveloperPayment(emp);
                }


                System.out.println("=================================");
                System.out.println("       PAYROLL INFORMATION       ");
                System.out.println("=================================");
                emp.displayEmployeeInfo();

                double bonus = paymentProcessor.calculateBonus();
                System.out.println("Bonus Amount: $" + bonus);
                System.out.println("Total Paycheck: $" + (emp.getSalary() + bonus));
                System.out.println("=================================");
            }

}