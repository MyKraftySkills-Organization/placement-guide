import java.util.Arrays;

class RecursiveInsertionSort {

    // Recursive Insertion Sort
    static void insertionSort(int arr[], int n) {
        // Base Case
        if (n <= 1)
            return;

        // sort first n-1 elements
        insertionSort(arr, n - 1);

        // Insert last element at its correct position
        // in sorted array
        int last = arr[n - 1];
        int j = n - 2;

        /**
         * Move elements of arr[0..i-1], that are greater than key, to one position
         * ahead of their current position
         */
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    // A utility function to print an array of size n
    static void printArray(int arr[], int n) {
        System.out.println("");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 16, 5, 6, 90, 1};
        int n = 7;
        insertionSort(arr, n);
        printArray(arr, n);
    }
}