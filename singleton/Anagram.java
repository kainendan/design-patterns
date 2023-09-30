package singleton;

import java.util.ArrayList;

/*
 * This class represents an anagram.
 */
public class Anagram {
    
    private String question;
    private ArrayList<String> answers;

    /*
     * Constructor for an anagram.
     * @param question The given string
     * @param answers The possible anagram answers
     */
    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    /*
     * Returns the anagram question.
     * @return The anagram question
     */
    public String getQuestion() {
        return question;
    }

    /*
     * Checks if the guess is correct.
     * @param guess The user's guess
     * @return True if the guess is correct, false otherwise
     */
    public boolean isCorrect(String guess) {
        return answers.contains(guess);
    }
}
