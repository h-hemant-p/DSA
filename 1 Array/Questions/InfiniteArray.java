public class InfiniteArray {
    static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end+1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, start, end, target);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        System.out.println(start + " " + end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };

        System.out.println(search(nums, 5));

    }
}
