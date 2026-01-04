public class MoveZeroesToEndOfAnArrayOptimalSolution {
    public static void main(String[] args)
    {
            int arr[] = {1,4,0,9,0,8,9};
             int count = 0;
            
             for(int i =0;i<arr.length;i++)
             {
                if (arr[i]!=0)
                {
                    arr[count]=arr[i];
                    count++;
                }
             }

             while(count<arr.length)
             {
                arr[count]=0;
                count++;
             }

             for(int i =0;i<arr.length;i++)
             {
                System.out.print(arr[i]+" ");
             }

    }
    
}




/*
  public class MoveZeroesToEnd
{
    
    public static void main(String [] args)
    {
            int arr[] = {1,4,0,9,0,8,9};
            
            int count = 0;
            
            for(int i =0; i<arr.length;i++)
            {
                if (arr[i]!=0)
                {
                    arr[count++] = arr[i];
                }
            }
            
            while(count<arr.length)
            {
                arr[count++]=0;
            }
            
            for(int i =0 ; i<arr.length; i++)
            {
                System.out.print(arr[i]+ " ");
            }
    
   
    
    }


}
 */