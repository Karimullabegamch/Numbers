public class BinarySearch
  {
 public static int binarySearch(int arr[],int key)
    {
      int left=0;
      int right=arr.length-1;
   
   while(left<=right)
        {
         int mid=(left+right)/2;
          
          if(arr[mid]==key)
            return mid;
          else if(arr[mid]<key)
            left=mid+1;
          else
            right=mid-1;
        }
      return -1;

    }

    public static void main(String[] args)
    {
      int arr[]={3,4,5,6,7,86};
      int target=7;

      int res=binarySearch(arr,target);
      if(res !=-1)
        System.out.println("element found at index "+res);
      else
        System.out.println("elemetn not found");
    }
  }
