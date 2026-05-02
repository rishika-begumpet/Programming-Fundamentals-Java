import java.util.Scanner; 

    public class Solution { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 
        long number = scanner.nextLong();
        if(number > 0){
            System.out.println("Multiplication Table of " + number + ":");
        for( int i = 1 ;i <= 10; i++){
            long result = number*i;
                System.out.println (number + " * " + i + " = " + result );
             }
             }else {
                System.out.println("Invalid Input");
             }
             scanner.close(); 

            }
        

        
        
    }

     

