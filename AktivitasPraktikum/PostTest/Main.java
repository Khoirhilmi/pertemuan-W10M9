package PostTest;

public class Main {

    // Superclass
    static class Employee {
        public double calculateSalary() {
            return 0.0;
        }

        public double calculateSalary(boolean withBonus) {
            if (withBonus) {
                return calculateSalary() + 1000000;
            } else {
                return calculateSalary();
            }
        }

        public void displayInfo() {
            System.out.println("Employee with salary: " + calculateSalary());
        }
    }

    // Subclass SoftwareEngineer
    static class SoftwareEngineer extends Employee {
        @Override
        public double calculateSalary() {
            return 15000000;
        }

        @Override
        public double calculateSalary(boolean withBonus) {
            if (withBonus) {
                return calculateSalary() + 3000000;
            } else {
                return calculateSalary();
            }
        }

        @Override
        public void displayInfo() {
            System.out.println("Software Engineer - Salary: " + calculateSalary());
        }
    }

    // Subclass DataScientist
    static class DataScientist extends Employee {
        @Override
        public double calculateSalary() {
            return 17000000;
        }

        @Override
        public double calculateSalary(boolean withBonus) {
            if (withBonus) {
                return calculateSalary() + 4000000;
            } else {
                return calculateSalary();
            }
        }

        @Override
        public void displayInfo() {
            System.out.println("Data Scientist - Salary: " + calculateSalary());
        }
    }

    // Subclass Intern
    static class Intern extends Employee {
        @Override
        public double calculateSalary() {
            return 5000000;
        }

        @Override
        public double calculateSalary(boolean withBonus) {
            if (withBonus) {
                return calculateSalary() + 500000;
            } else {
                return calculateSalary();
            }
        }

        @Override
        public void displayInfo() {
            System.out.println("Intern - Salary: " + calculateSalary());
        }
    }

    // Main method
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SoftwareEngineer();
        employees[1] = new DataScientist();
        employees[2] = new Intern();

        System.out.println("=== Gaji Tanpa Bonus (Polymorphism) ===");
        for (Employee e : employees) {
            e.displayInfo(); // Polymorphic call
        }

        System.out.println("\n=== Gaji Dengan Bonus (Method Overloading) ===");
        for (Employee e : employees) {
            System.out.println(e.getClass().getSimpleName() + " - Salary with Bonus: " + e.calculateSalary(true));
        }
    }
}
