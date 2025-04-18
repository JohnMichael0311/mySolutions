class Solution {
    public String countAndSay(int n) {
         if (n == 1) return "1";
        
        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char current = result.charAt(0);

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    count++;
                } else {
                    sb.append(count).append(current);
                    current = result.charAt(j);
                    count = 1;
                }
            }

            sb.append(count).append(current); 
            result = sb.toString();
        }

        return result;
    }
}