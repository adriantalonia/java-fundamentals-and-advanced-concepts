package fundamentals._02_control_statements.decision;

public class IfElse {
    public static void main(String[] args) {
        /**The Java if statement is used to test the condition. It checks boolean condition: true or false. There are various types of if statement in Java.

         - if statement
         - if-else statement
         - if-else-if ladder
         - nested if statement**/

        // if statement
        int age = 20;
        //checking the age
        if (age > 18) {
            System.out.print("Age is greater than 18");
        }

        // if-else statement
        int number = 13;
        //Check if the number is divisible by 2 or not
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        int year = 2020;
        if (((year % 4 == 0) && (year % 100 != 0))
                || (year % 400 == 0)) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("COMMON YEAR");
        }

        // Using ternary operator
        /**
         * We can also use ternary operator (? :) to perform the task of if...else statement.
         * It is a shorthand way to check the condition. If the condition is true, the result of ? is returned.
         * But, if the condition is false, the result of : is returned.
         * **/
        number = 13;
        String output = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println(output);

        // if-else-if ladder
        int marks = 65;

        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }

        // nested if statement
        age=25;
        int weight=48;
        //applying condition on age and weight
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            } else{
                System.out.println("You are not eligible to donate blood");
            }
        } else{
            System.out.println("Age must be greater than 18");
        }

    }
}
