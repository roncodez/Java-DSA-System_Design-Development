public class reverseArray {
    public static void main(String[] args) {
        // using a static input array and with the use of another array in memory
        int[] arr = {10, 20, 30, 40, 50};
        int[] revArr = new int[arr.length];
        int ctr = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            revArr[ctr++] = arr[i];
        }

        for(int val: arr) {
            System.out.println(val);
        }

        for(int val: revArr) {
            System.out.println(val);
        }
    }
}
// try doing this in-place i.e. without using an extra array - 2 pointer approach
