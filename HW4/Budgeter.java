// You-Hsin Chen
// 02/04/2020
// CSE142
// TA: Ana Jojic
// Assignment #4
//
// This program will calculate monthly budget and show details of income and expenses.
import java.util.*;
public class Budgeter {
   public static final int DAYS = 31;
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      intro();
      double totalInc = askingPart(console, "income");
      double totalExp = askingPart(console, "expense");
      totalAmount(totalInc, totalExp);
      comment(totalExp - totalInc);
   }
   
   // Introduce what the program is gonna do.
   public static void intro() {
      System.out.println("This program asks for your monthly income and");
      System.out.println("expenses, then tells you your net monthly income.");
      System.out.println();
   }
   
   // For expenses, choose the type of expenses and then enter categories of expenses and 
   // the corresponding amounts. Then, it will return total monthly expenses.
   // For imcome, enter categories of income and the corresponding amounts.
   // Then, it will return total monthly income.
   public static double askingPart(Scanner console, String type) {
      int typeExp = 0;
      if (type.equals("expense")) {
         System.out.print("Enter 1) monthly or 2) daily expenses? ");
         typeExp = console.nextInt();
      }
      System.out.print("How many categories of " + type + "? ");
      int numType = console.nextInt();
      double total = 0;
      for (int i = 1; i <= numType; i ++) {
         if (type.equals("income")) {
            System.out.print("    Next income amount? $");
            total += console.nextDouble();
         }
         else if (type.equals("expense")) {
            System.out.print("    Next expense amount? $");
            if (typeExp == 1) {
               total += console.nextDouble();
            } else if (typeExp == 2) {
               total += console.nextDouble() * DAYS;
            }
         }
      }
      System.out.println();
      return total;
   }
   
   // Print out total monthly income and expenses. Besides, print out daily income and expenses.
   // Double totalInc specifies total income and Double totalExp specifies total expenses.
   public static void totalAmount(double totalInc, double totalExp) {
      System.out.println("Total income = $" + round2(totalInc) + " ($" + round2(totalInc / DAYS)
       + "/day)");
      System.out.println("Total expenses = $" + round2(totalExp) + " ($" + round2(totalExp / DAYS)
       + "/day)");
      System.out.println();
   }
   
   // Enter a number and round it to 2 decimal places. Double num specifies any input number.
   public static double round2(double num) {
      return Math.round(num * 100.0) / 100.0;
   }
   
   // Print out net income and comments. Double net specifies total expenses minus total income.
   public static void comment(double net) {
      if (net < 0) {
         System.out.println("You earned $" + (round2(net) * -1) + " more than you spent this month.");
         if (net < -250) {
            System.out.println("You're a big saver.");
            System.out.print("Good Job!");
         } else {
            System.out.println("You're a saver.");
            System.out.print("Not bad!");
         }
      } else {
         System.out.println("You spent $" + round2(net) + " more than you earned this month.");
         if (net < 250 && net >= 0) {
            System.out.println("You're a spender.");
            System.out.print("Don't spend too much!");
         } else {
            System.out.println("You're a big spender.");
            System.out.print("Stop spending money!");
         }
      }
   }
}