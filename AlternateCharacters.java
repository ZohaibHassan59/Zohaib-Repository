import java.util.Scanner;

public class AlternateCharacters {
    
    // Method to extract alternate characters from a string
    public static String getAlternateCharacters(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {  // Step of 2 to get alternate characters
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Calling the method and displaying the result
        String alternateString = getAlternateCharacters(userInput);
        System.out.println("Alternate characters: " + alternateString);

        scanner.close();
    }
}
