//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int m = haystack.length();
        for(int i = 0; i<m-n+1; i++){
            String str = haystack.substring(i,i+n);
            if(str.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
