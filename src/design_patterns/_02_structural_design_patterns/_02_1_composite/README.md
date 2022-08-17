## Composite Design Pattern

There are times when you feel a need of a tree data structure in your code. However, there are many variations to the
tree data structure, but sometimes there is a need for a tree in which both branches, as well as the leaves of the tree,
should be treated uniformly.

The Composite Pattern allows you to compose objects into a tree structure to represent the part-whole hierarchy. It
means you can create a tree of objects that is made of different parts, but that can be treated as a whole one big
thing. Composite lets clients treat individual objects and compositions of objects uniformly, that’s the intent of the
Composite Pattern.

### Objects in the Composite Pattern

1. Base Component – Base component is the interface for all objects in the composition. Client program uses base
   component
   to work with the objects in the composition. Moreover, it can be an interface or an abstract class with some methods
   common to all the objects.

2. Leaf – Defines the behavior for the elements in the composition. It is the building block for the composition and
   implements base component. Although, it doesn’t have references to other Components.

3. Composite – It consists of leaf elements and implements the operations in base component.

```java
/**
 * Manager(Composite)
 * Developer(Leaf)
 * Employee(Component)
 */
public interface Employee {

    public void add(Employee emp);

    public void remove(Employee emp);

    public Employee getChild(int i);

    public String getName();

    public double getSalary();

    public void print();
}
```

Manager.java
Now we will create Manager (composite class). The Key point here is that all common method delegates its operations to
child objects. It has method to access and modify its children.

```java
public class Manager implements Employee {

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
```

Developer.java
In this class, there are many methods which are not applicable to Developer because it is a leaf node.

```java
public class Developer implements Employee {

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
```

CompositePatternTest.java

```java
public class CompositePatternTest {

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
```

