package Basics;

public class foorLoop {
    public static void main(String[] args) {
        // for(int i = 0; i < 5; i++){
        // System.out.println(i);
        // }

        // for (int i = 0; i <= 10; i = i + 2) {
        // System.out.println(i);
        // }

        // int sum = 0;
        // for (int i = 1; i <= 5; i++) {

        // sum = sum + i;

        // }
        // System.out.println(sum);

        // for(int i = 5; i >= 0; i--) {
        // System.out.println(i);
        // }

        // for (int i = 10; i < 5; i++) {
        // System.out.println("This will never be printed");
        // }

        // for (int i = 1; i <= 2; i++) {
        //     System.out.println("Outer: " + i); // Executes 2 times

        //     // Inner loop
        //     for (int j = 1; j <= 3; j++) {
        //         System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
        //     }
        // }


        //
        for(int i = 1; i <= 3; i++) {

            for(int j =1; j <= 3; j++ ) {
                System.out.println(i * j);
            }
            System.out.println();
        }
    }
}
