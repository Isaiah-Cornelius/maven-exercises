import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.swapCase;
import static org.apache.commons.lang3.StringUtils.reverse;


public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = sc.nextLine();
        System.out.println("You entered: " + userInput);
        System.out.println("Flipped Case: " + swapCase(userInput));
        System.out.println("Reversed: " + reverse(userInput));
    }
}
