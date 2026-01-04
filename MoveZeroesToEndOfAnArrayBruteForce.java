public class MoveZeroesToEndOfAnArrayBruteForce{
    public static void main(String[] args)
    {
    int arr[] ={0,1,0,3,12};
    int n = arr.length;

    int temp[] = new int[n];
    int j =0;

    for(int i=0;i<n;i++)
    {
        if(arr[i]!=0)
        {
            temp[j]=arr[i];
            j++;
        }
    }

    while(j<n)
    {
        temp[j]=0;
        j++;
    }

    for(int num:temp)
    {
        System.out.print(num+" ");
    }
    
}
}