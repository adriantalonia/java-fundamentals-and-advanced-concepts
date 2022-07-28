package fundamentals.control_statements.jump;

public class BreakStatement {
    public static void main(String[] args) {

        /**
         * Break Statement
         * When a break statement is encountered inside a loop, the loop is immediately terminated and the program control
         * resumes at the next statement following the loop.
         *
         * The Java break statement is used to break loop or switch statement. It breaks the current flow of the program
         * at specified condition. In case of inner loop, it breaks only inner loop.
         *
         * We can use Java break statement in all types of loops such as for loop, while loop and do-while loop.
         * **/

        //using for loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                //breaking the loop
                break;
            }
            System.out.println(i);
        }

        // Break Statement with Inner Loop
        //outer loop
        for (int i = 1; i <= 3; i++) {
            //inner loop
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    //using break statement inside the inner loop
                    break;
                }
                System.out.println(i + " " + j);
            }
        }

        // Break Statement with Labeled For Loop
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    //using break statement with label
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }

        // Break Statement in while loop
        //while loop
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                //using break statement
                i++;
                break;//it will break the loop
            }
            System.out.println(i);
            i++;
        }

        // Break Statement in do-while loop
        i = 1;
        //do-while loop
        do {
            if (i == 5) {
                //using break statement
                i++;
                break;//it will break the loop
            }
            System.out.println(i);
            i++;
        } while (i <= 10);

    }
}
