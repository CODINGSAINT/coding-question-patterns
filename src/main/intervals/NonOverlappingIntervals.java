package intervals;

import java.util.Arrays;
//435. Non-overlapping Intervals
public class NonOverlappingIntervals {

    public static void main(String[] args) {
        NonOverlappingIntervals n = new NonOverlappingIntervals();
        int result = n.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 3}, {2, 3}, {3, 4}});
        System.out.println(result);

        result = n.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}});
        System.out.println(result);

        result = n.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}});
        System.out.println(result);
        result = n.eraseOverlapIntervals(new int[][]{{0, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}});
        System.out.println(result);
        result = n.eraseOverlapIntervals(new int[][]{{0, 2}, {1, 3}, {1, 3}, {2, 4}, {3, 5}, {3, 5}, {4, 6}});
        System.out.println(result);


    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int i = 1;
        int count = 0;
        int end = intervals[0][1];
        while (i < intervals.length) {
            if (end > intervals[i][0]) {
                end = Integer.min(end, intervals[i][1]);
                count++;
            } else {
                end = intervals[i][1];
            }
            i++;
        }
        return count;

    }
}