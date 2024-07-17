import java.util.*;
public class bmi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input weight in pounds");
        double weight = sc.nextDouble();

        System.out.print("input height in inch: ");
        double height = sc.nextDouble();

        double BMI = weight * 0.45359237/(height* 0.0254 * height*0.0254);
        System.out.println("body mass index is: "+BMI+"\n");
    }
}