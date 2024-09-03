public class LineBinSerachComp {
 public static int binarySearch(int arr[],int key)
    {
      int left=0;
      int right=arr.length-1;
     int bcount=0;
   while(left<=right)
        {
         int mid=(left+right)/2;
          bcount++;
          if(arr[mid]==key)
          {
            System.out.println("binary count "+bcount);
          
            return mid;
          }
          else if(arr[mid]<key)
            left=mid+1;
          else
            right=mid-1;
        }
       System.out.println("binary count "+bcount);
      return -1;

    }
  public static int linearSearch(int arr[],int key)
    {
      int lcount=0;
      for(int i=0;i<arr.length;i++)
        {
          lcount++;
          if(arr[i]==key)
          {
             System.out.println("linear count "+lcount);
            return i;
          }
        }
      System.out.println("linear count "+lcount);
      return -1;

    }

    public static void main(String[] args)
    {
      int arr[]={3,4,5,6,7,86};
      int target=77;

      int res=linearSearch(arr,target);

      int res1=binarySearch(arr,target);
      if(res !=-1)
        System.out.println("element found at index "+res);
      else
        System.out.println("elemetn not found");
    }
  }



  // LINEAR SEARCH SHOULD NOT REQUIRED SORTED ARRYA
// BUT BUBBLE SORT REQUIRED SORTED ARRA

// linear search  --> O(n)
// binary searh --> o(log n)