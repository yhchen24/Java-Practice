// You-Hsin Chen
// 02/11/2020
// CSE142
// TA: Ana Jojic
// Assignment #5
//
// This program will create a number guessing game and show the statistical result at the end.
import java.util.*;

public class GuessingGame {
   public static final int MAX = 100;
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      Random r = new Random();
      
      intro();
      int games = 1;
      int numGuess = singleGame(console, r);
      int totalGuess = numGuess;
      int minGuess = numGuess;
      System.out.print("Do you want to play again? ");
      String yn = console.next();
      while (yn.startsWith("y") || yn.startsWith("Y")) {
         System.out.println();
         numGuess = singleGame(console, r);
         if (minGuess > numGuess) {
            minGuess = numGuess;
         }
         games++;
         totalGuess += numGuess;
         System.out.print("Do you want to play again? ");
         yn = console.next();
      }
      statistics(games, totalGuess, minGuess);
   }
   
   // shows a haiku related to the guessing game.
   public static void intro() {
      System.out.println("Great game forever.");
      System.out.println("Guessing number is so cool.");
      System.out.println("Surely play more.");
      System.out.println();
   }
   
   // creates a number and returns how many times the user guesses.
   public static int singleGame(Scanner console, Random r) {
      System.out.println("I'm thinking of a number between 1 and " + MAX + "...");
      int ans = r.nextInt(MAX) + 1;
      System.out.print("Your guess? ");
      int guess = console.nextInt();
      int numGuess = 1;
      while (guess != ans) {
         if (ans > guess) {
            System.out.println("It's higher.");
         } else {
            System.out.println("It's lower.");
         }
         System.out.print("Your guess? ");
         guess = console.nextInt();
         numGuess++;
      }
      if (numGuess == 1) {
         System.out.println("You got it right in 1 guess!");
      } else {
         System.out.println("You got it right in " + numGuess + " guesses!");
      }
      return numGuess;
   }
   
   // shows the statistical result of the game.
   public static void statistics(int games, int totalGuess, int minGuess) {
      System.out.println();
      System.out.println("Overall results:");
      System.out.println("Total games   = " + games);
      System.out.println("Total guesses = " + totalGuess);
      System.out.println("Guesses/game  = " + round1((double)totalGuess / games));
      System.out.println("Best game     = " + minGuess);
   }
   
   // Returns the given number rounded to one decimal place.
   public static double round1(double num) {
      return Math.round(num * 10.0) / 10.0;
   }
   
}