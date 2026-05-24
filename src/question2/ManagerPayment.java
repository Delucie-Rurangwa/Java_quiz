package question2;

    public class ManagerPayment extends Payment {

        public ManagerPayment(Employee employee) {
            super(employee);
        }

        @Override
        public double calculateBonus() {
            // Manager bonus = 20% of salary
            return employee.getSalary() * 0.20;
        }
    }
