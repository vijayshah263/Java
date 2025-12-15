package Problems;
import java.util.Scanner;

// public class Problem {
//     public static void main(String[] args) {
//          Scanner input = new Scanner(System.in);
//          System.out.print("Please Enter yout name: ");
//          String name = input.nextLine();

//          System.out.println("Welcome " + name +" to KG coding "  );
//     }
// }



public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Number1: ");
        int Number1 = input.nextInt();
        System.out.println("Please Enter Number2: ");
        int Number2 = input.nextInt();

        int sum = Number1 + Number2;

        System.out.println("Answer is : " + sum);
    }
}