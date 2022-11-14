// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class SwapTwoVariables {

    public static void swap(int a, int b) {

        //Approach 1 (Using Bit Manipulation)
        //a = a ^ b; // 5^7 = 2
        //b = a ^ b; // 2^7 = 5
        //a = a ^ b; // 2^5 = 7

        //Approach 2 (Using Addition and Subtraction)
        //a = a + b; // 5+7 = 12;
        //b = a - b; // 12-7 = 5;
        //a = a - b; // 12-5 = 7;

        //Approach 3 (Using Multiplication and Subtraction)
        //a = a * b; // 5*7=35
        //b = a / b; // 35/7 = 5
        //a = a / b; // 35/5 = 7

        //Approach 4 (Naive Approach using Temporary(Third) Variable)
        int c = a;
        a = b;
        b = c;

        System.out.println("After Swapping: " + "a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        swap(a, b);
    }
}