import java.util.*;

public class Solution {
    String s = new String();

    public static void main(String[] args) {

        Solution s = new Solution();
       System.out.println(s.checkPartitioning( "abcbdd"));
        System.out.println(s.checkPartitioning("bcbddxy"));
        System.out.println(s.checkPartitioning("juchzcedhfesefhdeczhcujzzvbmoeombv"));
        System.out.println(s.checkPartitioning("gbofdldvwelqiizbievfolrujxnwjmjwsjrjeqecwssgtlteltslfzkblzihcgwjnqaiqbxohcnxulxozzkanaofgoddogfoanakzzoxluxnchoxbqiaqnjwgchizlbkzflstletltgsswceqejrjswjmjwnxjurlofveibziiqlewvdldfobgxebrcrbexv"));

        /*String t=""
        System.out.println("abcbdd".substring());*/
        //System.out.println(s.checkPartitioning(""));



    }

    /*
    Input: adjacentPairs = [[2,1],[3,4],[3,2]]
Output: [1,2,3,4]
Explanation: This array has all its adjacent pairs in adjacentPairs.
Notice that adjacentPairs[i] may not be in left-to-right order.
Input: adjacentPairs = [[4,-2],[1,4],[-3,1]]
Output: [-2,4,1,-3]
Explanation: There can be negative numbers.
Another solution is [-3,1,4,-2], which would also be accepted.
     */
    public boolean checkPartitioning(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        List<Integer> firstIndex = new ArrayList<>();
        // firstIndex.add(0);

        var lastIndex = new ArrayList<Integer>();
        //lastIndex.add(s.length()-1);
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);
        for (int i = 0; i < s.length() ; i++) {
            char current = s.charAt(i);
            if (current == firstChar)
                firstIndex.add(i + 1);
            if (current == lastChar)
                lastIndex.add(i);

        }
        int st = 0;
        List<String> prefixPallindrome = new ArrayList<>();
        for (int i = 0; i < firstIndex.size(); i++) {

            String prefix = s.substring(0, firstIndex.get(i));
            if (isPallindrome(prefix))
                prefixPallindrome.add(prefix);
        }
        List<String> suffixPallindrome = new ArrayList<>();
        for (int i = 0; i < lastIndex.size(); i++) {

            String suffix = s.substring(lastIndex.get(i));
            if (isPallindrome(suffix))
                suffixPallindrome.add(suffix);
        }
        if (prefixPallindrome.size() > 0 && suffixPallindrome.size() > 0) {
            for (int i = 0; i < prefixPallindrome.size(); i++) {
                String p=prefixPallindrome.get(i);
                String check= s.replaceFirst(p,"");

                for (int j = 0; j < suffixPallindrome.size(); j++) {
                    String q= suffixPallindrome.get(j);
                    String validate=check.replace(q,"");
                    if(isPallindrome(validate))
                        return true;

                }
            }
        }


        return false;

    }

    boolean isPallindrome(String str) {
        freq.contains(str) return true;
        char c[] = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (c[start] != c[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;


    }
}