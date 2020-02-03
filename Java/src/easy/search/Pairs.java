package easy.search;

import java.util.Arrays;

public class Pairs {

    static int pairs(int k, int[] arr) {

        Arrays.sort(arr);
        int fim = arr.length - 1;
        int resultado = 0;
        while (fim >= 0 && arr[fim] > k) {
            int encontrou = Arrays.binarySearch(arr, arr[fim] - k);
            if (encontrou >= 0) {
                resultado++;
            }
            fim--;
        }
        return resultado;

    }

    public static void main(String[] args) {
        //int[] nums = new int[]{1, 5, 3, 4, 2};
        int[] nums = new int[]{363374326, 364147530, 61825163, 1073065718, 1281246024, 1399469912, 428047635, 491595254, 879792181, 1069262793};
        System.out.println(Pairs.pairs(1, nums));
    }

}
