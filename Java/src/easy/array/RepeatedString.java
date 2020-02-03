package easy.array;

import java.util.Arrays;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        if (!s.contains("a")) return 0;
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        int quantidadeDeAs = String.valueOf(sArray).lastIndexOf("a") - String.valueOf(sArray).indexOf("a") + 1;
        long resultado = Long.divideUnsigned (n, s.length()) * quantidadeDeAs;

        int diferenca = Math.toIntExact(n % s.length());

        if (diferenca == 0 || !s.substring(0,diferenca).contains("a")) return resultado;

        sArray = s.substring(0,diferenca).toCharArray();
        Arrays.sort(sArray);
        quantidadeDeAs = String.valueOf(sArray).lastIndexOf("a") - String.valueOf(sArray).indexOf("a") + 1;
        resultado += quantidadeDeAs;
        return resultado;

    }

    public static void main(String[] args) {
        System.out.println(RepeatedString.repeatedString(".ooa",10));
    }
}
