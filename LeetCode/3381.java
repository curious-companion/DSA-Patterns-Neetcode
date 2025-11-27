import java.util.*;
public class Solution {
  public long maxSubarraySum(int[] nums, int k){
    int n = nums.length;
    long prefSum = 0;
    long maxSum = LONG.MIN_VALUE;
    long kSum[] = new long[k];
    for(int i = 0; i<k; i++){
      kSum[i] = LONG.MAX_VALUE/2;
    }
    kSum[k-1]=0;

    for(int i = 0; i<n; i++){
      prefixSum += nums[i];
      maxSum = Math.max(maxSum, prefixSum-kSum[i%k]);
      kSum[i%k]= Math.min(kSum[i%k], prefixSum);
    }
    return maxSum;
  }
}
