package q1_01;

import static q1_01.IsUnique.isUniqueChars;

public class Test {
    public static void main(String[] args) {
        String[] words = {"abcde", "hellow"};
        for (String word : words) {
                System.out.println(word + ": " + isUniqueChars(word));
        }
    }
}
