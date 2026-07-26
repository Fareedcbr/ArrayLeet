
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0; 
        int l = 0; 
        Map<Character, Integer> map = new HashMap();
        char [] arr = s.toCharArray();
        int result = 0;
        for (; r < arr.length; r++)
        {
            int index=map.getOrDefault(arr[r],-1);
            if(index != -1 && index >= l)
            {
                result = Math.max(result, r - 1 - l + 1);
                l = index + 1;
            }
            map.put(arr[r],r);
        }
        return Math.max(result, r - 1 - l + 1);
    }
}