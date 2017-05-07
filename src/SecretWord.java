
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SecretWord {
//    private final List<String> words = Arrays.asList("a", "beibei", "turtle", "flabbergasted", "mapodoufu", "oma", "last");
    private final List<String> words = Arrays.asList("beibei");
    private String word;

    public SecretWord() {
        Random gen = new Random();
        int choiceNumber = gen.nextInt(words.size());
        word = words.get(choiceNumber);
    }

    /*
    Returns the positions of the letters in the word, if they are present.
     */
    public List<Integer> checkLetter(char guess) {
//        for (char letter : word.toCharArray()) {
        List<Integer> positions = new ArrayList<>();
        for (int pos = 0; pos < word.length(); pos++) {
//            System.out.println(word.charAt(pos) + " , " + guess);
            if (word.charAt(pos) == guess) {
                positions.add(new Integer(pos));
            }
        }
        return positions;
    }

    public int getLength() {
        return word.length();
    }
}
