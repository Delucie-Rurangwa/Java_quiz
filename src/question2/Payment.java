package question2;

    public abstract class Payment {
        protected Employee employee;

        public Payment(Employee employee) {
            this.employee = employee;
        }

        // Abstract method to be implemented by specific roles
        public abstract double calculateBonus();
    }