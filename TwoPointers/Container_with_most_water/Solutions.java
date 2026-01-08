import java.util.*;
public class Solution {
  public static int maxArea(int[] heights) {
    int maxWater = 0;
    int left = 0;
    int right = heights.length-1;
    while(left<right) {
      int h = Math.min(height[left], height[right]);
      int currWater = h*(right-left);
      maxWater = Math.max(currWater, maxWater);
      while(height[left] <= h && left<right){
        left++;
      }
      while(height[right]<=h && left<right){
        right--;
      }
    }
    return maxWater;
  }
}
