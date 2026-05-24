package question2;

public class Employee {
        private String employeeId;
        private String employeeName;
        private String employeeStatus;
        private double salary;

        public Employee(String employeeId, String employeeName, String employeeStatus, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.employeeStatus = employeeStatus;
            setSalary(salary); // Uses the validation logic
        }

        // Validation rule: Salary cannot be negative
        public void setSalary(double salary) {
            if (salary < 0) {
                this.salary = 0;
                System.out.println("Warning: Salary cannot be negative. Set to 0 by default.");
            } else {
                this.salary = salary;
            }
        }

        public double getSalary() {
            return salary;
        }

        public void displayEmployeeInfo() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + employeeName);
            System.out.println("Status: " + employeeStatus);
            System.out.println("Base Salary: $" + salary);
        }
    }
