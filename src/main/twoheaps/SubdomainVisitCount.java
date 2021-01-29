package twoheaps;
import java.util.*;
public class SubdomainVisitCount {
    HashMap<String, Integer> visited = new HashMap<>();

    public List<String> subdomainVisits(String[] cpdomains) {
        for (String s : cpdomains) {
            splitDomains(s);
        }
        List<String> arr = new ArrayList<>();
        visited.forEach((s, integer) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(integer).append(" ").append(s);
            arr.add(sb.toString());
        });
        return arr;
    }

    public void splitDomains(String s) {
        int visited = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                visited = Integer.parseInt(s.substring(0, i));
                String l = s.substring(i + 1);
                this.visited.put(l, this.visited.getOrDefault(l, 0) + visited);
            }
            if (s.charAt(i) == '.') {
                String l = s.substring(i + 1);
                this.visited.put(l, this.visited.getOrDefault(l, 0) + visited);
            }
        }
    }
}
