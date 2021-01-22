package subsets;

import java.util.*;

public class LetterCasePermutation {

    public List<String> letterCasePermutation(String str) {

        List<String> perm = new ArrayList<>();
        if (str == null)
            return perm;

        perm.add(str);
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {    int n = perm.size();
                for (int j = 0; j < n; j++) {
                    char[] chs = perm.get(j).toCharArray();
                      if (Character.isUpperCase(chs[i]))
                        chs[i] = Character.toLowerCase(chs[i]);
                    else
                        chs[i] = Character.toUpperCase(chs[i]);
                    perm.add(String.valueOf(chs));
                }
            }
        }
        return perm;
    }
}
