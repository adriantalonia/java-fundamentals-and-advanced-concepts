## Call by Value and Call by Reference in Java

There is only call by value in java, not call by reference. If we call a method passing a value, it is known as call by
value. The changes being done in the called method, is not affected in the calling method.

Example of call by value in java
In case of call by value original value is not changed. Let's take a simple example:

```java
class Operation {
    int data = 50;

    void change(int data) {
        data = data + 100;//changes will be in the local variable only  
    }

    public static void main(String args[]) {
        Operation op = new Operation();

        System.out.println("before change " + op.data);
        op.change(500);
        System.out.println("after change " + op.data);

    }
}
```

```
Output:before change 50
       after change 50	
```

### Another Example of call by value in java

In case of call by reference original value is changed if we made changes in the called method. If we pass object in
place of any primitive value, original value will be changed. In this example we are passing object as a value. Let's
take a simple example:

```java
class Operation2 {
    int data = 50;

    void change(Operation2 op) {
        op.data = op.data + 100;//changes will be in the instance variable  
    }


    public static void main(String args[]) {
        Operation2 op = new Operation2();

        System.out.println("before change " + op.data);
        op.change(op);//passing object  
        System.out.println("after change " + op.data);

    }
}
```

```
Output:before change 50
       after change 150	
```