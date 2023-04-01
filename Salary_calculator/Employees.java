package Salary_calculator;

public class Employees {

    //Data

    String name = "No name";
    float salary = 0;
    float bonus = 0;
    float grossSalary = 0;

    void setData(String name, float salary, float bonus, float grossSalary){
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.grossSalary = grossSalary;
    }

    void info (){
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Gross Salary: $" + grossSalary);
    }
}
