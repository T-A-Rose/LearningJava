import java.util.*;

public class Main {

    //VARIABLES
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int numberToGuess = rand.nextInt(10);
    static int guessedNum = 0;
    static int totalGuesses = 0;

    public static void main(String[] args)
    {
        while (totalGuesses < 3){
            if (guessedNum == 0){
                System.out.println("Hello User, please guess a number from 0-10");
                CheckGuessNumber(GetUserGuess());
                totalGuesses++;
            } else {
                System.out.println("Please try again, you have " + (3 - totalGuesses) + " guesses left!");
                CheckGuessNumber(GetUserGuess());
                totalGuesses++;
            }
        }
        System.out.println("Sorry, you didn't guess the correct number before your tries ran out!");
        System.exit(0);
    }

    static int GetUserGuess(){
        return guessedNum = scanner.nextInt();
    }

    static void CheckGuessNumber(int guessedNum){
        if (guessedNum == numberToGuess){
            System.out.println("Congratulations!!! You guessed the correct number: " + guessedNum);
            System.exit(0);
        } else if (guessedNum < numberToGuess) {
            System.out.println("The number " + guessedNum + " is too low, try again!");
        } else{
            System.out.println("The number " + guessedNum + " is too high, try again!");
        }
    }

}
