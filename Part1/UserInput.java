import java.util.Scanner;

public class UserInput {
    public static void main (String[] args) {
        // Scanner input = new Scanner (System.in);
        // // System.out.print("Enter your name: ");
        // // String name = input.nextLine();
        // // System.out.println("Good Morning " + name);

        // // System.out.print(name +" please also tell me your age ");
        // // int age = input.nextInt();
        // // System.out.println("o nice your " + age + " old , good");



        //Qs add two numbers

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number a: ");
        int a = input.nextInt();
        System.out.println("Enter the number b: ");
        int b = input.nextInt();

        System.out.println("Answer is: " + (a+b));


    }
}