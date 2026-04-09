class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void calculateSalary() {
        System.out.println("Salary calculation");
    }
}

class PermanentEmployee extends Employee {
    double basic, hra, bonus;

    PermanentEmployee(String name, double basic, double hra, double bonus) {
        super(name);
        this.basic = basic;
        this.hra = hra;
        this.bonus = bonus;
    }

    void calculateSalary() {
        double salary = basic + hra + bonus;
        System.out.println(name + " (Permanent) Salary: " + salary);
    }
}

class ContractEmployee extends Employee {
    double hoursWorked, ratePerHour;

    ContractEmployee(String name, double hoursWorked, double ratePerHour) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println(name + " (Contract) Salary: " + salary);
    }
}

public class day2t2 {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee("Shiva", 20000, 5000, 3000);
        ContractEmployee c = new ContractEmployee("Arun", 100, 200);

        p.calculateSalary();
        c.calculateSalary();
    }
}