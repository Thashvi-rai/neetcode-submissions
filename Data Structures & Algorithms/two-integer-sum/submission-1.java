class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> sum=new HashMap<>();

       for(int i=0;i<nums.length;i++){
        sum.put(nums[i],i);
       } 
       for(int i=0;i<nums.length;i++){
        int diff= target- nums[i];
        if(sum.containsKey(diff) && sum.get(diff)!=i){
            return new int[]{i, sum.get(diff)};
        }
       }
       return null;
    }
}
