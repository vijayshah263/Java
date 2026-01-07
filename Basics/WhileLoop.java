package Basics;

public class WhileLoop {
    public static void main(String[] args) {
        // while (condition) {
        // // code block to be executed
        // }

        // int i =0;
        // while (i <= 10) {
        // System.out.println(i);
        // i+=1;

        // }

        // int i = 3;
        // while(i >= 0) {
        // System.out.println(i);
        // i--;
        // }
        // System.out.println("Happy New Year");

        int dice = 1;
        while (dice <= 6) {

            if (dice < 6) {
                System.out.println("not yatzy");

            } else {
                System.out.println("yatzy");
            }
            dice = dice + 1;

        }

    }
}
