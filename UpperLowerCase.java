public class UpperLowerCase {
    static String lower(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.setCharAt(i, (char) (ch + 32));
            }
        }
        return sb.toString();
    }

    static String upper(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.setCharAt(i, (char) (ch - 32));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "Najmus";
        // built in code
        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());
        System.out.println(lower(s));
        System.out.println(upper(s));

    }

}
