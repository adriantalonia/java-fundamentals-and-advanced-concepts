package _01_fundamentals._03_oop.inheritance;

class Employee {
    float salary = 40000;
}

class Programmer extends Employee {
    int bonus = 10000;
}

public class SingleInheritance {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}