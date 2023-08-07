public class ReversedArr{

    public static void main(String[] args) {
        int[] inputArray = {89, 2354, 3546, 23, 10, -923, 823, -12}; 
        int[] reverseArray = reverseArray(inputArray);
        
        for(int i= 0 ; i<reverseArray.length ;i++ ){
            System.out.println(reverseArray[i]);
        }
    }

    public static int[] reverseArray(int[] arr){
        int[] sortedArray = new int[arr.length];
        

        for(int i =1 ; i <= arr.length ; i++){
           sortedArray[i-1] = arr[arr.length - i]; 
        }

        return sortedArray;
    }
}