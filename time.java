import java.util.*;
public class time{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("input the number of minutes: ");
        double min = sc.nextDouble();

        double minutesInYear = 60*24*365;
        long years =(long)(min/minutesInYear);
        int days = (int)(min/60/24)%365;

        System.out.println(min+"minutes is approximately "+years+"years and"+days+"days");
    }
}
