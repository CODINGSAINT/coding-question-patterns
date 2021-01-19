package intervals;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/interval-list-intersections/
public class IntervalListIntersections {


    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int firstLen= firstList.length;
        int secondLen= secondList.length;
        List<int[]> vals= new ArrayList<>();
        int first=0;
        int second=0;
        while(first<firstLen && second<secondLen){
            int firstStart=firstList[first][0];
            int firstEnd=firstList[first][1];

            int secondStart=secondList[second][0];
            int secondEnd=secondList[second][1];

            if(firstStart<=secondStart && secondStart<=firstEnd ||
                    secondStart<=firstStart && firstStart<=secondEnd
            ){
                vals.add(new int[]{
                        Integer.max(firstStart,secondStart ),
                        Integer.min(firstEnd,secondEnd )

                });

            }

            if(firstEnd<secondEnd ){
                first++;
            }else{
                second++;
            }
        }
        int [][] intervalIntersection = new int[vals.size()][2];
        for(int i=0; i<vals.size();i++){
            intervalIntersection[i]= vals.get(i);

        }

        return intervalIntersection;
    }
}
