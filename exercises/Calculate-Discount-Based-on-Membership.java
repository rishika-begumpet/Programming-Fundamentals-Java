import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char membership =  scanner.next().charAt(0);
        double amount = scanner.nextDouble();
        double goldDiscount = 30 ;
        double silverDiscount = 20 ;
        double RegularDiscount = 7 ;
        if(membership == 'G'){
        double discountGoldAmount = (amount * goldDiscount) / 100;
        double finalAmount = amount - discountGoldAmount ;
        System.out.println("Final Amount after Discount: " +finalAmount );
        }
        else if(membership == 'S'){
            double discountSilverAmount = (amount * silverDiscount) / 100;
            double finalAmount = amount - discountSilverAmount ; 
            System.out.println("Final Amount after Discount: " +finalAmount);
             }else if(membership == 'R'){
                double discountRegularAmount = (amount * RegularDiscount) / 100;
                 double finalAmount = amount - discountRegularAmount;
                System.out.println("Final Amount after Discount: " + finalAmount);
             }
             else {
                System.out.println("Invalid membership");
             }


        

        scanner.close();

    }
}











































