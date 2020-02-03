package easy.array;

import java.io.IOException;
import java.util.Arrays;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        int result = 0;
        Arrays.sort(ar);
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] == ar[i+1]){
                result++;
                i++;
            }

        }


        return result;
    }


    public static void main(String[] args) throws IOException {
        int[] nums = new int[]{10,20, 20, 10, 10, 30, 50, 10, 20, 10};

        System.out.println(SockMerchant.sockMerchant(9,nums));
    }

}
