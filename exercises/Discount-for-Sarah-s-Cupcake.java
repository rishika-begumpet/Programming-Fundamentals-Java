import java.util.Scanner; 
public class Solution { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        int costOfDozen = sc.nextInt();
        int n = sc.nextInt();
        float percentageDiscount  = sc.nextFloat();
        int  totalCost = costOfDozen*n;
        float discountPercentage = (totalCost * percentageDiscount)/100;
        float totalAmount = (totalCost - discountPercentage) ;
        System.out.println( (int) totalAmount);

        sc.close(); 
    } 
}