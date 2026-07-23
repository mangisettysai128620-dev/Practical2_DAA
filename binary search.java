public class BinarySearch {

    // Binary Search Implementation (Iterative)
    // Array MUST be sorted
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] sortedData = {10, 23, 35, 42, 57, 70, 89, 91};
        int target = 57;

        long startTime = System.nanoTime();
        int result = binarySearch(sortedData, target);
        long endTime = System.nanoTime();

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }
}
