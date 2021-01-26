//Fibonacci Series With Recursion
import java.util.Scanner;
public class Fibonacci {
   static int n1 = 0, n2 = 1, n3 = 0;
   //Function Defination
   static void fib(int count) {
      if (count > 0) {
         n3 = n1 + n2;
         n1 = n2;
         n2 = n3;
         System.out.print(" " + n3);
         fib(count - 1);   //recursive function
      }
   }
   public static void main(String args[]) {
      Scanner s =new Scanner(System.in);
      System.out.println("How many numbers you want of fibonacci series :");
      int num = s.nextInt(); 
      System.out.print(n1 + " " + n2);
      fib(num - 2);  //function call
   }
}
