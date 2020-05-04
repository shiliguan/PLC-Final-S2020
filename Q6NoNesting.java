import java.util.*;
public class Q6NoNesting{
   public static void main(String[] args){
      int x, y, z;
      int max = 0, min = 0, mid = 0;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter 3 integers: ");
      x = input.nextInt();
      y = input.nextInt();
      z = input.nextInt();
      
      if (x > y && x > z && y > z){
         max = x; mid = y; min = z;
      }else if(x > y && x > z && y < z){
         max = x; mid = z; min = y;
      }else if(y > z && y > x && x > z){
         max = y; mid = x; min = z;
      }else if(y > z && y > x && x < z){
         max = y; mid = z; min = x;
      }else if(z > y && z > x && x >y){
         max = z; mid = x; min = y;
      }else{
         max = z; mid = y; min = x;
      }
      
      System.out.println("Maximum is " + max);
      System.out.println("Medium is " + mid);
      System.out.println("Minimum is " + min);
   }//main
}//public class