class Solution {
    static final long mod = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long c = (n+1)/2;
        long f = n/2;
        long x = 5;
        long y = 4;
        long mod = 1_000_000_007;
        int cnt = (int)((pospow(x, c) * pospow(y, f))% mod);
        return cnt;
        
    }
    public long pospow(long x, long n){
        if(n==0) return 1;
        long half = pospow(x , n/2) % mod;
        if(n%2 == 0) {
            return (half * half) % mod;

        }else {
            return (half *(half * (x% mod))%mod)%mod;
        }
        
    }
}