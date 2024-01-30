import java.util.*;

public class Main {

    //VARIABLES
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int numberToGuess = rand.nextInt(10);
    static int guessedNum = 0;
    static int totalGuesses = 0;
    private static boolean correctGuess = false;

    public static void main(String[] args)
    {
        System.out.println("Hello User, please guess a number from 0-10");
        while (totalGuesses <= 2){
            checkGuessNumber(getUserGuess());
            totalGuesses++;
        }
        System.out.println("Sorry, you didn't guess the correct number before your tries ran out!");
        System.exit(0);
    }

    static int GetUserGuess(){
        try{
            return guessedNum = scanner.nextInt();
        } catch(Exception e){
            System.out.println("You didn't enter a number between 0-10, the input must be a number!");
            System.exit(0);
        }
        return 0;
    }

    static void checkGuessNumber(int guessedNum){
        if (guessedNum == numberToGuess){
            System.out.println("Congratulations!!! You guessed the correct number: " + guessedNum);
            correctGuess = true;
        } else if (guessedNum < numberToGuess) {
            System.out.println("The number " + guessedNum + " is too low, try again!");
        } else{
            System.out.println("The number " + guessedNum + " is too high, try again!");
        }
        quitIfCorrectGuess();
        System.out.println("You have " + (2 - totalGuesses) + " guesses left!");
    }

    static void quitIfCorrectGuess(){
        if (correctGuess){
            System.exit(0);
        }
    }
}
