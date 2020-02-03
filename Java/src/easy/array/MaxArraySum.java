package easy.array;

import java.util.Arrays;

public class MaxArraySum {

    static int maxSubsetSum(int[] arr) {

        int u = Integer.MIN_VALUE, v = Integer.MIN_VALUE, w = arr[0];
        for(int i = 2; i < arr.length; i++) {
            int t = u;
            u = Math.max(u, v);
            v = Math.max(t, w) + arr[i];
            w = Math.max(w, arr[i - 1]);
        }
        return Math.max(u, v);

/*        int incl = arr[0];
        int excl = 0;
        int excl_new;

        for (int i = 0; i < arr.length; i++) {
            excl_new = incl > excl? incl: excl;
            incl = (excl + arr[i]);
            excl = excl_new;
        }

        return ((incl > excl) ? incl : excl);*/













    }

    private int sumNext(int[] arr, int indice){
        if (indice >= arr.length-2){
            return arr[indice];
        }
        return sumNext(arr, indice+1);
    }

}
