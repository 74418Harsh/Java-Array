public class UnionOf2SortedArraysUsingOptimal{
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] ={2,3,5,6};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i=0;
        int j=0;

        while(i<n1&& j<n2)
        {
            if(arr1[i]==arr2[j])
            {
                    System.out.println(arr1[i]+" ");
                    i++;
                    j++;
            }

            else if (arr1[i]<arr2[j]) 
            {

                System.out.println(arr1[i]+" ");
                i++;
            }
            else
            {
                System.out.println(arr2[j]+" ");
                j++;
            }
        }

        while(i<n1)
        {
            System.out.println(arr1[i]+" ");
            i++;
        }
        while(j<n2)
        {
            System.out.println(arr2[j]+" ");
        }

    }
}
