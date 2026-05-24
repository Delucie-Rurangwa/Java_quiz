package question2;

    public class DeveloperPayment extends Payment {

        public DeveloperPayment(Employee employee) {
            super(employee);
        }

        @Override
        public double calculateBonus() {
            // Developer bonus = 10% of salary
            return employee.getSalary() * 0.10;
        }
    }

