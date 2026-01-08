package JavaMethods;

public class Returns {
    public static void main(String[] args) {
        
        //  System.out.println( myMethod(5));
        int z = SumTwoNum(2, 5);
        System.out.println(z);
    }

    // public static int myMethod(int num){
    //     return 5 + num;
    // }

    public static int SumTwoNum(int a, int b) {
                  return  a + b;
    }
}
