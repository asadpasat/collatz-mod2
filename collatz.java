"""taking mod2 of collatz sequence"""
public class collatz {
 
   public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);
      collatz(n);
      System.out.println();
    }
 
   public static void collatz(int n) {
    //  System.out.print(n + " ");
      if (n == 1) {
         System.out.print(" 1.");
         return;
      } else if (n % 2 == 0) {
          System.out.print(" 0");
          collatz(n / 2);
      } else {
      	System.out.print(" 1");
         collatz(3*n + 1);
      }
   }
}