package Basics;

public class TotalCost {
    public static void main(String[] args) {
        int items = 50;
        float perItem = 9.99f;
        float totalCost = items * perItem;
        char currency = '$';


        System.out.println("Number of Items: " + items);
        System.out.println("cost of per Items: " + perItem);
        System.out.println("Total: " + totalCost + currency);

    }
}
