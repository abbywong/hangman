import java.util.ArrayList;
import java.util.List;

public class Game {
    private final SecretWord word;
    private final Player player;
    char[] knownLetters;

    public Game(SecretWord word, Player player) {
        this.word = word;
        this.player = player;
        this.knownLetters = new char[word.getLength()];
        for (int i = 0; i < this.knownLetters.length; i++) {
            this.knownLetters[i] = '_';
        }
    }

    public void printWord() {
        for (int i = 0; i < this.knownLetters.length; i++) {
            System.out.print(this.knownLetters[i] + " ");
        }
        System.out.println("");
    }

    public void play() {
        printWord();
        char guess = player.guessLetter();
        List<Integer> positions = word.checkLetter(guess);
        if (positions.size() > 0) {
            // Correct guess
            for (int pos : positions) {
                this.knownLetters[pos] = guess;
            }
        } else {
            // Incorrect guess
            System.out.println("WRONG!");
        }
        printWord();
    }
}
