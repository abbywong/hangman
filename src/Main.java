public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hangman!");
        SecretWord word = new SecretWord();
        Player player = new Player();
        Game hangman = new Game(word, player);
        hangman.play();
    }
}


