import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total elements: ");
        int total = sc.nextInt();

        int arr[] = new int[total];

        System.out.println("Enter " + total + " elements:");
        for(int i = 0; i < total; i++)
        {
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        System.out.println("Reversed array:");
        for(int i = 0; i < total; i++)
        {
            System.out.println(arr[i]);
        }

        sc.close();
    }

    public static void reverse(int[] arr)
    {
        int i = 0;
        int j = arr.length - 1;

        while(i < j)
        {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }

}

// public class ReverseArray
// {
//     public static void main(String[]args)
//     {
//         int arr[] ={2,4,6,8,10,12};
//         reverse(arr);

        
//         for(int i =0;i<arr.length;i++)
//         {
//            System.out.println(arr[i]);

//         }
//     }

//     public static void reverse(int[] arr)
//     {
//         int i = 0;
//         int j = arr.length-1;

//         while(i<j)
//         {
//             int t = arr[i];
//             arr [i] = arr[j];
//             arr[j] = t;
//             i++;
//             j--;
//         }
//     }
// }