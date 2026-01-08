import java.util.Scanner;

public class sumofArray {
    public static void main(String[] args) {
        int[] numArray = inputArray();
        long sum = sum(numArray);
        int avg =  avg(numArray);
        System.out.println(sum);
        System.out.println(avg);

    }


    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum = sum + numArray[i];
            i++;
        }
        return sum;
    }

    public static int avg(int[] numArray) {
         long sum = sum(numArray);
       return (int)sum / numArray.length;
      
    }

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the size of Array");
        int size = input.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while (i < size) {
            // System.out.println(nums[i]);
            System.out.print("please enter the number " + "- " + (i + 1));
            nums[i] = input.nextInt();
            i++;

        }

        return nums;

    }
}
