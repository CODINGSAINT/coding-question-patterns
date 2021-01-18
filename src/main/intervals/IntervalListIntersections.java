package intervals;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {


    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();

        int i = 0, j = 0;
        while ( i < firstList.length && j < secondList.length) {
            int[] first = firstList[i];
            int[] second = secondList[j];

            int start = Math.max(first[0], second[0]);
            int end = Math.min(first[1], second[1]);

            if (start <= end) {
                result.add(new int[] {start, end});
            }
            if (first[1] < second[1]) {
                i++;
            } else {
                j++;
            }

        }

        int [][]ansRes= new int[result.size()][2];
        for(int k=0;k<result.size();k++){
            ansRes[k]=result.get(k);
        }
        return ansRes;

    }
}
