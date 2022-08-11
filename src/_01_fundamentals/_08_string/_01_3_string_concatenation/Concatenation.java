package _01_fundamentals._08_string._01_3_string_concatenation;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Concatenation {

    public static void main(String[] args) {

        // 1) String Concatenation by + (String concatenation) operator
        String s = "Sachin" + " Tendulkar";
        System.out.println(s);//Sachin Tendulkar

        // 2) String Concatenation by concat() method
        String s1 = "Sachin ";
        String s2 = "Tendulkar";
        String s3 = s1.concat(s2);
        System.out.println(s3);//Sachin Tendulkar

        // concatenation using StringBuilder class
        StringBuilder s4 = new StringBuilder("Hello");    //String 1
        StringBuilder s5 = new StringBuilder(" World");    //String 2
        StringBuilder s6 = s4.append(s5);   //String 3 to store the result
        System.out.println(s6.toString());  //Displays result

        // concatenation using format() method
        String s7 = new String("Hello"); //String 1
        String s8 = new String(" World"); //String 2
        String s9 = String.format("%s%s", s7, s8); //String 3 to store the result
        System.out.println(s9); //Displays result

        // concatenation using String.join() method (Java Version 8+)
        String s10 = new String("Hello");    //String 1
        String s11 = new String(" World");    //String 2
        String s12 = String.join("", s10, s11);   //String 3 to store the result
        System.out.println(s12);  //Displays result

        // concatenation using StringJoiner class (Java Version 8+)
        StringJoiner s13 = new StringJoiner(", ");   //StringeJoiner object
        s13.add("Hello");    //String 1
        s13.add("World");    //String 2
        System.out.println(s13);  //Displays result

        // concatenation using Collectors.joining() method (Java (Java Version 8+)
        List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array
        String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation
        System.out.println(str.toString());  //Displays result
    }
}
