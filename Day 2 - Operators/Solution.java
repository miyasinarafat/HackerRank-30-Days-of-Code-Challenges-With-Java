package two;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mealCost = in.nextDouble();
        int tipPercent = in.nextInt();
        int taxPercent = in.nextInt();
        in.close();
        
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        
        System.out.println(tip);
        System.out.println(tax);
        
        int totalCost = (int) Math.round(mealCost + tip + tax);
        System.out.println("The total meal cost is "+ totalCost +" dollars.");
    }
}
