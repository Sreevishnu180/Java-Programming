/* consider 2 integers m and n, our task is to find sum of cubes from integers from m to n, 
if m>n, write 0 or display the proper message.

Sample test case 1: m=2, n=4
sample test case 2: m=4, n=4
sample test case 3: m=7,n=2 */

import java.util.*;
public class Sum_of_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
    
        if (m>n){
            System.out.println("Invalid input");
            
        }
        else{
            int sum = 0;
            for (int i = m; i<n; i++){
                int cube = i*i*i;
                sum += cube;
            }
            System.out.println("The sum of cubes from " + m +" to " + n + " is" +sum);
        }
        
    }
}
