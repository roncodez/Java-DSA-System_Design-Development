import java.util.ArrayList;
public class RunningSum1DArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j <= i; j++) {
                sum += arr[j];
            }
            ans.add(sum);
        }
        System.out.println(ans);
    }
}

// My observation: this can be optimized too, just the previous position's sum + next element would do the job
// thereby improving the time complexity - this is called the prefix-sum approach.
// 2nd observation: there is no need for an ArrayList in this case, looking at the input we can determine
// what will be the size of the output of the running sum
