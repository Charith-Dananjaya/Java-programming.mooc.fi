
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count =0;
        float total =0;
        
        
        while(true){
            
            int num = scanner.nextInt();
            
            if(num==0 && count==0){
                System.out.println("Cannot calculate the average");
                break; 
                
            }else if(num==0){
                break;
            
            }else if(num>0){
                count++;
                total = total+num;
            }
        }
        System.out.println(total/(float)count);
                

    }
}
