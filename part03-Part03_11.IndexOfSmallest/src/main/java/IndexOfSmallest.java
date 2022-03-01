//Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops. After this the program will print the smallest number in the list, and also the indices where that number is found. Notice: the smallest number can appear multiple times in the list.

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        
        int index;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program that reads user input
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            list.add(input);

        }
        // until the user enters 9999

        // after that, the program prints the smallest number
        
        int smallestNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallestNumber) {
                smallestNumber = list.get(i);
                
            }
            

        }
        System.out.println("Smallest number: "+smallestNumber);

        for (int i = 0; i < list.size(); i++) {
           if(smallestNumber==list.get(i)){
               index = i;
               System.out.println("Found at index: "+index);
           }
            
  
        }
        
        
        
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
