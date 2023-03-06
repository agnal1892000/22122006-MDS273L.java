import java.util.Scanner;

public class lab5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Encrypt a message");
            System.out.println("2. Decrypt a message");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    String message = getMessageFromUser(input);
                    String encryptedMessage = encrypt(message);
                    System.out.println("Encrypted message: " + encryptedMessage);
                    break;
                case 2:
                    String encryptedMsg = getMessageFromUser(input);
                    String decryptedMessage = decrypt(encryptedMsg);
                    System.out.println("Decrypted message: " + decryptedMessage);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }

    public static String getMessageFromUser(Scanner input) {
        System.out.print("Enter a message: ");
        input.nextLine(); // consume the newline character
        return input.nextLine();
    }

    public static String encrypt(String message) {
        String cipher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                char encryptedChar = cipher.charAt(Character.toUpperCase(ch) - 65);
                if (Character.isLowerCase(ch)) {
                    encryptedMessage += Character.toLowerCase(encryptedChar);
                } else {
                    encryptedMessage += encryptedChar;
                }
            } else {
                encryptedMessage += ch;
            }
        }
        return encryptedMessage;
    }

    public static String decrypt(String encryptedMessage) {
        String cipher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String decryptedMessage = "";
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char ch = encryptedMessage.charAt(i);
            if (Character.isLetter(ch)) {
                char decryptedChar = (char) (cipher.indexOf(Character.toUpperCase(ch)) + 65);
                if (Character.isLowerCase(ch)) {
                    decryptedMessage += Character.toLowerCase(decryptedChar);
                } else {
                    decryptedMessage += decryptedChar;
                }
            } else {
                decryptedMessage += ch;
            }
        }
        return decryptedMessage;
    }
}




