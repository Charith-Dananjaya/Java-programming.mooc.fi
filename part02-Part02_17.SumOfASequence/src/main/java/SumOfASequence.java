
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int lastnum;
        int total =0;
        
        lastnum = scanner.nextInt();
        
        for(int i=0;i<=lastnum;i++){
            total = total+i;
        }
        
        System.out.println("The sum is "+total);

    }
}
