import java.util.*;

public class Solution
{ String s= new String ();
    public static void main(String[] args) {

        Solution solution= new Solution();

       // howMany("How many eggs are in a half-dozen 13?");
        //howMany("He is a good programmer, he won 865 comp, but sometimes he dont. What do you think? All test case should pass. Done-done?");
        //howMany("jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.");
        // searchTriplets(new int[]{-1, 4, 2, 1, 3},5);

        //searchTriplets(new int[]{-1, 0, 2, 3},3);
   //   solution.sortedSquares(new int[]{9,4,2,10,7,8,8,1,9}));

    //perfectSubstring("1102021222",2);
        //System.out.println(solution.totalMoney(1));
        System.out.println(solution.maximumGain("cdbcbbaaabab", 4,5));
        System.out.println(solution.maximumGain("aabbaaxybbaabb", 5,4));

    }


    public int maximumGain(String s, int x, int y) {
        this.s=s;
        StringBuilder result = new StringBuilder();
        this.s = s;
        if (x > y)
            return calculate('a', 'b') * x + calculate('b', 'a') * y;
        return calculate('b', 'a') * y + calculate('a', 'b') * x;




    }
    public int calculate( char a, char b){
        int total=0;
        int val=0;
        Stack<Character> stack= new Stack<>();
        for (char current:s.toCharArray()) {
            if(stack.size()>0  && stack.peek()==a && current==b ){
                val++;
                stack.pop();
            }else{
                stack.push(current);

            }
            }
        StringBuffer sb= new StringBuffer();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        s=sb.reverse().toString();
        return  val;
    }

    public int totalMoney(int n) {

        int money=0;
        int weekCounter=1;
        int current=1;
        for (int i = 1; i <= n; i++) {
            money+=current++;
            if(i%7==0){
                current=++weekCounter;
            }

        } return money;

    }
}

