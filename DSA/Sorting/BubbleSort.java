public class BubbleSort
  {
    public static void main (String[] args)
    {
      int arr[]={3,2,7,66,22,4,9,5};
      int temp;
      System.out.println("before sorting");
      for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
      System.out.println();

     int c=0;

      for(int j=0;j<arr.length-1;j++)
        {
          for(int i=0;i<arr.length-j-1;i++)
            {
              if(arr[i]>arr[i+1])
              {
                c++;
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
              }
          
              }
          for(int i=0;i<arr.length;i++)
            {
              System.out.print(arr[i]+" ");
            }
          System.out.println();
            }
          System.out.println("after sorting");
      for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
      System.out.println();

      System.out.println("count is "+c);
    }
  }

// O(n^2)