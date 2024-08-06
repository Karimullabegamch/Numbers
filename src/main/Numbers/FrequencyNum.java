import java.util.*;

public class AutomorphicNum {
  public static void main(String[] args)
    {

      int arr[]={3,4,2,3,2,4,3,4,6};

      for(int i=0;i<arr.length;i++)
        {
          int c=1;
           int v=0;
          for(int j=1;j<arr.length;j++)
            {
              if((arr[i] == arr[j]) && i>j)
                c++;
              if((arr[i] == arr[j]) && i<j)
                v++;
              
            }
         // 
        // if(v==0)
        //   {
          //System.out.println("frequency");
        //      System.out.println(arr[i]+" "+c);
        //   }

          
         
          // if(v==0 && c>1)
          // {
          //    System.out.println("duplicates");
          //   System.out.println(arr[i]+" "+c);
          // }

          if(c==1 && v==0)
          {System.out.println("uniques");
            System.out.println(arr[i]+" "+c);
          }
             
        }
    }
}
