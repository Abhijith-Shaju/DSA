/*
Time Complexity:
    Worst-case: O(n²) comparisons, O(n) swaps
    Best-case: O(n²) comparisons, O(1) swaps
    Average-case: O(n²) comparisons, O(n) swaps

Space Complexity:
    O(1) - it's an in-place sorting algorithm
*/
import java.util.Scanner;

public class SelectionSort{
    public static void selectionSort(int[] arr){
        
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt(); 
        }

        selectionSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

        sc.close();
    }
}