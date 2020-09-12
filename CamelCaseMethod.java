/*
Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. 
All words must have their first letter capitalized without spaces.

For instance:

camelCase("hello case"); // => "HelloCase"
camelCase("camel case word"); // => "CamelCaseWord"
Don't forget to rate this kata! Thanks :)
*/

public class CamelCaseMethod {

    public static String camelCase(String str) {
        StringBuilder builder = new StringBuilder();
        String text[] = str.trim().split(" ");
        for (String s : text) {
            if (s.isEmpty()) {
                continue;
            }
            builder.append(s.trim().replaceFirst(s.substring(0, 1), s.substring(0, 1).toUpperCase()));
        }
        return builder.toString();
    }
}
