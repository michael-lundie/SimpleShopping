import java.util.Scanner;

public class Utils {
    /**
     * Checks scanner for a valid input of type int.
     * Once input is validated, returns int.
     *
     * @param scanner
     * @param errorPrompt input a custom message to relay error to user
     * @return int return valid itn value
     */
    public static int getValidIntInput(Scanner scanner, String errorPrompt) {
        boolean inputValid = false;
        int i = 0;
        while (!inputValid) {
            if (scanner.hasNextInt()) {
                i = scanner.nextInt();
                // Calling nextLine() consumes the invisible newline character created when
                // pressing enter. Reference: https://stackoverflow.com/a/13102066
                scanner.nextLine();
                inputValid = true;
            } else {
                System.out.println(errorPrompt);
                scanner.next();
            }
        }
        return i;
    }

    /**
     * Checks scanner for a valid input of type String.
     * Once input is validated, returns String (full line).
     *
     * @param scanner
     * @return return a valid value value
     * @prompt String Message to relay error to user
     */
    public static String getValidLineInput(Scanner scanner, String errorPrompt) {
        boolean inputValid = false;
        String stringInput = "";
        while (!inputValid) {
            if (scanner.hasNextLine()) {
                stringInput = scanner.nextLine();
                inputValid = true;
            } else {
                System.out.println(errorPrompt);
                scanner.next();
            }
        }
        return stringInput;
    }
}