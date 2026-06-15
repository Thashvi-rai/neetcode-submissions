class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> res= new HashMap<>();

       for(String s: strs){
        char[] charArray= s.toCharArray();
        Arrays.sort(charArray);
        String sorts= new String(charArray);
        res.putIfAbsent(sorts, new ArrayList<>());
        res.get(sorts).add(s);
       } 
       return new ArrayList<>(res.values());
    }
}
