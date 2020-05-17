import java.util.*;

class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, int[]> map = new HashMap<>(); // int[2] = [incoming, outgoing]

        for (List<String> path : paths) {
            String source = path.get(0);
            String dest = path.get(1);

            // update outgoing
            int[] counts = map.getOrDefault(source, new int[] { 0, 0 });
            counts[1]++;
            map.put(source, counts);

            // update incoming
            counts = map.getOrDefault(dest, new int[] { 0, 0 });
            counts[0]++;
            map.put(dest, counts);
        }

        for (String city : map.keySet()) {
            if (map.get(city)[1] == 0)
                return city;
        }

        return "";
    }
}