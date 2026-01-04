import java.sql.Time;
import java.util.*;

public class RemoveDuplicatesFromSortedArrayUsingBruteForce {
    public static void main(String[]args)
    {
        int arr[] ={1,1,2,2,3,3,4,5,5};
        int n = arr.length;

        //usring BruteForce Approach(Adding extra array)

    //     int temp[] =new int[n];
    //     int j =0;

    //     for(int i =0;i<n-1;i++)
    //     {
    //         if(arr[i]!=arr[i+1])
    //         {
    //             temp[j]=arr[i];
    //             j++;
    //         }
    //     }
    //     temp[j]=arr[n-1];

    //     for(int i=0;i<=j;i++)
    //     {
    //         System.out.println(temp[i]);
    //     }
    // }


    
// class Main {
//     public static void main(String[] args) {
    
//     int arr[] ={1,2,2,3,3,4,5,6,7,7};
//     int n = arr.length;
    
//     int temp[] = new int[n];
    
//     int j = 0;
    
//     for(int i =0;i<n-1;i++)
//     {
//         if(arr[i]!=arr[i+1])
//         {
//             temp[j]=arr[i];
//             j++;
//         }
//     }
    
//     temp[j]=arr[n-1];
//     //j++;
    
//     for(int i=0; i<=j;i++)
//     {
//         System.out.println(temp[i]);
//     }
    
//     }
// }
//     Time Complexity:

// Loop runs once through the array → O(n)

// Printing result also → O(n)

// ✅ Overall = O(n)

// Space Complexity:

// You created a temp[] array of size n.

// ✅ Space = O(n)

    //Using set

    Set <Integer>st = new TreeSet<>();
    //In Hashset order is not guaranteed. gurantee..so use Treeset or LinkedHashset
    //1,2,2,3,3,4,5,6,7,7


    //1 2 3 4 5 6 7

    for(int i=0;i<n;i++)
    {
        st.add(arr[i]);
    }

    int index=0;
    for(int x:st)
    {
        arr[index]=x;
        index++;
    }

    for(int i=0;i<index;i++)
    {
        System.out.println(arr[i]);
    }
}
}


// Traverses the array once → O(n)

// Copying back/printing unique elements → O(n)
// 👉 Overall Time Complexity = O(n)
// 👉 Space Complexity = O(n) (because of extra temp array)


// Time Complexity:

// Insertion in TreeSet takes O(log n) (because it’s a balanced tree).

// You insert n elements → O(n log n)

// Copy back into array / print → O(n)

// ✅ Overall = O(n log n)+0(n)

// Space Complexity:

// You create a TreeSet of at most n unique elements.

// ✅ Space = O(n)(Imagine all are unique elements not a same then it will be)