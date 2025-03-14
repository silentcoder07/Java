package Arrays;

public class BinaryTest {

    public static void main(String[] args)
    {
        int [] arr={1,3,5,7,55,57,59,60,64,67};
        int n=64;

        int low=0,high=arr.length-1;
        int mid=(low+high)/2;

        while(low<=high)
        {
            if(arr[mid]>n)
            {
                high=mid-1;
            }
            else if(arr[mid]<n)
            {
                low=mid+1;
            }
            else
            {
                System.out.println("number is present at "+ mid+ " index");
                break;
            }

        }
   
        if(low >high)
        {
            System.out.println("Number not present in array");
        }


    }
   
}
