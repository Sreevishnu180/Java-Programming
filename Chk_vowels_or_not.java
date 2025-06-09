import java.util.*;

public class Chk_vowels_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean is_vowel = false;
        char[] vowels ={'a','e','i','o','u'};
        System.out.println("Enter the Alphabet: ");
        char letter = sc.next().charAt(0);
        letter = Character.toLowerCase(letter);
        
        for(int i = 0; i < vowels.length; i++){
            if (Character.toLowerCase(letter) ==  vowels[i])
            {
                is_vowel = true;
            }
        }
        if (is_vowel == true){
            System.out.println("Vowel");
        }
        else{
            System.out.println(" Not a Vowel");
        }


    }
    
}
