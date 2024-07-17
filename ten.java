import java.util.*;
public class ten{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i,j, n =1;
        System.out.print("Input the number: ");
         n = sc.nextInt();
         for(i = 1; i<n; i++){
             for(j =1; j <= i; j++){
                 System.out.print(j);
             }
             System.out.println();
         }
    }

}