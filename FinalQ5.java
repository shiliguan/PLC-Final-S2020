/*This code finds the first row of an n by n integer matrix named x that has nothing but zero values.*/
import java.util.*;
public class FinalQ5{
	public static void main(String[] args) {
	    int i, j, n = 4, row = -1;
        int[][] x = {{0, 1, 2, 3}, 
                     {1, 2, 3, 4},
                     {0, 0, 0, 0},
                     {3, 0, 2, 1}};
                     
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                if(x[i][j] != 0)
                break;
                else if(j == n-1 && x[i][j] == 0){
                    row = i;
                    break;
                }
            }
        }
        
        if (row == -1){
            System.out.println("None");
        }else{
            System.out.println("First all-zero row is #" + (row + 1));
        }
	}
}
