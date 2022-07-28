package _01_fundamentals._03_oop.statickeyword;

//Java Program to demonstrate the use of a static method.
class Student2{
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    Student2(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}

public class StaticMethodExample {

    public static void main(String args[]){
        Student2.change();//calling change method
        //creating objects
        Student2 s1 = new Student2(111,"Karan");
        Student2 s2 = new Student2(222,"Aryan");
        Student2 s3 = new Student2(333, "Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
