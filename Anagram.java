// time complexity is 0(n)*n(logn)
// space complexity is 0(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String str =strs[i];
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sorted=String.valueOf(charArray);
            if(!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
}