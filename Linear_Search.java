import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10,20,30,40,50};
        System.out.println("Enter Your Key");
        int Key = sc.nextInt();
        
        boolean found = false;
        for(int i = 0; i < a.length;i++){
            if(a[i] == Key){
                System.out.println("Element Found at index:" +i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }


    }
    
}
