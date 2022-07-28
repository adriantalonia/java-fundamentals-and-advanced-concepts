package _01_fundamentals._02_control_statements.jump;

public class ContinueStatement {

    public static void main(String[] args) {

        /**
         * Continue Statement
         * The continue statement is used in loop control structure when you need to jump to the next iteration of
         * the loop immediately. It can be used with for loop or while loop.
         *
         * The Java continue statement is used to continue the loop. It continues the current flow of the program and
         * skips the remaining code at the specified condition. In case of an inner loop, it continues the inner loop only.
         *
         * We can use Java continue statement in all types of loops such as for loop, while loop and do-while loop.
         * **/

        //for loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }

        // Continue Statement with Inner Loop
        //outer loop
        for (int i = 1; i <= 3; i++) {
            //inner loop
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    //using continue statement inside inner loop
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }

        // Continue Statement with Labelled For Loop
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    //using continue statement with label
                    continue aa;
                }
                System.out.println(i + " " + j);
            }
        }

        // Continue Statement in while loop
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                //using continue statement
                i++;
                continue;//it will skip the rest statement
            }
            System.out.println(i);
            i++;
        }

        // Continue Statement in do-while Loop
        i = 1;
        //do-while loop
        do {
            if (i == 5) {
                //using continue statement
                i++;
                continue;//it will skip the rest statement
            }
            System.out.println(i);
            i++;
        } while (i <= 10);


    }
}
