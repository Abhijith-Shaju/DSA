/*
time complexity:

Best Case	O(1)	Target is the first element
Average Case	O(n)	Target is somewhere in the middle
Worst Case	O(n)	Target is last element or not present
*/

package Searching;
public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3 , 4, 6, 9};
        int tar = 4;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == tar){
                System.err.println("Target found at index: " + i);
            }
        }
    }
}