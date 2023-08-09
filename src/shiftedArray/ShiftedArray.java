package shiftedArray;


public class ShiftedArray {
    public static void main(String[] args) {

       int[] testArray = insertInMiddle(new int[]{1, 2, 3, 4},7);

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }

    public static int[] insertInMiddle(int[] arr, int num) {
        int originalLength = arr.length;
        int newLength = originalLength + 1;

        int middleIndex = newLength / 2;
        int[] newArray = new int[newLength];

        for (int i = 0, j = 0; i < newLength; i++) {
            if (i == middleIndex) {
                newArray[i] = num;
            } else {
                newArray[i] = arr[j++];
            }
        }

        return newArray;
    }

}
