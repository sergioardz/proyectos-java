import java.util.Scanner;

public class HangmanS3 {
    public static boolean isWordGuessed(String secretWord, char[] lettersGuessed) {
        for (int i = 0; i < secretWord.length(); i++) {
            char c = secretWord.charAt(i);
            if (new String(lettersGuessed).indexOf(c) < 0) {
                return false;
            }
        }
        return true;
    }

    public static String getGuessedWord(String secretWord, char[] lettersGuessed) {
        String aux = new String(secretWord);
        for (int i = 0; i < secretWord.length(); i++) {
            char c = secretWord.charAt(i);
            if (new String(lettersGuessed).indexOf(c) < 0) {
                aux = aux.replace(c, '_');
            }
        }
        return aux;
    }

    public static String getAvailableLetters(char[] lettersGuessed) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String aux = new String(letters);
        char empty = 0;
        for (char c:lettersGuessed) {
            if (aux.indexOf(c) >= 0) {
                aux = aux.replace(c, empty);
            }
        }
        return aux;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wordToGuess = "apple";
        int wordLength = wordToGuess.length();
        System.out.println("Welcome to the game, Hangman!");
        System.out.println("'I am thinking of a word that is " + wordLength + " letters long");
        System.out.println("-------------");
        char[] lettersGuessed = {};
        int guesses = 8;
        while (guesses > 0) {
            if (isWordGuessed(wordToGuess, lettersGuessed)) {
                System.out.println("Congratulations, you won!");
            } else {
                System.out.println("You have " + guesses + " left");
                System.out.println("Available letters: " + getAvailableLetters(lettersGuessed));
                System.out.print("Please guess a letter: ");
                char letter = input.next().charAt(0);
                char letterLower = Character.toLowerCase(letter);
                System.out.println("Still working on it..... I suggest you hit hit ctrl + c");
                for (char c:lettersGuessed) {
                    if (c == letterLower) {
                        System.out.println("Oops! You\'ve already guessed that letter: " + getGuessedWord(wordToGuess, lettersGuessed));
                        System.out.println("-------------");
                    } else {
                        
                    }
                }   
            }
        }
        // String word = "apple";
        // char[] letters = {'p', 'z', 'e', 'i'};
        // boolean apple = isWordGuessed(word,letters);
        // System.out.println(apple);
        // String modWord = getGuessedWord(word, letters);
        // System.out.println(modWord);
        // String available = getAvailableLetters(letters);
        // System.out.println(available);
        // System.out.println("You entered: " + letter);
        input.close();
    }
}