package Problems;

import java.util.Scanner;

// public class Challanges {
//     public static void main(String[] args) {
//          Scanner input = new Scanner(System.in);
        
//          int number = input.nextInt();

//          if(number == 0) {
//             System.out.println("Number is zero");
//          }
//          else if(number < 0 ) {
//              System.out.println("Number is negative");
//     }
//     else {
//          System.out.println("Number is Positive");
//     }
//     }
// }


// public class Challanges {
//     public static void main(String[] args) {
//          Scanner input = new Scanner(System.in);
//         System.out.println("please enter the number: ");
//          int number = input.nextInt();

//          if(number % 2 == 0) {
//             System.out.println("Number is Even");
//          }
        
//     else {
//          System.out.println("Number is odd");
//     }
//     }

// public class Challanges {
//     public static void main(String[] args) {
//          Scanner input = new Scanner(System.in);
//         System.out.println("please enter the number: ");
//          int number = input.nextInt();

//          if(number % 2 == 0) {
//             System.out.println("Number is Even");
//          }
        
//     else {
//          System.out.println("Number is odd");
//     }
//     }
// }



// public class Challanges {
//     public static void main(String[] args) {
//          Scanner input = new Scanner(System.in);
//         System.out.println("please enter the number A: ");
//         int a = input.nextInt();
//         System.out.println("please enter the number B: ");
//         int b = input.nextInt();
//         System.out.println("please enter the number C: ");
//         int c = input.nextInt();

        
//         if(a > b && a > c) {
//             System.out.println("number A is greater");
//         }

//         else if(b > a && b > c) {
//             System.out.println("number B is greater");
//         }

//         else {
//             System.out.println("number C is greater");
//         }
//     }
// }


public class Challanges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter the year: ");
        int year = input.nextInt();
        if(year%400 == 0 || (year%4 == 0 &&  year%100 != 0)) {
            System.out.println("these is a leap year:");
        }else {
             System.out.println("these is not a leap year:");
        }
    }
}
