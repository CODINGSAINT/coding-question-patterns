package slidingwindows;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        MinimumWindowSubstring minimumWindowSubstring=new MinimumWindowSubstring();
        minimumWindowSubstring.minWindow("ADOBECODEBANC","ABC");

    }

    public String minWindow(String s, String t) {
        String minimumWindow="";
        int min=Integer.MAX_VALUE;
        Map<Character, Integer>  freq= new HashMap<>();
        for (int i = 0; i <t.length() ; i++) {
            char current=t.charAt(i);
            freq.compute(current,(key, value)-> value==null?1:value+1);
        }

        int st=0;
        int count=0;
        int minLength=s.length();
        for (int end = 0; end < s.length() ; end++) {
            char current=s.charAt(end);
            if(freq.containsKey(current)){
                freq.put(current, freq.get(current)-1);
                count++;
            }


        }
        return minimumWindow;

    }
}
