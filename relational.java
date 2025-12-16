import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter your age: ");
         int age = input.nextInt();

         if(age >= 18) {
            System.out.println("Your can Drive");

         }
         else {
              System.out.println("Your can not Drive");
         }

    }
}
