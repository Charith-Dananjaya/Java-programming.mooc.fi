
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        
        while(true){
            System.out.println("Give a number:");
            int value = scanner.nextInt();
            
            if(value==0){
                break;    
            }else{
                total = total + value;
            }
        
        }
        System.out.println("Sum of the numbers: "+total);

    }
}
