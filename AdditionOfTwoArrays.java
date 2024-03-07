// Question frequently asked in interviews
import java.lang.reflect.Array;
import java.util.ArrayList;
public class AdditionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7};
        int[] arr2 = {3, 4, 4, 6};

        // the addition would be 3446 + 567 = 4013, so output array = {4, 0, 1, 3};
        System.out.println(AddArrays(arr1, arr2));
    }

    public static ArrayList<Integer> AddArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;

        while(i>=0 || j>=0) {
            int sum = 0;
            if (i >= 0) {
                sum += arr1[i];
            }
            if (j >= 0) {
                sum += arr2[j];
            }

            sum += carry;
            i--;
            j--;
            ans.add(0, sum % 10);
            carry = sum / 10;
        }
        return ans;
    }
}
