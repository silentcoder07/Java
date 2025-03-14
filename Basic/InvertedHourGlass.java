import java.util.*;
public class InvertedHourGlass {


    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int isp= 4*n-2;


        for(int i=n;i>=1;i--)
        {
            //int val=n;
        
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            int j=isp;
            while(j>=1)
            {
                System.out.print(" ");
                j--;
            }
            for(j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
            isp=isp-4;
        }


        for(int i=n;i>=0;i--)
        {
            System.out.print(i+" ");
        }

        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }

        System.out.println();

        isp=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }

            for(int j=1;j<=isp;j++)
            {
                System.out.print("  ");
            }

            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            isp=isp+2;


        }

        sc.close();

        
    }
    
}
