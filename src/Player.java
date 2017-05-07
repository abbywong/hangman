import java.util.Scanner;

public class Player {
    Scanner reader = new Scanner(System.in);

    public char guessLetter() {
        System.out.println("Please enter a letter");
        String guessLetter = reader.next().toLowerCase();
        while ( ! guessLetter.matches("^[a-z]")) {
            System.out.println("That's not a real letter, you silly!");
            guessLetter = reader.next().toLowerCase();
        }
        return guessLetter.charAt(0);
    }
}
