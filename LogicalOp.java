import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Please Enter your age: ");
          int age = input.nextInt();

           System.out.println("Are you Female (true/false)");
           boolean isfemale = input.nextBoolean();

          if(age < 5) {
            System.out.println("you got the 75% discount");
          }
          else if(isfemale) {
            System.out.println("you got 50% discount");
          }
          else if(age > 60 && !isfemale) {
            System.out.println("you got 25% discount");
          }
        else {
            System.out.println("you got no discount");
        }
     
    }
}
