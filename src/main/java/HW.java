import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;



public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = sc.nextLine();
        System.out.println("You entered: " + userInput);
        boolean isNum = isNumeric(userInput);
        String isNumString;
        if (isNum){
            isNumString = " is a number";
        } else {
            isNumString = " is not a number";
        }
        System.out.println(userInput + isNumString);
        System.out.println("Flipped Case: " + swapCase(userInput));
        System.out.println("Reversed: " + reverse(userInput));
    }
}
