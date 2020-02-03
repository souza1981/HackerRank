package easy.sort;

public class BubbleSort {



    static void countSwaps(int[] a) {

        int ultimo = a.length;

        int swap = 0;

        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int j = 0; j < ultimo - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap++;
                    sorted = false;
                    int aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
            ultimo--;
        }

        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }

    public static void main(String[] args) {
        //int[] nums = new int[]{6,4,1};
        //int[] nums = new int[]{1,2,3};
        int[] nums = new int[]{4,2,3,1};
        BubbleSort.countSwaps(nums);
    }
}
