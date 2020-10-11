package q1_01;

public class IsUnique {
    public static boolean isUniqueChars(String str) {
        if (str.length() > 120) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i <str.length(); i++) {
            int val = str.charAt(i);
                if (char_set[val]) return false;
                char_set[val] = true;
        }
        return true;
    }
}
