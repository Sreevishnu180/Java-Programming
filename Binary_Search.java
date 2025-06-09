import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] a = {100,200,300,400,500};
        System.out.println("Enter your Key");
        int Key = sc.nextInt();

        int left= 0;
        int right= a.length - 1;
        boolean found = false;

        while(left <=right){
            int mid = left + (right - left)/2;
            if(a[mid] == Key){
                System.out.println("Found at index:" + mid);
                found = true;
                break;
            }
            else if(a[mid]<Key){
                left = mid + 1;
             }
             else{
                right = mid-1;
             }
        }
    if (!found){
        System.out.println("Element not found");
    }
    }
    
}
