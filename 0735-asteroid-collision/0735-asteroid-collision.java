class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        ArrayList<Integer> ls = new ArrayList<>();

        // for (int num : asteroids){
        // ls.add(num);
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if (Math.abs(ls.get(i)) == Math.abs(ls.get(j)) && ls.get(i) != ls.get(j)){
        // ls.remove(j);
        // ls.remove(i);
        // i--;
        // break;
        // }
        // if (ls.get(i) < 0 && ls.get(j) > 0 || ls.get(i) > 0 && ls.get(j) < 0) {
        // ls.set(i, Math.max(ls.get(i), ls.get(j)));
        // }
        // }
        // }
        // int[] arr = ls.stream().mapToInt(i -> i).toArray();
        // return arr;
        for (int i = 0; i < n; i++) {
            if (asteroids[i] > 0) {
                ls.add(asteroids[i]);
            } else {
                while (!ls.isEmpty() && ls.get(ls.size() - 1) > 0 && ls.get(ls.size() - 1) < Math.abs(asteroids[i])) {
                    ls.remove(ls.size() - 1);
                }
                if (ls.isEmpty() || ls.get(ls.size() - 1) < 0) {
                ls.add(asteroids[i]);
            } else if (ls.get(ls.size() - 1) == Math.abs(asteroids[i])) {
                ls.remove(ls.size() - 1);
            }

            }
           
        }

        return ls.stream().mapToInt(Integer::intValue).toArray();

    }
}