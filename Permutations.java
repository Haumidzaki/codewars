import java.util.ArrayList;
import java.util.List;

/*
In this kata you have to create all permutations of an input string and remove duplicates,
if present. This means, you have to shuffle all letters from the input in all possible orders.

Examples:

Permutations.singlePermutations("a") `shouldBe` ["a"]
Permutations.singlePermutations("ab") `shouldBe` ["ab", "ba"]
Permutations.singlePermutations("aabb") `shouldBe` ["aabb","abab","abba","baab","baba","bbaa"]
The order of the permutations doesn't matter.
*/

public class Permutations {

    public static void main(String[] args) {
        System.out.println(singlePermutations("ABC"));
    }

    public static List<String> singlePermutations(String s) {
        List<String> list = new ArrayList<>();
        return permutation(s, 0, s.length() - 1, list);
    }

    private static List<String> permutation(String str, int firstChar, int endChar, List<String> list) {

        if (firstChar == endChar) {

            if (!list.contains(str)) {
                list.add(str);
            }
        }

        for (int i = firstChar; i <= endChar; i++) {

            str = swap(str, firstChar, i);
            permutation(str, firstChar + 1, endChar, list);
        }

        return list;
    }

    private static String swap(String string, int start, int end) {
        char[] chars = string.toCharArray();
        char first = chars[start];
        chars[start] = chars[end];
        chars[end] = first;
        return String.valueOf(chars);
    }
}
