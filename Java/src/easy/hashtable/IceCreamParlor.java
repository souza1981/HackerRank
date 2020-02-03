package easy.hashtable;

import java.util.Arrays;
import java.util.List;

public class IceCreamParlor {

    static void whatFlavors(int[] cost, int money) {
        int [] copyArray = Arrays.copyOf(cost,cost.length);
        Arrays.sort(copyArray);
        int inicio = 0;
        int fim = copyArray.length-1;
        int indiceMenor = -1;
        int indiceMaior = -1;
        while (inicio <fim){
            int soma = copyArray[inicio] + copyArray[fim];
            if (soma == money){
                for (int i = 0; i < cost.length; i++) {
                    if ( copyArray[inicio] == cost[i] && indiceMenor == -1){
                        indiceMenor = i+1;
                        continue;
                    }
                    if (copyArray[fim] == cost[i] && indiceMaior == -1){
                        indiceMaior = i+1;
                        continue;
                    }
                }
                if (indiceMenor < indiceMaior){
                    System.out.println(indiceMenor + " " + indiceMaior);
                } else {
                    System.out.println(indiceMaior + " " + indiceMenor);
                }
                return;
            } else if (soma < money){
                inicio++;
            } else {
                fim--;
            }

        }
    }

    public static void main(String[] args) {
        //int[] cost = new int[]{1,4,5,3,2};
        int[] cost = new int[]{7,2,5,4,11};
        //int[] cost = new int[]{2,2,4,3};
        IceCreamParlor.whatFlavors(cost,12);
    }


}
