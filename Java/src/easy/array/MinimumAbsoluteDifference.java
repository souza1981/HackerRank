package easy.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumAbsoluteDifference {

    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);

        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if (Math.abs(arr[i] - arr[i+1]) < menor){
                menor = Math.abs(arr[i] - arr[i+1]);
            }
        }
        return Math.abs(menor);
    }

    public static void main(String[] args) {
        //int[] nums = new int[]{3,-7, 0};
        int[] nums = new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        System.out.println(MinimumAbsoluteDifference.minimumAbsoluteDifference(nums));
    }

}
