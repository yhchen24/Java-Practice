// You-Hsin Chen
// 01/21/2020
// CSE142
// TA: Ana Jojic
// Assignment #2
//
// This program will produce space needle.
public class SpaceNeedle {
   public static final int SIZE = 4; 
   public static void main(String[] args) {
      bar();
      top();
      bot();
      bar();
      midBar();
      top();
   }
   // prints the needle and the thin area in the middle.
   public static void bar() {
      for (int line = 1; line <= SIZE; line++) {
         for (int i = 1; i <= 3 * SIZE; i++) {
            System.out.print(" ");
         }
         doubleBar();
         System.out.println();
      }
   }
   // prints the top half of the circle.
   public static void top() {
      for (int line = 1; line <= SIZE; line++) {
         for (int i = 1; i <= -3 * line + 3 * SIZE; i++) {
            System.out.print(" ");         
         }
         System.out.print("__/");
         for (int i = 1; i <= 3 * line - 3; i++) {
            System.out.print(":");
         }
         doubleBar();
         for (int i = 1; i <= 3 * line - 3; i++) {
            System.out.print(":");
         }
         System.out.println("\\__");
      }
      System.out.print("|");
      for (int i = 1; i <= 6 * SIZE; i++) {
         System.out.print("\"");
      }
      System.out.println("|");
   }
   // prints || sign.
   public static void doubleBar() {
      for (int i = 1; i <= 2; i++) {
         System.out.print("|");
      }
   }
   // prints the bot half of the circle.
   public static void bot() {
      for (int line = 1; line <= SIZE; line++) {
         for (int i = 1; i <= 2 * line - 2; i++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         for (int i = 1; i <= -2 * line + 3 * SIZE + 1; i++) {
            System.out.print("/\\");
         }
         System.out.println("_/");      
      }
   }
   // prints the thick area in the middle. 
   public static void midBar() {
      for (int i = 1; i <= SIZE * SIZE; i++) {
         for (int j = 1; j <= 2 * SIZE + 1; j++) {
            System.out.print(" ");
         }
         System.out.print("|");
         percent();
         doubleBar();
         percent();
         System.out.println("|");
      }
   }
   // prints % sign.
   public static void percent() {
      for (int i = 1; i <= SIZE - 2; i++) {
         System.out.print("%");
      }
   }
}