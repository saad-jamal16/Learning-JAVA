import java.util.Scanner;
public class samenum{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input floating point number 1: ");
        double num1 = sc.nextDouble();
        System.out.println("Input floating point number 2 ");
        double num2 = sc.nextDouble();

        if(num1 ==  num2){
            System.out.println("They are same");
        }
        else{
            System.out.println("they are not same");
        }

    }

}