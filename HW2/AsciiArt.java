// You-Hsin Chen
// 01/21/2020
// CSE142
// TA: Ana Jojic
// Assignment #2
//
// This program will produce Y sign.
public class AsciiArt {
   public static void main(String[] args) {
      top();
      bot();
   }
   // prints the top of Y sign.
   public static void top() {
      for (int line = 1; line <= 5; line++) {
         for (int i = 1; i <= line - 1; i++) {
            System.out.print(" ");
         }
         System.out.print("11");
         for (int i = 1; i <= -2 * line + 10; i++) {
            System.out.print(" ");
         }
         System.out.println("11");
      }      
   }
   // prints the bot of Y sign.
   public static void bot() {
      for (int line = 1; line <= 6; line++) {
         for (int i = 1; i <= 5; i++) {
            System.out.print(" ");
         }
         System.out.println("11");
      }      
   }
}