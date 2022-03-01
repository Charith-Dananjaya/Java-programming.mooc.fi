
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float average = 0;
        float total = 0;
        float count = 0;
        
        while(true){
            
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            
            if(num==0){
            
                break;
            }else{
                count++;
                System.out.println(count);
                total = total + num;
                System.out.println(total);
                average = total/count;
                System.out.println(average);
            
                
            }
            
       
        }
        System.out.println("Average of the numbers: "+average);
                

    }
}
