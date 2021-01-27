import java.util.*;

public class Solution
{ String s= new String ();
    public static void main(String[] args) {

        Solution solution= new Solution();
        System.out.println(solution.minimumTeachings(2,new
                        int[][]{{1},{2},{1,2}} ,
                new int[][]{{1,2},{1,3},{2,3}}));/*
        System.out.println(solution.minimumTeachings(3,new
                int[][]{{2},{1,3},{1,2},{3}} ,
                new int[][]{{1,4},{1,2},{3,4},{2,3}}));*/
        //System.out.println(solution.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));


    }
    //Input: n = 3, languages = [[2],[1,3],[1,2],[3]], friendships = [[1,4],[1,2],[3,4],[2,3]]
    //Output: 2
    //Explanation: Teach the third language to users 1 and 2, yielding two users to teach.
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int knownLanguages[]=new int [n+1];
        boolean seen[]=new boolean[languages.length];
        for (int i = 0; i < friendships.length; i++) {
            int friends[]= friendships[i];
            int u=friends[0];
            int v=friends[1];

            int languagesU[]=languages[u-1];
            int languagesV[]=languages[v-1];
            //find the users who need to learn any language
            Arrays.sort(languagesU);
            Arrays.sort(languagesV);
            int uStart=0;
            int vStart=0;
            boolean canSpeak=false;
            while(uStart<languagesU.length && vStart<languagesV.length){
                if(languagesU[uStart]==languagesV[vStart]){
                    canSpeak=true;
                    break;
                }else if (languagesU[uStart]<languagesV[vStart]){
                    uStart++;
                }else{
                    vStart++;
                }
            }
            if(!canSpeak){
                //Increment total all known languages
                if(!seen[u]){
                    for (int j = 0; j < languagesU.length; j++) {
                        knownLanguages[languagesU[j]]++;
                    }
                    seen[u]=true;
                }
                if(!seen[v]) {
                    for (int j = 0; j < languagesV.length; j++) {
                        knownLanguages[languagesV[j]]++;
                    }
                    seen[v]=true;
                }
            }

            }
        int max=0;
        for (int i = 0; i < knownLanguages.length; i++) {
            max=Integer.max(max,knownLanguages[i]);
        }
        return max;
        }



    }


