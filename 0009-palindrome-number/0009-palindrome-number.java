class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int before = x;
        int result = 0;
        while (x >= 10) {
            result = result * 10;
            result = result + (x % 10);
            x /= 10;
        }
        result = result * 10 + x;
        return result == before;
    }
}