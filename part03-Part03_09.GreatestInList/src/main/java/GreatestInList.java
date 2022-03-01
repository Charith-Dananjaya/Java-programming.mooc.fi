
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        int largest = 0;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        for(int i = 0 ;i<list.size();i++){
            
            if(largest<list.get(i)){
                largest=list.get(i);
            }
        }
        
        System.out.println("The greatest number: "+largest);
    }
}
