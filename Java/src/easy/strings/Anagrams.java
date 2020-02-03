package easy.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Anagrams {

    static int makeAnagram(String a, String b) {

        Map<Character,Integer> aSet = new HashMap();

        for (int i = 0; i < a.length(); i++) {
            aSet.computeIfPresent(a.charAt(i),(k,v)-> v+1);
            aSet.putIfAbsent(a.charAt(i),1);
        }

        for (int i = 0; i < b.length(); i++) {
            aSet.computeIfPresent(b.charAt(i),(k,v)-> v-1);
            aSet.putIfAbsent(b.charAt(i),-1);
        }

        AtomicInteger resultado = new AtomicInteger();
        aSet.forEach((key,value)-> {
            resultado.addAndGet(Math.abs(value));
        });

        return resultado.get();





    }

    public static void main(String[] args) {
        System.out.println(Anagrams.makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
        //System.out.println(Anagrams.makeAnagram("cde","abc"));
    }

}
