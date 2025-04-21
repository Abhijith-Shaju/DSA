/*
1. Time Complexity
Best Case	O(n log n)	Pivot always divides the array into two nearly equal parts
Average Case	O(n log n)	Random pivot selection leads to balanced partitions
Worst Case	O(n²)	Pivot is always the smallest/largest element (unbalanced partitions)

2. Space Complexity
Best/Average Case	O(log n)	Recursion stack depth (balanced partitions)
Worst Case	O(n)	Recursion stack depth (unbalanced partitions)
*/


public class quickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void QuickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            QuickSort(arr, low, pivotIndex-1);
            QuickSort(arr, pivotIndex+1, high);
        }
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6, 9, 7};
        int len = arr.length;

        QuickSort(arr, 0, len-1);
        print(arr);
    }
}
