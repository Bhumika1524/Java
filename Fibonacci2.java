import java.util.Scanner;
public class Main{
   public static void main(String args[]) {
      int a, b, c, i;
      Scanner s =new Scanner(System.in);
      System.out.println("How many numbers you want of fibonacci series :");
      int n = s.nextInt(); 
      a = 0;
      b = 1;
      System.out.print(a+" "+b);
      for(i = 1; i <= n-2; i++) {
         c = a + b;
         System.out.print(" ");
         System.out.print(c);
         a = b;
         b = c;
      }
   }
}
