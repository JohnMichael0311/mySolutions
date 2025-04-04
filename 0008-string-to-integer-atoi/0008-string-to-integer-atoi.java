class Solution {
    public int myAtoi(String s) {
        int INT_MAX = Integer.MAX_VALUE, INT_MIN = Integer.MIN_VALUE;
        int i = 0, n = s.length(), sign = 1, result = 0;

        
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            
            if (result > (INT_MAX - digit) / 10) {
                return (sign == 1) ? INT_MAX : INT_MIN;
            }

            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }
}