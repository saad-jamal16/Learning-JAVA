import java.util.*;
public class weekdays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("input number: ");
        int num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }


    }
}
