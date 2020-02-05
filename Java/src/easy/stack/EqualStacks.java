package easy.stack;

public class EqualStacks {


    static int tamanhoStack(int[] stack, int indice){
        int tamanho = 0;
        for (int i = indice; i < stack.length; i++) {
            tamanho += stack[i];
        }
        return tamanho;
    }

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */

        int indice1 = 0, indice2 = 0, indice3 = 0;

        int tamanho1 = 0, tamanho2 = 0, tamanho3 = 0;

        tamanho1 = tamanhoStack(h1, indice1);
        tamanho2 = tamanhoStack(h2,indice2);
        tamanho3 = tamanhoStack(h3,indice3);

        while (true){
            if (indice1 == h1.length || indice2 == h2.length || indice3 == h3.length){
                return 0;
            }

            if (tamanho1 == tamanho2 && tamanho2 == tamanho3){
                return tamanho1;
            }

            if (tamanho1 >= tamanho2 && tamanho1 >= tamanho3){
                tamanho1 -= h1[indice1];
                indice1++;
            } else if (tamanho2 >= tamanho1 && tamanho2 >= tamanho3){
                tamanho2 -= h2[indice2];
                indice2++;
            } else {
                tamanho3 -= h3[indice3];
                indice3++;
            }
        }

    }

}
