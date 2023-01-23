import java.util.Arrays;
public class Main {
    // Task 1
    public static void main(String[] args) {
        int result = findElement(new int[]{2, 8, 6, 7, 5, 3, 7});
        System.out.println(result);
    }
    public static int findElement(int arr[]) {
        int size = arr.length;
        if (size == 1 || size == 0) {
            return -1;
        }
        for (int i = 0; i < size; i += 2) {
            if (i == size - 1 || arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }
    // Task 2
//    public static void main(String[] args) {
//        int[] arr = {45, 23, 10, 78, 56, 225, 98};
//        revert(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }
//    private static void revert(int arr[]){
//        for (int i = 0; i < arr.length/2; i++) {
//            int last = arr[arr.length-1-i];
//            arr[arr.length-1-i] = arr[i];
//            arr[i] = last;
//        }
//    }
}