package Arrays;

public class BinarySearch{


    public static int binarySearchInt(int arr[],int n)
    {
        int low=0,high=arr.length-1;
        int mid;

        while(low<=high)
        {
            mid=(low+high)/2;

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
                //System.out.println("number is present at "+ mid+ " index");
                //break;
                return mid;
            }
        }
   
        return -1;
    }

    public static void main(String[] args)
    {
        int [] arr={1,3,5,55,57,59,60,64,67};
        int n=55;

        int index= binarySearchInt(arr,n);
   
        if(index!=-1)
        {
            System.out.println("Number present at index "+ index);
        }
        else
        {
            System.out.println("Number not present in array");
        }


    }
    
}
