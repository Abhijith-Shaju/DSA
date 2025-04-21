/*
Time Complexity:
    Best Case: O(1) (When the target is found at the first middle element)

    Average Case: O(log n) (Target is found after several halvings)

    Worst Case: O(log n) (Target is at the end or doesn't exist)
 */

package Searching;
public class binarySearch{

    public static void search(int[] arr, int start, int end, int tar) {
        if(start > end){
            System.out.println("Element Not Found");
            return;
        }
        int mid = start + (end-start)/2;

        if(arr[mid] == tar){
            System.out.println("Element in array");
            return;
        }else{
            if(arr[mid] > tar){
                search(arr, start, mid-1, tar);
            }else{
                search(arr, mid+1, end, tar);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 9, 7, 1, 8};


        //Binary Search works on Sorted arrays only. therefore: Sort It!
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //Searching Element;
        int tar = 9;
        search(arr, 0, arr.length-1,tar);
        
    }
}