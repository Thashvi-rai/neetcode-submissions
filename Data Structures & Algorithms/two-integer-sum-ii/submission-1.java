class Solution {
    public int[] twoSum(int[] numbers, int target) {
      Map<Integer, Integer> count= new HashMap<>();

      for(int i=0;i<numbers.length;i++){
        int diff= target- numbers[i];
        if(count.containsKey(diff)){
          return new int[]{count.get(diff), i+1};
        }
        count.put(numbers[i],i+1);
      } 
      return null; 
    }
}
