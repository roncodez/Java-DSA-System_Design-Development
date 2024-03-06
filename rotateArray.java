import java.util.*;
public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Enter the number of rotations: ");
        k = sc.nextInt();
        k = k%((arr.length));
        if(k < 0) {
            k += (arr.length);
        }
        rotateArr(arr, k);
        display(arr);
    }
    public static void rotateArr(int[] arr, int k) {
        for(int i = 0; i < k; i++) {
            int temp = arr[arr.length-1];
            for(int j = arr.length-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}