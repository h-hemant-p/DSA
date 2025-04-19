package Array.Questions;

public class BinarySearch {
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid+1;
            } else if (mid > target) {
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 8, 9, 12 };
        int target = 6;
        System.out.println("Index: "+ search(arr, target));

    }
}
