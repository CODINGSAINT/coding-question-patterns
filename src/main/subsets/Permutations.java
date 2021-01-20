package subsets;
import java.util.*;
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> q= new LinkedList<>();

        q.offer(new ArrayList<>());
        for(int current: nums){

            int qSize=q.size();
            for(int i=0;i<qSize;i++){
                List<Integer> old= q.poll();
                for(int j=0;j<=old.size();j++){
                    List<Integer>newPerm=new ArrayList<>(old);
                    newPerm.add(j,current);
                    if(newPerm.size()==nums.length)
                        result.add(newPerm);
                    else
                        q.offer(newPerm);
                }

            }

        }
        return result;
    }
}
