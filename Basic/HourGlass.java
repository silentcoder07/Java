import java.util.*;
public class HourGlass {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=0;

        for(int i=n;i>=0;i--)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");

            }
            for(int j=i;j>=0;j--)
            {
                System.out.print(j+" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
            sp=sp+1;
        }

        sp=sp-2;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }

            for(int j=i;j>=0;j--)
            {
                System.out.print(j+" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
            sp--;
        }

        sc.close();


    }
    
}
