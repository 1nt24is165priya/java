import java.util.*;

public class Vowels{
    public static int vowel(String str){
        int count = 0;
        for(int i =0 ;i<str.length() ; i++){

        //String vowels = "aeiou";
        
        char ch = str.charAt(i);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            count+= 1;
        }

    }


        
        /** for(int i =0 ;i<str.length() ; i++){
            for(int j =0 ; j<vowels.length(); j++){
                if(str.charAt(i) == vowels.charAt(j)){
                    count += 1;
                }
            }

        }
            **/
        return count;

        //System.out.println("Number of vowels is : " + count);

    }

    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        String str = new Scanner(System.in).nextLine();
        System.out.println(vowel(str));
    }
}