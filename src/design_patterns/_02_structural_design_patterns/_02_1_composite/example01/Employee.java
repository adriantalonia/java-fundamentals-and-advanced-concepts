package design_patterns._02_structural_design_patterns._02_1_composite.example01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Employee {
    public void add(Employee emp);

    public void remove(Employee emp);

    public Employee getChild(int i);

    public String getName();

    public double getSalary();

    public void print();
}

class Manager implements Employee {

    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void add(Employee emp) {
        employees.add(emp);
    }

    @Override
    public void remove(Employee emp) {
        employees.remove(emp);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("-------------");

        Iterator<Employee> empIterator = employees.iterator();
        while (empIterator.hasNext()) {
            Employee emp = empIterator.next();
            emp.print();
        }
    }
}

class Developer implements Employee {

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee emp) {
        // this is leaf node so this method is not applicable to this class.
    }

    @Override
    public void remove(Employee emp) {
        // this is leaf node so this method is not applicable to this class.
    }

    @Override
    public Employee getChild(int i) {
        // this is leaf node so this method is not applicable to this class.
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("-------------");
    }
}

class CompositePatternTest {

    public static void main(String[] args) {

        Employee emp1 = new Developer("Robert", 10000);
        Employee emp2 = new Developer("David", 15000);
        Employee manager1 = new Manager("Mark", 25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employee emp3 = new Developer("Mary", 20000);
        Manager generalManager = new Manager("John", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();

    }
}