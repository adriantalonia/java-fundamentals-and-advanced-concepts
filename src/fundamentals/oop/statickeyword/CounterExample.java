package fundamentals.oop.statickeyword;

public class CounterExample {

    static int count = 0;//will get memory only once and retain its value

    CounterExample() {
        count++;//incrementing the value of static variable
        System.out.println(count);
    }

    public static void main(String args[]) {
        //creating objects
        CounterExample c1 = new CounterExample();
        CounterExample c2 = new CounterExample();
        CounterExample c3 = new CounterExample();
    }
}