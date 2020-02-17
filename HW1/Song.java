// You-Hsin Chen
// 01/13/2020
// CSE142
// TA: Ana Jojic
// Assignment #1
//
// This program will produce the song "There Was an Old Woman Who Swallowed a Fly."
public class Song {
   public static void main (String[] args) {
      firstVerse();
      System.out.println();
      secondVerse();
      System.out.println();
      thirdVerse();
      System.out.println();
      forthVerse();
      System.out.println();
      fifthVerse();
      System.out.println();
      sixthVerse();
      System.out.println();
      seventhVerse();
   }
   public static void firstVerse() {
      System.out.println("There was an old woman who swallowed a fly.");
      lastTwoLines();
   }
   public static void secondVerse() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      spiderFly();
      lastTwoLines();
   }
   public static void spiderFly() {
      System.out.println("She swallowed the spider to catch the fly,");
   }
   public static void thirdVerse() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      birdSpider();
      spiderFly();
      lastTwoLines();
   }
   public static void birdSpider() {
      System.out.println("She swallowed the bird to catch the spider,");
   }
   public static void forthVerse() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      catBird();
      birdSpider();
      spiderFly();
      lastTwoLines();
   }
   public static void catBird() {
      System.out.println("She swallowed the cat to catch the bird,");
   }
   public static void fifthVerse() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      dogCat();
      catBird();
      birdSpider();
      spiderFly();
      lastTwoLines();
   }
   public static void dogCat() {
      System.out.println("She swallowed the dog to catch the cat,");
   }
   public static void sixthVerse() {
      System.out.println("There was an old woman who swallowed a snake,");
      System.out.println("What a creepy snack.");
      System.out.println("She swallowed the snake to catch the dog,");
      dogCat();
      catBird();
      birdSpider();
      spiderFly();
      lastTwoLines();
   }
   public static void seventhVerse() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }
   public static void lastTwoLines() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
   }   
}