package easy.strings;

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {

        char c = Character.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)){
                sum++;
            }
            c = s.charAt(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(AlternatingCharacters.alternatingCharacters("AAABBB"));
    }

}
