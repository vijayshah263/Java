package JavaMethods;

public class Example {
    public static void main(String[] args) {
        for(int i=0; i < 5; i++) {
            System.out.println("Double of " + i + " is "  + doubleNum(i));
        }
       
    }

    public  static int doubleNum(int x)  {
        return x * 2;
    }
}
