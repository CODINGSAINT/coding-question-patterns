package twopointers;

import java.util.List;

//524. Longest Word in Dictionary through Deleting
public class LongestWordinDictionarythroughDeleting {
    public String findLongestWord(String s, List<String> d) {
        int[] freq = new int[26];
        char[] sChars = s.toCharArray();
        int maxLen = 0;
        String res = "";
        for (String str : d) {
            int st = 0;
            int end = 0;
            int match = 0;
            while (end < s.length() && st < str.length()) {
                int current = str.charAt(st);
                int currentAtS = s.charAt(end);
                if (current == currentAtS) {
                    st++;
                    end++;
                    match++;
                } else {
                    end++;
                }
            }
            if (match == str.length()) {
                if (maxLen < str.length()) {
                    maxLen = str.length();
                    res = str;
                } else if (str.length() == maxLen) {

                    res = compare(res, str);
                }
            }

        }

        return res;
    }

    String compare(String a, String b) {
        if (a.equals(b)) return a;

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        for (int i = 0; i < b.length(); i++) {
            if (aChar[i] == bChar[i])
                continue;
            if (aChar[i] < bChar[i]) {
                return a;
            }

            if (aChar[i] > bChar[i]) {
                return b;
            }


        }
        return "";
    }
}