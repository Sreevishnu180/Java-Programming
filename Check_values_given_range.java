import java.util.*;

public class Check_values_given_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        if(num >= 10 && num < 100)
        {
            System.out.println("The number is in range");
        }
        else{
            System.out.println("The number is not in range");
        }
    }
    
}
