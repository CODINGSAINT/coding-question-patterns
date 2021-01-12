package twopointers;

/**
 *
 */
public class BackspaceStringCompare {
    public static void main(String[] args) {
      BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
      /*  boolean isSame=backspaceStringCompare.backspaceCompare("ab#c","ad#c");
        System.out.println(isSame);*/
        boolean isNotSame=backspaceStringCompare.backspaceCompare("a#c" ,"b" );


    }

    public boolean backspaceCompare(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int index1 = len1 - 1;
        int index2 = len2 - 1;
        while (index1 >= 0 || index2 >= 0) {
            int validIndex1 = getValidIndex(str1, index1);
            int validIndex2 = getValidIndex(str2, index2);

            if (validIndex2 < 0 && validIndex2 < 0) {
                return true;
            }
            if (validIndex1 < 0 || validIndex2 < 0) {
                return false;
            }
            if (str1.charAt(validIndex1) != str2.charAt(validIndex2)) {
                return false;
            }
            index1 = validIndex1 - 1;
            index2 = validIndex2 - 1;
        }
        return true;
    }

    private int getValidIndex(String str, int index) {
        int backSpace = 0;
        while (index >= 0) {
            char current= str.charAt(index);
            if (current== '#') {
                backSpace++;
            } else if (backSpace > 0) {
                backSpace--;
            } else
                break;
            index--;

        }
        return index;
    }
}
