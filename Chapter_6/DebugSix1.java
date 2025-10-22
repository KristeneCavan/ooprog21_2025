import java.util.Scanner;

public class DebugSix1 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int days;
      double money = 0.01;
      int day = 1;

      System.out.print("Enter number of days >> "); // added missing semicolon
      days = keyboard.nextInt();

      while(day <= days) { // fixed condition (was reversed)
         System.out.println("After day " + day + " you have " + money);
         money = 2 * money; // doubled money *after* showing current day's amount
         ++day;
      }

      keyboard.close();
   }
}
