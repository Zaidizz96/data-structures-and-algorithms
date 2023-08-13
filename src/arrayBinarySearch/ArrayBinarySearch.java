package arrayBinarySearch;

public class ArrayBinarySearch {

    public static void main(String[] args) {
        int[] array = { 11, 22, 33, 44, 55, 66, 77 };
        int key = 66;

        int result = binarySearch(array, key);

        if (result != -1) {
            System.out.println("Target found at index " + result);
        } else {
            System.out.println("Target not found in the array");
        }
    }

    public static int binarySearch(int[] arr , int key){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
