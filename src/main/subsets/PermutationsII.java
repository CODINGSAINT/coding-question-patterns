package subsets;

import java.util.*;

//47. Permutations II
public class PermutationsII {
    //Gobal Variable for Way 1 using recussion
/*Set<List<Integer>> vals= new HashSet<>();
    int visited[]=null*/
    public List<List<Integer>> permuteUnique(int[] nums) {
       /*
       Way 1 Recurssion
       visited= new int[nums.length];
        permute(nums,new ArrayList<Integer>());
*/


        Set<List<Integer>> sol = new HashSet<>();
        Queue<List<Integer>> q = new LinkedList<>();

        q.add(new ArrayList<>());
        for (int current : nums) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                List<Integer> oldPerm = q.poll();
                for (int j = 0; j <= oldPerm.size(); j++) {
                    List<Integer> newPerm = new ArrayList<>(oldPerm);
                    newPerm.add(j, current);
                    if (newPerm.size() == nums.length)
                        sol.add(newPerm);
                    else
                        q.add(newPerm);


                }


            }

        }
        List<List<Integer>> fsol = new ArrayList<>();

        for (List<Integer> s : sol) {
            fsol.add(new ArrayList<>(s));
        }
        //System.out.println(fsol);
        return fsol;
    }

    private void permute(int[] nums, ArrayList<Integer> list) {
        if (list.size() == nums.length) {
            vals.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 0) {
                list.add(nums[i]);
                visited[i] = 1;
                permute(nums, list);
                list.remove(list.size() - 1);
                visited[i] = 0;
            }

        }


    }
}
