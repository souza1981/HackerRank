package easy.sort;

import java.util.Arrays;

public class MarkToys {

    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
            if (sum > k){
                return i -1;
            }
        }
        return prices.length;

    }

    public static void main(String[] args) {
        int[] prices = new int[]{1,12,5,111,200,1000,10};
        System.out.println(MarkToys.maximumToys(prices,50));
    }

}
