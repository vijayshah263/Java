package Basics;

public class Conditional {
    public static void main(String[] args) {
        // boolean isRanning = true;
        // if (isRanning) {
        // System.out.println("Bring an Umbrellam!");
        // }

        // if (20 > 18) {
        // System.out.println("here 20 is greater than 18");
        // }

        // int x = 20;
        // int y = 28;
        // if (x == y) {
        // System.out.println("here x is equal to y");
        // }

        // boolean isLightOn = false;

        // if (isLightOn) {
        // System.out.println("The light is on."); // This will not be printed
        // }

        // System.out.println("This line runs no matter what, because it is outside the
        // if statement.");

        // int time = 14;
        // if (time < 10) {
        // System.out.println("good morning");
        // } else if (time < 18) {
        // System.out.println("Good day");
        // } else {
        // System.out.println("good evening");
        // }

        // int time = 20;
        // String result = (time < 18) ? "Good day." : "Good evening.";
        // System.out.println(result);

        // int x = 15;
        // int y = 25;

        // if (x > 10) {
        // System.out.println("x is greater tha 10");

        // // Nested if
        // if (y > 20) {
        // System.out.println("y is also greater than 20");

        // }

        // }

        // int age = 20;
        // boolean isCitizen = true;

        // if (age >= 18) {
        // System.out.println("old enough to vote");

        // if (isCitizen) {
        // System.out.println("and youre a citizen, you can vote now");
        // } else {
        // System.out.println("But you must be a citizen to vote.");

        // }
        // } else {
        // System.out.println("Not old enough to vote");
        // }

        // int a = 200;
        // int b = 33;
        // int c = 500;

        // if (a > b && c > a) {
        // System.out.println("Both conditions are true");
        // }

        // int a = 200;
        // int b = 33;
        // int c = 500;

        // if (a > b || a > c) {
        // System.out.println("At least one condition is true");
        // }

        // int a = 30;
        // int b = 200;

        // if (!(a > b)) {
        // System.out.println("a is NOT greater than b");
        // }

        // boolean isLoggedIn = true;
        // boolean isAdmin = false;
        // int securityLevel = 3; // 1 = highest

        // if (isLoggedIn && (isAdmin || securityLevel <= 2)) { // false
        // System.out.println("Access granted");
        // } else {
        // System.out.println("Access denied");
        // }

        // int doorCode = 1337;

        // if (doorCode == 1337) {
        //     System.out.println("Correct code. The door is now open.");
        // } else {
        //     System.out.println("Wrong code. The door remains closed.");
        // }


        int number = 3;
        if(number % 2 == 0) {
            System.out.println("number is even");
        }else {
            System.out.println("number is odd");
        }
    }
}
