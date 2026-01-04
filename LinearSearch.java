public class LinearSearch {
    public static void main(String[]args)
    {
        int arr[] ={2,3,1,2,5,4,7,8};
       // int num =4;
        int found= LSearch(arr);

        System.out.println("Elemenet found!!!"+found);
      
    }

    public static int LSearch(int [] arr)
    {
        for(int i =0;i<arr.length;i++)

        {
            if(arr[i]==4)
            {
                return i;
            }
        }
        return -1;
    }
}
