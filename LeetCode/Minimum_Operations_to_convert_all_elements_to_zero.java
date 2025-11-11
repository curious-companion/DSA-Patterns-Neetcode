import java.util.*;
public class Solution{
  public int minOperations(int[] nums){
    List<Integer> s = new ArrayList<>();
    int res = 0;
    for(int num: nums){
      while(!s.isEmpty() && s.get(s.size()-1) > num) {
        s.remove(s.size()-1);
      }
      if (num == 0) continue;
      if(s.isEmpty() || s.get(s.size()-1) < num) {
        res++;
        s.add(num);
      }
    }
  }
}

    
