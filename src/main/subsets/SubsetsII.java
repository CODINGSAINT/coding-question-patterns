package subsets;
import java.util.*;
//90. Subsets II
//Medium

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        if(nums.length == 0) return result;
        List<Integer> num= new ArrayList<>();
        result.add(num);
        int end=0;
        for(int i=0; i<nums.length;i++){
            int startElement=0;;
            int current=nums[i];
            if(i>0){
                int prev=nums[i-1];
                if(current==prev)
                    startElement=end+1;
            }

            end= result.size()-1;
            for(int j=startElement;j<=end;j++) {
                List<Integer> newElem=new ArrayList<>(result.get(j));
                newElem.add(current);
                result.add(newElem);
            }

        }
        return result;


    }
}
