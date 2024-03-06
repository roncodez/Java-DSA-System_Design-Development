public class minmaxElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 9};
        // min ele = 1, max ele = 9
        int minele = arr[0];
        // int minele = Integer.MAX_VALUE; - could have initialized like this too
        int maxele = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= maxele)
                maxele = arr[i];
            if(arr[i] <= minele)
                minele = arr[i];
        }

        System.out.println("Minimum element " + minele);
        System.out.println("Maximum element " + maxele);
    }
}
