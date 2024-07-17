import java.util.*;
public class wordsfun6 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input the string: ");
        String str = sc.nextLine();
        System.out.println("Number of words in string is "+ countword(str));
    }
    public static int countword(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        count = count + 1;
        return count;
    }
}
