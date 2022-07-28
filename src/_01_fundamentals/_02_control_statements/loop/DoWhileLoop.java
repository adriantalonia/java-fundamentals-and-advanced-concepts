package _01_fundamentals._02_control_statements.loop;

public class DoWhileLoop {

    public static void main(String[] args) {

        /**
         * Java do-while Loop
         * The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true.
         * If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.
         *
         * Java do-while loop is called an exit control loop. Therefore, unlike while loop and for loop, the do-while check
         * the condition at the end of loop body. The Java do-while loop is executed at least once because condition is checked after loop body.
         * **/

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

    }

}
