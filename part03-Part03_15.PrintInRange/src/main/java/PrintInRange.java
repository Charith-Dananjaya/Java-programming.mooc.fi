
//Create the method public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) in the exercise template. The method prints the numbers in the given list whose values are in the range [lowerLimit, upperLimit].
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in range [" + lowerLimit + ", " + upperLimit + "]");
        for (Integer num : numbers) {

            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);

            }

        }

    }

}
