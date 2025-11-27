import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<n; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String s = String.valueOf(temp);
            if (map.get(s) != null){
                List<String> res = map.get(s);
                res.add(strs[i]);
                map.put(s, res);
            } else {
                List<String> res = new ArrayList<>();
                res.add(strs[i]);
                map.put(s, res);
            }
        }

        for (List<String> value: map.values()) {
            ans.add(value);
        }
        return ans;
    }
}
