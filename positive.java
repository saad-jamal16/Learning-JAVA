import java.util.*;
public class positive{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Input a number: ");
        double num = sc.nextDouble();

        if(num == 0){
            System.out.println("zero");
        }
        else if(num >= 1){
            System.out.println("positive small number");
        }
        else if(num < 1){
            System.out.println("Small");
        }
        else if( num >= 1000){
            System.out.println("postive  large number");
            System.out.println("large");
        }

    }
}
