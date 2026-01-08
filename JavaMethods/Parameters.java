package JavaMethods;

public class Parameters {
    public static void main(String[] args) {
    //    myMethod("vijay");
    //    myMethod("sujal");
    
    myMethod(22);
    }

    // public static void myMethod(String fname) {
    //     System.out.println(fname + " shah");
    // }


    // public static void myMethod(String fname, int age) {
    //    System.out.println(fname + "-" + age);
    // }

      public static void myMethod(int age) {

        if(age < 18) {
             System.out.println("Your not eligible for vote");
        }else {
             System.out.println("Your eligible for vote");
        }


      }

     

}
