import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int a = 5;
       
        int x1 = input.nextInt();
        // a = a + x1;
        a += x1;
        System.out.print(a);

        int x2 = input.nextInt();
        // a = a + x2;
        a += x2;
        System.out.println(a);

    }
}
