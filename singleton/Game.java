package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
 * This class is a singleton that represents the game.
 */
public class Game {
    
    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    /*
     * Private constructor to prevent instantiation.
     */
    private Game() {
        rand = new Random();
        level = Difficulty.EASY;
        anagrams = new HashMap<Difficulty, ArrayList<Anagram>>();
        anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
        anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
        anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
        currentAnagram = anagrams.get(level).get(rand.nextInt(anagrams.get(level).size()));
        score = 0;
    }

    /*
     * Returns the instance of the singleton.
     * @return The instance of the singleton
     */
    public static Game getInstance() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }

    /*
     * Returns the current anagram.
     * @return The current anagram
     */
    public String getQuestion() {
        if (score >= 3 && level == Difficulty.EASY) {
            level = Difficulty.MEDIUM;
        } else if (score >= 6 && level == Difficulty.MEDIUM) {
            level = Difficulty.HARD;
        }
        currentAnagram = anagrams.get(level).get(rand.nextInt(anagrams.get(level).size()));
        return currentAnagram.getQuestion();
    }

    /*
     * Checks if the guess is correct.
     * @param guess The user's guess
     * @return True if the guess is correct, false otherwise
     */
    public boolean isCorrect(String guess) {
        boolean result = currentAnagram.isCorrect(guess);
        if (result) {
            score++;
        }
        return result;
    }

    /*
     * Returns the current score.
     * @return The current score
     */
    public int getScore() {
        return score;
    }

}
