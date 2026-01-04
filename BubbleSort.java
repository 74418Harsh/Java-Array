 class BubbleSortOptimized {
    public static void main(String[] args) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSorted = false;
                }
            }

            if (isSorted) break; // Stop if array already sorted
        }
    }
}

 //3 60 35 2 45 320 5

// 3 35 60 2 45 320 5

// 3 35 2 60 45 320 5

// 3 35 2 45 60 320 5

// 3 35 2 45 60 5 320

 /*
  * 

Given Array : {3, 60, 35, 2, 45, 320, 5}; 

  {3, 35, 2, 45, 60, 5, 320}    i=0
  {3, 2, 35, 45, 5, 60, 320}    i=2
  {2, 3, 35, 5, 45, 60, 320}    i=3
  {2, 3, 5, 35, 45, 60, 320}    i=4

  ⚠️ Pass 5 (i = 4) — No swap will happen
Comparisons:

2 > 3 ❌

3 > 5 ❌

⚠️ Nothing changed — but inner loop still runs.

⚠️ Pass 6 (i = 5) — No swap again
Comparison:

2 > 3 ❌

⚠️ Again, no change.


  */
