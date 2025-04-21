/*
Time Complexity
    Worst-case time complexity: O(n²)
    Best-case time complexity: O(n)
    Average-case time complexity: O(n²)

Space Complexity
    Space complexity: O(1)
*/
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt(); 
        }

        bubbleSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

        sc.close();
    }
}
