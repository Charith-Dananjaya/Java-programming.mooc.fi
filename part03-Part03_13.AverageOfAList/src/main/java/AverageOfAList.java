
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();

      while(true){
          int input = scanner.nextInt();
          
          if(input==-1){
              break;
          }
          
          list.add(input);
          
      }
      
      for(Integer number :list){
          sum = sum + (float)number;
      }
      
      System.out.println("Average: "+sum/(float)list.size());
     
      
      
      
        
    }
}
