import java.util.*;
public class Solution{
  public long maxRunTime(int n, int[] batteries){
    long sum = 0;
    for(int num: batteries){
      sum+=num;
    }
    long left = 0;
    long right = sum/n;
    while(left<right){
      long mid = left+(right-left+1)/2;
      if(canRun(mid, n, batteries){
        left = mid;
      }else{
        right = mid-1;
      }
    }
    return left;
  }
  public boolean canRun(long mid, int n, int[] batteries){
    long power = 0;
    for(int num: batteries){
      power += Math.min(num, mid);
    }
    if(power>=mid*n){
      return true;
    }else{
      return false;
    }
  }
}
