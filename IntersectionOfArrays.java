/*
    To find the intersection of 2 arrays which are sorted and may differ in size
    There are 3 approaches to this problem, one is the one I have implemented - taking two pointers
    comparing which element is smaller and then incrementing that pointer to match an element

    2nd Brute force, take each element of one array and iterate over the entire second array
    looking for a match.

    3rd is similar to 2nd but with an improvement that, since the arrays are sorted while comparing I don't n
    need to look the entire array, only after the previous element - this saves iterations
 */
import java.util.ArrayList;
public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 19, 20, 30, 40, 40, 40, 50};
        int[] arr2 = {15, 16, 17, 18, 20, 25, 30, 30, 40};
        System.out.println(intersection(arr1, arr2));
    }

    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]) {
                i++;
            } else if(arr1[i] > arr2[j]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
