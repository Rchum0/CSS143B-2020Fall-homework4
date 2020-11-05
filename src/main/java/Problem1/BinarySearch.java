package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        // homework
        return binarySearch(data, target, 0, data.length - 1);
    }

    //Helper function
    private static int binarySearch(int[] data, int target, int min, int max) {

        if (min > max) {
            return -1;
        } else {
            int mid = (min + max) / 2;
            if (data[mid] < target) { //it's to small move right
                return binarySearch(data, target, mid + 1, max);
            } else if (data[mid] > target) { // to big move left
                return binarySearch(data, target, min, mid - 1);
            } else {
                return mid; // return when the target is found
            }
        }
    }
}