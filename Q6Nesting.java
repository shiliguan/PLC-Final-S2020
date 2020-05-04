/*plc - Final Spring 2020
#6, with nesting */
import java.util.*;
public class Q6Nesting{
  public static void main(String[] args){
  int x, y, z;
  int max = 0, min = 0, mid = 0;
  
  Scanner input = new Scanner(System.in);
  System.out.println("Enter 3 integers: ");
  x = input.nextInt();
  y = input.nextInt();
  z = input.nextInt();
  
  if(x > y){
      if(x > z){
         if(y> z){
            max = x; mid = y; min = z; 
         }else{
            max = x; min = y; mid = z;
         } 
      }else{
         max = z; min = y; mid = x;
      }
  }else{
      if (y < z){
          max = z; min = x; mid = y;
      }else{
          if(x < z){
             max = y; mid = z; min = x;
          }else{
             max = y; mid = x; mid = z;
          }
      }
  }
     System.out.println("Maximum is " + max);
     System.out.println("Medium is " + mid);
     System.out.println("Minimum is " + min);
   
  }//main 
}//class