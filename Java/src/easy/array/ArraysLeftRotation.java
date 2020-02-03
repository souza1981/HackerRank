package easy.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysLeftRotation {

    static int[] rotLeft(int[] a, int d) {

        if (d > a.length && d % a.length == 0) return a;

        int rotacoes = 0;
        if (d > a.length){
            rotacoes = d % a.length;
        } else {
            rotacoes = d;
        }

        List<Integer> fila = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            fila.add(a[i]);
        }
        for (int i = 1; i <= rotacoes; i++) {
            int removido = fila.remove(0);
            fila.add(removido);
        }

        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = fila.remove(0);
        }
        return resultado;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(ArraysLeftRotation.rotLeft(nums,4)));
    }

}
