
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int start,end;
        int total=0;
         
        System.out.println("First number?");
        start = scanner.nextInt();
        System.out.println("Last number?");
        end = scanner.nextInt();
        
        for(int i = start;i<=end;i++){
            
            total = total+i;
        
        }
        System.out.println("The sum is: "+total);
        

    }
}
