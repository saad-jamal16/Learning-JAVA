import java.util.*;
public class mensuration{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input distance in meters: ");
        float distance = sc.nextFloat();

        System.out.println("input hour: ");
        float hr = sc.nextFloat();

        System.out.println("input minutes: ");
        float min = sc.nextFloat();

        System.out.println("input seconds: ");
        float sec = sc.nextFloat();

        float timeseconds;
        float mps,kph,mph;

        timeseconds = (hr* 3600)+(min*60)+sec;
        mps =  distance / timeseconds;
        kph = (distance / 1000.0f)/ (timeseconds/3600.0f);
        mph = kph / 1.609f;

        System.out.println("your speed in meters/second is "+mps);
        System.out.println("your speed in km/h is "+kph);
        System.out.println("your speed in miles/h is "+mph);


    }
}
