import java.util.*;
public class vowelsfun5 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("input the string: ");
        String str = sc.nextLine();
        System.out.println("number of vowels in the string is: "+vowel(str));
    }
    public static int vowel(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) =='i'||
                str.charAt(i) == 'o' || str.charAt(i) == 'u')
        {
                count ++;
        }

        }
        return count;

    }
}




