class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;

            int l=i+1;
            int r= nums.length-1;
            int a= nums[i];
            while(l<r){
                int t= a+nums[l]+nums[r];
                if(t>0) r--;
                else if(t<0) l++;
                else{
                    res.add(Arrays.asList(a, nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
