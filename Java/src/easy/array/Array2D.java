package easy.array;

public class Array2D {
    static int hourglassSum(int[][] arr) {

        int maior = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                int soma = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] +
                                           arr[i][j] +
                        arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                if (soma > maior) {
                    maior = soma;
                }
            }
        }
        return maior;
    }
}
