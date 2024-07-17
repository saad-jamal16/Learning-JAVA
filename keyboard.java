import java.util.*;
public class keyboard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n=0,s=0;
        double avg;
        {
            System.out.println("input the 5 number: ");
        }
        for(i = 0; i<5; i++){
            n = sc.nextInt();
            s += n;
        }
        avg = s/5;
        System.out.println("the sum of 5 number is: "+s+ "\n the average is : "+avg);

    }
}