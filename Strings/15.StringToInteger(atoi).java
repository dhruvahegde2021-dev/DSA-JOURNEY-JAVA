// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        
        int i = 0;
        int n = s.length();
        int sign = 1;
        long res = 0;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;
            if (sign == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && res > (long)Integer.MAX_VALUE + 1) {
                return Integer.MIN_VALUE;
            }
            i++; 
        }

        return (int)(res * sign);
    }
}