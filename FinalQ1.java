/*state diagram, inital state update after an event triggered. 
the state change, after the event, it then reach to final state
Final Question #1
*/
public class FinalQ1{
   public static void main(String[] args){
       //floating-point
       float y = (float)11.111;
       System.out.println("inital y = "+ y);
       while(y > 1 && y <= 20){
           y--;
           System.out.print(y + " "); //event change value of floating point y
       }
       System.out.println(" ");
       System.out.println("After event while loop y =  " + (int)y+"\n");

       //inital state of integer
       int x = 0;
       System.out.println("inital x = "+ x);
       for (int i = 0; i < 5; i++) {
           x = x+i;
           System.out.print(x + " ");
       }
       System.out.println(" ");
       System.out.println("After event for loop x =  " + x+"\n");
           
       //String 
       String name = "TIMMY";
       System.out.println("Change string literals from upper case: " + name);
       String lower= name.toLowerCase();
       System.out.println("to all lower case: "+lower+"\n");
       
       //switch variable's value
       String carColor = "blue";
       String newCar = "sliver";
       newCar = carColor;
       System.out.println("After swapped, newCar color = " + newCar);
   }
}