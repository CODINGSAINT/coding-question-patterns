package subsets;

import java.util.*;
/*78. Subsets
        Medium*/
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) return result;
        List<Integer> num = new ArrayList<>();
        result.add(num);
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int totalElems = result.size();
            for (int j = 0; j < totalElems; j++) {
                List<Integer> newElem = new ArrayList<>(result.get(j));
                newElem.add(current);
                result.add(newElem);
            }

        }
        return result;

    }
}
