package fundamentals._01_variables;

public class Operators {

    public static void main(String[] args) {

        /** Java Unary Operator
         The Java unary operators require only one operand. Unary operators are used to perform various operations i.e.:

         - incrementing/decrementing a value by one
         - negating an expression
         - inverting the value of a boolean

         1) postfix: expr++ expr--
         2) prefix:	++expr --expr +expr -expr ~ !
         **/

        // Example: ++ and --
        int x = 10;
        System.out.println(x++); //10 (11)
        System.out.println(++x); //12
        System.out.println(x--); //12 (11)
        System.out.println(--x); //10

        // Example 2: ++ and --
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a); //10+12=22
        System.out.println(b++ + b++); //10+11=21

        // Example: ~ and !
        a = 10;
        b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a); //-11 (minus of total positive value which starts from 0)
        System.out.println(~b); //9 (positive of total minus, positive starts from 0)
        System.out.println(!c); //false (opposite of boolean value)
        System.out.println(!d); //true

        /** Java Arithmetic Operators
         Java arithmetic operators are used to perform addition, subtraction,
         multiplication, and division. They act as basic mathematical operations.

         1) multiplicative: * / %
         2) additive: + -
         **/
        a = 10;
        b = 5;
        System.out.println(a + b);//15
        System.out.println(a - b);//5
        System.out.println(a * b);//50
        System.out.println(a / b);//2
        System.out.println(a % b);//0


        /** Java Left Shift Operator
         The Java left shift operator << is used to shift all of the bits
         in a value to the left side of a specified number of times.

         Java Right Shift Operator
         The Java right shift operator >> is used to move the value
         of the left operand to right by the number of bits specified by the right operand.

         - shift: << >> >>> **/

        // Java left shift
        System.out.println(10 << 2);//10*2^2=10*4=40
        System.out.println(10 << 3);//10*2^3=10*8=80
        System.out.println(20 << 2);//20*2^2=20*4=80
        System.out.println(15 << 4);//15*2^4=15*16=240

        // Java Right Shift
        System.out.println(10 >> 2);//10/2^2=10/4=2
        System.out.println(20 >> 2);//20/2^2=20/4=5
        System.out.println(20 >> 3);//20/2^3=20/8=2

        //Java Shift Operator Example: >> vs >>>
        //For positive number, >> and >>> works same
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);

        /**Java AND Operator Example: Logical && and Bitwise &
         The logical && operator doesn't check
         the second condition if the first condition is false.
         It checks the second condition only if the first one is true.

         The bitwise & operator always checks both conditions whether first condition is true or false.**/

        a = 10;
        b = 5;
        int e = 20;
        System.out.println(a < b && a < e);//false && true = false
        System.out.println(a < b & a < e);//false & true = false

        //Java AND Operator Example: Logical && vs Bitwise &
        System.out.println(a < b && a++ < e);//false && true = false
        System.out.println(a);//10 because second condition is not checked

        System.out.println(a < b & a++ < e);//false && true = false
        System.out.println(a);//11 because second condition is checked

        /**Java OR Operator Example: Logical || and Bitwise |
         The logical || operator doesn't check
         the second condition if the first condition is true.
         It checks the second condition only if the first one is false.

         The bitwise | operator always checks both conditions whether first condition is true or false.**/

        a = 10;
        b = 5;
        e = 20;
        System.out.println(a > b || a < e);//true || true = true
        System.out.println(a > b | a < e);//true | true = true
        //|| vs |
        System.out.println(a > b || a++ < e);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a > b | a++ < e);//true | true = true
        System.out.println(a);//11 because second condition is checked

        /**Java Ternary Operator
         Java Ternary operator is used as one line replacement for if-then-else statement and used a lot in Java programming.
         It is the only conditional operator which takes three operands.**/
        int min = (a < b) ? a : b;
        System.out.println(min);

        /**Java Assignment Operator
         Java assignment operator is one of the most common operators.
         It is used to assign the value on its right to the operand on its left.**/

        a = 10;
        a += 3;//10+3
        System.out.println(a);
        a -= 4;//13-4
        System.out.println(a);
        a *= 2;//9*2
        System.out.println(a);
        a /= 2;//18/2
        System.out.println(a);
    }
}
