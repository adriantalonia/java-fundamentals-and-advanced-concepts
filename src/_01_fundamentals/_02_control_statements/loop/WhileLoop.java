package _01_fundamentals._02_control_statements.loop;

public class WhileLoop {

    public static void main(String[] args) {
        /**
         * Java While Loop
         * The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true.
         * As soon as the Boolean condition becomes false, the loop automatically stops.
         *
         * The while loop is considered as a repeating if statement. If the number of iteration is not fixed, it is recommended to use the while loop.
         * **/

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


    }
}
