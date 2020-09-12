public class CamelCaseMethod {

    public static String camelCase(String str) {
        StringBuilder builder = new StringBuilder();
        String text[] = str.trim().split(" ");
        for (String s : text) {
            if (s.isEmpty()) {
                continue;
            }
            builder.append(s.replaceFirst(s.substring(0, 1), s.substring(0, 1).toUpperCase()));
        }
        return builder.toString();
    }
}
