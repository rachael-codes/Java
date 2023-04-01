package Salary_calculator;

public class Main {
    public static void main (String[] args){

        // Object for employee 1

        Employees e1 = new Employees();

        float salary = 50000;
        float bonus = 10000;
        float gross = salary + bonus;

        e1.setData("Mark Roberts", 50000, 10000, gross);
        e1.info();
        System.out.println("\n");

        // Object for employee 2

        Employees e2 = new Employees();

        float salary2 = 20000;
        float bonus2 = 5000;
        float gross2 = salary2 + bonus2;

        e2.setData("Patrick Star", 20000, 5000, gross2);
        e2.info();
        System.out.println("\n");

        // Object for employee 3

        Employees e3 = new Employees();

        float salary3 = 70000;
        float bonus3 = 15000;
        float gross3 = salary3 + bonus3;

        e2.setData("John Wick", 70000, 15000, gross3);
        e2.info();

    }
}
