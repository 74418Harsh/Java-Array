public class LargestElement{
    public static void main(String[]args)
    {
             int arr[] ={2,4,7,12,2,12,23,4};
    
    //brute force approach
    // int max =LargestbyBrute(arr);
    // System.out.println("Largest element from given array is"+max);

    //optimalWay
    int max =LargestbyOptimal(arr);
    System.out.println("Largest element from given array is"+max);

}   
    //2, 4, 7, 12, 2, 12, 23, 4
   public static int LargestbyBrute(int[] arr) {
    int n = arr.length;
    for(int i = 0; i < n - 1; i++) {           
        if(arr[i] > arr[i+1]) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    return arr[n-1]; 
}

    //     [2, 4, 7, 2, 12, 12, 4, 23]


    public static int LargestbyOptimal(int[]arr)
    {   
            int max=arr[0];
            int n = arr.length;
            for(int i=0;i<=n-1;i++)
            {
                    if (max<arr[i])
                    {
                        max=arr[i];
                    }
                 
    }
                 return max;
          }
           
    }
   