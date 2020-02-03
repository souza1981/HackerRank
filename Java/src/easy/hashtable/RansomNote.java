package easy.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {

        if (magazine.length < note.length){
            System.out.println("No");
            return;
        }

        Map<String,Integer> mapMagazine = new HashMap<>();
        for (int i = 0; i < magazine.length; i++) {
            if (magazine[i].trim().length() == 0) continue;
            mapMagazine.computeIfPresent(magazine[i].trim(),(k,v)-> v+1);
            mapMagazine.putIfAbsent(magazine[i].trim(), 1);
        }


        for (int i = 0; i < note.length; i++) {
            if (!mapMagazine.containsKey(note[i].trim())){
                System.out.println("No");
                return;
            } else {
                mapMagazine.compute(note[i].trim(),(k,v)-> v-1);
                if (mapMagazine.get(note[i]) < 0){
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");

    }

    public static void main(String[] args) {

        String[] magazine = new String[]{"A", "AA", "AAA", "AA"};
        String[] note = new String[]{"A","AA", "AA"};
        RansomNote.checkMagazine(magazine,note);

    }


}
