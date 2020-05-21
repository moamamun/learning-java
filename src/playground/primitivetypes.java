package playground;

public class primitivetypes {
    public static void main(String[] args) {
        // write your code here
        int myvalue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minumum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //overflow
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        //Underflow
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value " + myMinByteValue);
        System.out.println("Byte Maximum Value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value " + myMinShortValue);
        System.out.println("Short Maximum Value " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value " + myMinLongValue);
        System.out.println("Long Maximum Value " + myMaxLongValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        // casting - type in front of the number in parenthesis aka int by default
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short) (myMaxShortValue / 2);

        //challenge

        byte newByteForC = 10;
        short newShortForC = 20;
        int newIntForC = 50;
        long newLongForC = 50000L + 10L * (newByteForC + newShortForC + newIntForC);
        System.out.println(newLongForC);
    }
}


