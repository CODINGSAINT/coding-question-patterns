package slidingwindows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// https://leetcode.com/problems/substring-with-concatenation-of-all-words/
public class SubstringwithConcatenationofAllWords {
    public static void main(String[] args) {
        SubstringwithConcatenationofAllWords s = new SubstringwithConcatenationofAllWords();
        System.out.println(s.findSubstring("barfoothefoobarman", new String[]{"foo","bar"}));
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        HashMap<String, Integer> freq = new HashMap<>();
        int count = 0;
        int singleWordLength=words[0].length();
        int totalWords=words.length;
        int wordLength = singleWordLength*totalWords;

        for (String word : words) {
            freq.put(word, 1);
        }
        int st = 0;
        StringBuffer sb = new StringBuffer();
        for (int end = 0; end <= s.length() - wordLength; end++){
            HashMap<String,Integer> windowMap= new HashMap<>();
            for(int window=0;window<totalWords;window++){
                int nextWordIndex= end+window*singleWordLength;
                String word= s.substring(nextWordIndex,nextWordIndex+singleWordLength );
                windowMap.put(word, windowMap.getOrDefault(word,0)+1);
                if(!freq.containsKey(word))
                    break;
                if(freq.getOrDefault(word,0)<windowMap.get(word))
                    break;
                if(window+1== totalWords)
                    result.add(end);

            }

        }
        return result;
    }
}
