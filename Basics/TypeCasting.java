package Basics;

public class TypeCasting {
    public static void main(String[] args) {
        //
        // int myInt = 9;
        // double myDouble = myInt;
        // System.out.println(myInt);
        // System.out.println(myDouble);

        //
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt); // Outputs 9
    }
}
