import java.util.*;
public class DigitSum {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum;
        if(n%9 !=0)
        {
            sum=n%9;
        }
        else
        {
            if(n!=0)
            sum=9;
            else
             sum=0;
        }

        int x= (n%9 !=0) ? n%9 : n!=0? 9:0;

        System.out.println(x);

        System.out.printf("%d", (n%9!=0)? n%9 :n!=0?9:0);
        sc.close();
    }
    
}
