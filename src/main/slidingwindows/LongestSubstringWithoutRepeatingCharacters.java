package slidingwindows;

import java.util.HashMap;

//3. Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring("araaci"));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        int st = 0;
        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            if (freq.containsKey(current)) {
                st = Integer.max(st, freq.get(current) + 1);
            }
            freq.put(current, end);

            max = Math.max(max, end - st + 1);
        }
        return max;
    }
}
