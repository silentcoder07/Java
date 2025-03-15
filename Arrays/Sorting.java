package Arrays;
import java.util.*;

public class Sorting {


    public static void insertionSort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;

            while(j>=0 &&  a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }

            a[j+1]=key;   
        }
    }


    public static void selectionSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;

            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }

            int temp =a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }


    public static int[] inputarr()
    {
        int a[];
        System.out.println("Enter the size of an array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter elements of the array");
        a =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        return a;
    }


    public static void display(int a[])
    {
        for(int x:a)
        System.out.print(x+" ");
    }

    public static void main(String [] args)
    {
        int[] arr=inputarr();
        //selectionSort(arr);
        insertionSort(arr);
        display(arr);
    
    }
    
}
