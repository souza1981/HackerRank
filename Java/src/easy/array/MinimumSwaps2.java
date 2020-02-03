package easy.array;

public class MinimumSwaps2 {

    static int minimumSwaps(int[] arr) {

        int ultimo = arr.length;
        int swaps = 0;
        while (ultimo >= 0){
            ultimo--;
            for (int i = 0; i < ultimo; i++) {
                if (arr[i]>arr[i+1]){
                    swaps++;
                    int aux = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = aux;
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,1,3,2,4,5,6};
        System.out.println(MinimumSwaps2.minimumSwaps(arr));
    }

}
