class Solution {
    public int findMin(int[] nums) {
      int res=Integer.MAX_VALUE;
      for(int num:nums){
        res= Math.min(res, num);
      } 
      return res; 
    }
}
