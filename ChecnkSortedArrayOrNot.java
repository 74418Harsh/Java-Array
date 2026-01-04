public class ChecnkSortedArrayOrNot {
//     arr{1,2,2,3,4,5};
//     we will traverse from 1st index and will check whether it is <= or not.
// 
    public static void main(String[]args)
    {
    int arr[]={1,2,2,3,4,5};
    boolean sorted = SortedorNot(arr);
    System.out.println(sorted);
    }
    public static boolean SortedorNot(int []arr)
{
    for(int i=1;i<=arr.length-1;i++)
    {
        if(arr[i]>=arr[i-1])
        {

        }
        else
        {
            return false;
        }
    }
    return true;
}

}

// public class CheckSortedArrayOrNot {
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 2, 3, 4, 5};
//         boolean sorted = SortedorNot(arr);
//         System.out.println(sorted);
//     }

//     public static boolean SortedorNot(int[] arr) {
//         // Traverse till second last index
//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 return false;  // Not sorted
//             }
//         }
//         return true; // Sorted
//     }
// }
