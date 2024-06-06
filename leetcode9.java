//https://leetcode.com/problems/palindrome-number/
class Solution {
    public int reverse_num(int x){
        int reverse = 0;
        while(x > 0){
            reverse = (reverse*10) + (x % 10);
            x =  x / 10;
        }
        return reverse;
    }

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else return x == reverse_num(x);
    }
}
