import java.util.*;
public class table{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n,i,table;
        {

            System.out.println("input number to be calculated: ");
            n= sc.nextInt();
        }


        for(i=1; i<=10; i++){
            table = n*i;
            System.out.println(n+"x"+i +"=" +table);
        }

    }
}
