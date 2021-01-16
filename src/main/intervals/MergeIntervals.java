package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//56.https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {
    public static void main(String[] args) {
        MergeIntervals m = new MergeIntervals();
        int arr[][] = new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};
        System.out.println(m.merge(arr));

    }

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();

        List<List<Integer>> merged = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] < end) {
                continue;
            }


            if (intervals[i][0] > end) {
                int[] res = new int[2];
                res[0] = start;
                res[1] = end;
                result.add(res);
                start = intervals[i][0];
            }
            end = intervals[i][1];


        }

        int[] res = new int[2];
        res[0] = start;
        res[1] = end;
        result.add(res);

        int[][] finalResult = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }
        return finalResult;


    }
}
