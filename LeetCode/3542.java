import java.util.*;
public class Solution{
  public int minOperations(int[] nums){
    List<Integer> s = new ArrayList<>(); // Creating a Monotonic List
    int res = 0; //Tracks the result or no of operation to make all elements to 0
    for(int num: nums){     // Traversing the num array
      while(!s.isEmpty() && s.get(s.size()-1) > num) {  // Remove Bigger elements than the current num
        s.remove(s.size()-1); 
      }
      if (num == 0) continue; // If the element is 0, No need to do anything
      if(s.isEmpty() || s.get(s.size()-1) < num) { // If this height wasn't seen before it triggers a new operation
        res++; // Increment the operation
        s.add(num);
      }
    }
  }
}

    
