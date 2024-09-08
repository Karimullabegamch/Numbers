public class LineaSeach
  {
 public static int linearSearch(int arr[],int key)
    {
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==key)
            return i;
        }
      return -1;
      
    }
    
    public static void main(String[] args)
    {
      int arr[]={3,1,5,6,7,8};
      int target=77;

      int res=linearSearch(arr,target);
      if(res !=-1)
        System.out.println("element found at index "+res);
      else
        System.out.println("elemetn not found");
    }
  }