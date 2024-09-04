import java.util.*;
public class SelectionSort
  {
    public static void main(String [] args)
    {
      int arr[]={3,2,4,1};
      int temp;
      int minIndex=0;
      System.out.println("before sorting");
       System.out.println(Arrays.toString(arr));
      for(int i=0;i<arr.length;i++)
        {
          minIndex=i;
          for(int j=i+1;j<arr.length;j++)
            {
              if(arr[minIndex]>arr[j])// finding minimum element in the array
                minIndex=j;
            }
          temp=arr[i]; 
          arr[i]=arr[minIndex];

          arr[minIndex]=temp;
           System.out.println(Arrays.toString(arr));

        }
      System.out.println("after sorting");
      System.out.println(Arrays.toString(arr));
    }
  }