package easy.array;

import java.util.Arrays;

public class GreedyFlorist {

    static int getMinimumCost(int k, int[] c) {

        Arrays.sort(c);

        int lucro = 0;
        int compradores = 0;
        int resultado = 0;
        for (int i = c.length-1; i >= 0; i--) {
            if (compradores == k){
                compradores = 0;
                lucro++;
            }
            compradores++;
            resultado += (lucro + 1) * c[i];
        }

        return resultado;

    }

    public static void main(String[] args) {
        //int[] nums = new int[]{1,3,5,7,9};
        int[] nums = new int[]{1,2,7,9,100};
        System.out.println(GreedyFlorist.getMinimumCost(2,nums));
    }

}
