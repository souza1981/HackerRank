package easy.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {


        Set<Character> s1Set = new HashSet<>();
        Set<Character> s2Set = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            s1Set.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            s2Set.add(s2.charAt(i));
        }

        s1Set.retainAll(s2Set);

        if (s1Set.isEmpty()){
            return "NO";
        }

        return "YES";

    }

    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "world";

        System.out.println(TwoStrings.twoStrings(s1,s2));
    }
}
