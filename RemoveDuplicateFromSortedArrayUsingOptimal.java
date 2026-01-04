public class RemoveDuplicateFromSortedArrayUsingOptimal {
    
    public static void main(String [] args)
    {
        int arr[] ={0,0,3,3,5,6};
        int i =0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }

        // After removing duplicate element 
       // arr[]= {0,3,5,6}
        int uniqueElement= i+1;

        System.out.println("Unique Elements are"+uniqueElement);

        for(int k=0;k<uniqueElement;k++)
        {
            System.out.println(arr[k]);
        }     
    }
}



// class Main {
//     public static void main(String[] args) 
//     {
//         int arr[] ={0,0,1,2,2,3};
//         //01234567
//         int n = arr.length;
//         int i =0;
//         for(int j =1;j<n;j++)
//         {
//             if(arr[i]!=arr[j])
//             {
//                 arr[i+1]=arr[j];
//                 i++;
//             }
//         }
      
//         for(int k =0;k<=i;k++)
//         {
//             System.out.println(arr[k]);
//         }
//     }
// }

//  ⚙️ Complexity:

// Time: O(n)
// Space: O(1)
// Everything is perfect 👏





//  0   0   3   3   5   6
//  0   3   5   6

// i=0  j=3 [2]  i++; i=1
// i=1  j=5 [4]  i++; i=2
// i=2  j=6 [5]  i++, i=3
// i=3



//0    0    3    3    5    6

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int i=0;
//         for(int j=1;j<nums.length;j++)
//         {
//             if(nums[j]!=nums[i])
//             {
//                 nums[i+1]=nums[j];
//                 i++;
//             }
//         }
//         return i++;
//     }
// }
//  0   3   5

// i=0  j=2(3)  i=1
// i=1  j=4(5)  i=2
// i=2  j=5(6)  i=3
// i =3