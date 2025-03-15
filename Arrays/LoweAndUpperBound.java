package Arrays;

public class LoweAndUpperBound {


    public static int lowerBound(int a[],int n)
    {
        int ans=-1;
        int low=0,high=a.length -1;

        while(low<=high)
        {
           int mid=(low+high)/2;
           if(n==a[mid])
           {
            ans=mid;
            high=mid-1;
           }
           else if(n<a[mid])
           {
            high=mid-1;
           }
           else
           {
            low=mid+1;
           }
        }
        return ans;
    }


    public static int upperBound(int a[],int n)
    {
        int ans=-1;
        int low=0,high=a.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(n==a[mid])
            {
                ans=mid;
                low=mid+1;
            }
            else if(n<a[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return ans;
    }




    public static void main(String [] args)
    {
        int[] arr={1,2,2,2,3,3,3,3,4,4,4,5,5,6,6,6,6};

        System.out.println(lowerBound(arr, 2));
        System.out.println(upperBound(arr, 2));


        

    }
    
}
