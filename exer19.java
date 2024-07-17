import java.util.*;
public class exer19{
    public static void main(String [] args){
        int j,i,s,x;
        Scanner sc = new Scanner (System.in);
        System.out.print("INPUT NUMBER: ");
        int n= sc.nextInt();
         s=  n+4-1;
         for( i=1; i <= 4; i++){
             for(x=s;x!=0;x--){
                 System.out.print(" ");
             }
             for( j = 1; j<=i; j++) {
                 System.out.print(i + "");
             }
                 System.out.println();
                 s--;

         }


    }
}
