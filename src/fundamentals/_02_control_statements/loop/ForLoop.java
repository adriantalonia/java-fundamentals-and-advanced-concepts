package fundamentals._02_control_statements.loop;

public class ForLoop {

    public static void main(String[] args) {
        /**
         * The Java for loop is used to iterate a part of the program several times.
         * If the number of iteration is fixed, it is recommended to use for loop.
         *
         * There are three types of for loops in Java.
         *
         * - Simple for Loop
         * - For-each or Enhanced for Loop
         * - Labeled for Loop
         * **/

        /**
         * Java Simple for Loop
         * A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value. It consists of four parts:
         *
         * 1) Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.
         * 2) Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.
         * 3) Increment/Decrement: It increments or decrements the variable value. It is an optional condition.
         * 4) Statement: The statement of the loop is executed each time until the second condition is false.
         * **/

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Nested for Loop
        //loop of i
        for (int i = 1; i <= 3; i++) {
            //loop of j
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }//end of i
        }//end of j

        // pyramid example
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();//new line
        }

        // pyramied example 2
        int term = 6;
        for (int i = 1; i <= term; i++) {
            for (int j = term; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();//new line
        }


        /**
         * Java for-each Loop
         *
         * The for-each loop is used to traverse array or collection in Java.
         * It is easier to use than simple for loop because we don't need to increment value and use subscript notation.
         *
         * It works on the basis of elements and not the index. It returns element one by one in the defined variable.
         * **/
        //Declaring an array
        int arr[] = {12, 23, 44, 56, 78};
        //Printing array using for-each loop
        for (int i : arr) {
            System.out.println(i);
        }

        /**
         * Labeled For Loop
         * We can have a name of each Java for loop. To do so, we use label before the for loop.
         * It is useful while using the nested for loop as we can break/continue specific for loop.
         * **/

        //Using Label for outer and for loop
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }


    }
}
