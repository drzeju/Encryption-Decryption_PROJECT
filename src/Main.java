import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

//        String message = scanner.nextLine();

        String message = "we found a treasure!";
        char [] charMessage = new char[message.length()];

        message = message.toLowerCase();

        for (int i = 0; i < message.length(); i++) {
            charMessage[i] = message.charAt(i);
        }

        int min = 97;
        int max = 122;

        for (int n : charMessage) {
            System.out.print(n > max || n < min ? (char) n : (char)(max + min - n));
        }
    }
}