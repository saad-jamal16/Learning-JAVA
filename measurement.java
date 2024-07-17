import java.util.*;
public class measurement{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input number in inch: ");
        double inch =sc.nextDouble();
        double meter =  inch* 0.0254;
        System.out.print("inch is "+meter +"meters");
    }
}
