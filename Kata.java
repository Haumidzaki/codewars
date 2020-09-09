import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
*/

public class Kata {
    private static List<Character> alphabet = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    public static String high(String s) {
        String[] words = s.split("\\s");
        Map<String, Integer> charSum = new HashMap<>();
        AtomicInteger max = new AtomicInteger(0);
        for (String text : words) {
            int sum = 0;
            for (int i = 0; i < text.length(); i++) {
                sum += (alphabet.indexOf(text.charAt(i)) + 1);
            }
            if (max.get() < sum) {
                max.set(sum);
            }
            charSum.put(text, sum);
        }
        return charSum.entrySet().stream().filter(k -> k.getValue() == max.get()).findFirst().get().getKey();
    }
}
