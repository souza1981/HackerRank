package easy.array;

public class CountingValleys {

    static int countingValleys(int n, String s) {

        int nivelMar = 0;
        int valleys = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U'){
                nivelMar++;
                if (nivelMar == 0){
                    valleys++;
                }
            } else {
                nivelMar--;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(CountingValleys.countingValleys (12,"DDUUDDUDUUUD"));

    }
}
