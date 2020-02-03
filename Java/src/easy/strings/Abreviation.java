package easy.strings;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Abreviation {


    static private boolean check(String a, String b) {

        if (b.isEmpty() && !a.isEmpty()) {
            for (int i = 0; i < a.length() - 1; i++) {
                if (a.charAt(i) < 97) {
                    return false;
                }
            }
            return true;
        } else if (a.isEmpty() && !b.isEmpty()) {
            return false;
        } else if (a.isEmpty() && b.isEmpty()) {
            return true;
        } else if (a.toUpperCase().charAt(a.length() - 1) == b.toUpperCase().charAt(b.length() - 1)) {

            if (a.length() - 2 > 0){
                return check("", b.substring(0, b.length() - 2)) || check("", b.substring(0, b.length() - 1));
            } else {
                return check(a.substring(0, a.length() - 2), b.substring(0, b.length() - 2)) || check(a.substring(0, a.length() - 2), b.substring(0, b.length() - 1));
            }
        } else if (a.charAt(a.length() - 1) >= 97) {
            return check(a.substring(0, a.length() - 1), b);
        } else {
            return false;
        }
    }


    static String abbreviation(String a, String b) {

        if (check(a, b)) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {
//        System.out.println(Abreviation.abbreviation("KXzQ","K"));
        System.out.println(Abreviation.abbreviation("daBcd", "ABC"));
    }
}
