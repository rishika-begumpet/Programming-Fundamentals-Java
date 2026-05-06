import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int number1 = sc.nextInt();
        int add = sc.nextInt();
        int subtract = sc.nextInt();
        int totalAmount = 0;
        if(number1 > 0 && add > 0 && subtract > 0){
            totalAmount = number1 + add - subtract;
            System.out.println(totalAmount);
        }else{
            System.out.println("Invalid Input");
        }
        sc.close(); 
    } 
}