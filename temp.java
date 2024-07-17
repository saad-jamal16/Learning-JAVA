import java.util.*;
public class temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input degree in fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius =((5* (fahrenheit - 32.0))/9.0);
        System.out.println(fahrenheit + "degree fahrenheit is equal to"+celsius +"in celsius");


    }
}