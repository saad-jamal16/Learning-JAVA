import java.util.*;
public class leapyear{
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.println ("Input year : ");
        int year = sc.nextInt();

        boolean x = (year % 4) ==0;
        boolean y = (year % 100) ==0;
        boolean z = (year % 400) == 0;

        if(x && (y||z)){
            System.out.println(year +  "year is leap year");
        }
        else{
            System.out.println(year +  "is not a leap year");
        }

        System.out.println("Input again to check");
        int year2 = sc.nextInt();


        boolean a = (year % 4) ==0;
        boolean b = (year % 100) ==0;
        boolean c = (year % 400) == 0;

        if(x && (y||z)){
            System.out.println(year2 +  "year is leap year");
        }
        else{
            System.out.println(year2 +  "is not a leap year");
        }




    }


}