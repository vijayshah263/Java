import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
         System.out.println("Welcome to occurenece calculator: ");
         Scanner input = new Scanner(System.in);
         int[] numsArray = inputArray();
         System.out.println("pls enter the number which you want to find: ");
         int num = input.nextInt();
         int occurence = noOfocc(numsArray, num);
         System.out.println(num + " present " + occurence + " times");




         
    }

    public static int noOfocc(int[] numsArray, int num ){
        int occ = 0;
        int i = 0;
        while (i < numsArray.length) {
            
            if(numsArray[i] == num) {
                occ++;
            }
            i++;
        }
             return occ;
    }

       public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the size of Array");
        int size = input.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while (i < size) {
            // System.out.println(nums[i]);
            System.out.print("please enter the number "  + (i + 1) + " - ");
            nums[i] = input.nextInt();
            i++;

        }

        return nums;

    }
}
