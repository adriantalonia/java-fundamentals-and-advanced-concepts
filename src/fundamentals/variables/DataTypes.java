package fundamentals.variables;

public class DataTypes {

    public static void main(String[] args) {

        /** Date Type
         1. primitive
         1.1 Boolean - boolean **/
        //boolean tre|false or 0|1, 1 bit
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCostumerOverTwentyOne = true; //good practice

        /** 1.2 Numeric
         *
         1.2.1 Character - char **/
        //2 bytes or 16 bits
        char myChar = 'D';
        char myUnicodeChar = '\u0044';

        /** 1.2.2 Integral - Integer - byte **/
        // byte - 1 byte or 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        /** 1.2.3 Integral - Integer - short **/
        // short - 2 bytes or 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        /** 1.2.3 Integral - Integer - int **/
        // int - 4 bytes or 32 bites
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        /** 1.2.4 Integral - Integer - long **/
        // long - 8 bytes or 64 bits
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        /** 1.2.5 Integral - Integer - Floating-point - float **/
        //float 4 bytes or 32 bits
        float myFloat = 5.25f; //good practice 'f'
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        /** 1.2.6 Integral - Integer - Floating-point - double **/
        //double 8 bytes - 64 bits
        double myDouble2 = 5d; //good practice 'd'
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
    }
}
