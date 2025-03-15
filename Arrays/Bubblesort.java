package Arrays;
import java.util.*;

public class Bubblesort {
    //sorting arrr via bubble sort
    public static void sorting(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp= a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    //printing array
    public static void displayArr(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }

        System.out.println();
    }


    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();

        int [] arr= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        sorting(arr);
        displayArr(arr);
        sc.close();

    }
    
}
