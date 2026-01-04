public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 12, 2, 12, 23, 4};

        int secondMaxBrute = SecondLargestByBrute(arr);
        System.out.println("Second largest element (Brute-force) is " + secondMaxBrute);

        int secondMaxOptimal = SecondLargestByOptimal(arr);
        System.out.println("Second largest element (Optimal) is " + secondMaxOptimal);

        int secondMaxBetter = SecondLargestByBetter(arr);
        System.out.println("Second largest element (Better) is " + secondMaxBetter);
    }

    public static int SecondLargestByBrute(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        } 

        int largest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }
        return -1; // no second largest
    }

    public static int SecondLargestByOptimal(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
            //2 4 5 7 6
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static int SecondLargestByBetter(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
            //2 4 5 7 6
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
             }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}





