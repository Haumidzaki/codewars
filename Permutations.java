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

class Permutations {

    public static void main(String[] args) {
        System.out.println(singlePermutations("aabb"));
    }

    public static List<String> singlePermutations(String s) {
        List<String> list = new ArrayList<>();
        int n = s.length();
        return permute(s, 0, n - 1, list);
    }

    private static List<String> permute(String str, int l, int r, List<String> list) {

        if (l == r) {

            if(!list.contains(str)){
                list.add(str);
            }

        }else {

            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, list);
                str = swap(str, l, i);
            }
        }
        return list;
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
