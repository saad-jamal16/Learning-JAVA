import java.util.*;
public class middlefun4 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();
        System.out.println("the middle character in the string " + middle(str));
    }
    public static String middle(String str){
        int length;
        int position;
        if (str.length() % 2 ==0){
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }

}


