package intervals;

import java.util.ArrayList;
import java.util.List;
//57 https://leetcode.com/problems/insert-interval/
public class InsertInteval {
    public static void main(String[] args) {
        InsertInteval insertInteval= new InsertInteval();
        int result[][]
                =insertInteval.insert(
                        new int[][]{{1,2},{3,5}, {6,7},{8,10},{12,16}},
                new int[]{4,8} );

        for(int[] a:result){
            System.out.print("("+a[0]+","+a[1]+"), ");
        }
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> resultList= new ArrayList<>();

        int i=0;
        //Since they are non overlapping
        while(i<intervals.length && intervals[i][1] < newInterval[0]){
            resultList.add(intervals[i]);
            i++;
        }
        // Not all non operlapping before intervals are added

        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Integer.max(intervals[i][0],newInterval[0]);
            newInterval[1]=Integer.max(intervals[i][1],newInterval[1]);
            i++;

        }
        resultList.add(newInterval);
        while(i<intervals.length)
            resultList.add(intervals[i++]);

        int result[][]= new int[resultList.size()][2];
        for(int j=0;j<resultList.size();j++)
            result[j]=resultList.get(j);

        return result;


    }
}
