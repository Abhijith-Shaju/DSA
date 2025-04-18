/*
Time Complexity
    Worst-case: O(n²) - When the array is sorted in reverse order
    Best-case: O(n) - When the array is already sorted
    Average-case: O(n²) - For randomly ordered arrays

Space Complexity
    O(1) - Insertion sort is an in-place sorting algorithm that only requires a constant amount of additional memory space.
*/

import java.util.Scanner;

public class insertionSort {

    public static void InsertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt(); 
        }

        InsertionSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        sc.close();
    }
}
