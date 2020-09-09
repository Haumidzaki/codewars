import java.util.*;

/*
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
*/

public class DuplicateEncoder {
    private static List<String> listChar;
    private static Map<String, Integer> mapCount;
    private static StringBuilder builder;

    static String encode(String word){
        listChar = new ArrayList<>();
        mapCount = new HashMap<>();

        for (int i = 0; i < word.length(); i++){
            listChar.add(word.substring(i, i + 1).toLowerCase());
        }

        for (String text : listChar){
            mapCount.put(text, Collections.frequency(listChar, text));
        }

        builder = new StringBuilder();
        for (String text : listChar){

            if(mapCount.get(text) > 1){
               builder.append(")");
            }else {
                builder.append("(");
            }
        }
        return builder.toString();
    }
}
