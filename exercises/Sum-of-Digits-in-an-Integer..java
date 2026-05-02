import java.util.Scanner; 

public class Solution{ 

    public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in);
          short number = scanner.nextShort();
          int sum = 0;
          if( number >= 0 && number <= 1000){
            while(number > 0) {
                int digit = number % 10;
                sum += digit ;
               number =  (short)(number / 10 );
             }
              System.out.println(sum);
          
          }else{
            System.out.println("Invalid Input");
          }
          

     

    scanner.close();   
    }
    } 




