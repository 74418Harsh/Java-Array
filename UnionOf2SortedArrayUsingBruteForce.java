import java.util.*;
public class UnionOf2SortedArrayUsingBruteForce {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5};
        int arr2[] ={2,3,4,5,6};

        Set<Integer>Union = new TreeSet<>();

        for(int i=0;i<arr1.length;i++)
        {
                Union.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++)
        {
            Union.add(arr2[i]);
        }

        System.out.println(Union);
    }
}
