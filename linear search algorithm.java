public class LinearSearch {

    // Linear Search Implementation
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] data = {10, 23, 35, 42, 57, 70, 89, 91};
        int target = 57;

        long startTime = System.nanoTime();
        int result = linearSearch(data, target);
        long endTime = System.nanoTime();

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }
}
