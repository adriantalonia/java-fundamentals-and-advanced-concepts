package _01_fundamentals._02_control_statements.decision;

public class Switch {

    public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}

    public static void main(String[] args) {

        /**
         *The Java switch statement executes one statement from multiple conditions.
         * It is like if-else-if ladder statement.
         * The switch statement works with byte, short, int, long, enum types, String
         * and some wrapper types like Byte, Short, Int, and Long. Since Java 7, you can use strings in the switch statement.
         *
         * In other words, the switch statement tests the equality of a variable against multiple values.
         * **/

        int number = 20;
        //Switch expression
        switch (number) {
            //Case statements
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            //Default case statement
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        // example with string
        String levelString = "Expert";
        int level = 0;
        //Using String in Switch expression
        switch (levelString) {
            //Using String Literal in Switch case
            case "Beginner":
                level = 1;
                break;
            case "Intermediate":
                level = 2;
                break;
            case "Expert":
                level = 3;
                break;
            default:
                level = 0;
                break;
        }
        System.out.println("Your Level is: " + level);

        // Nested Switch Statement

        char branch = 'C';
        int collegeYear = 4;
        switch (collegeYear) {
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch (branch) {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch (branch) {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch (branch) {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }

        // Enum in Switch Statement
        Day[] DayNow = Day.values();
        for (Day Now : DayNow) {
            switch (Now) {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }

        // Wrapper in Switch Statement
        /** Java allows us to use four wrapper classes: Byte, Short, Integer and Long in switch statement. **/
        Integer age = 18;
        switch (age) {
            case (16):
                System.out.println("You are under 18.");
                break;
            case (18):
                System.out.println("You are eligible for vote.");
                break;
            case (65):
                System.out.println("You are senior citizen.");
                break;
            default:
                System.out.println("Please give the valid age.");
                break;
        }
    }
}
