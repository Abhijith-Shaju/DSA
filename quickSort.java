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
