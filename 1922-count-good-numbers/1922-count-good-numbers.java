class Solution {

    static long MOD = 1000000007;

    private long pow(long x, long n){               // IMPORTANT ANALYSIS OF THIS CODE :
        if(n == 0) return 1;                        // n positions mein even indexes = (n+1)/2, odd indexes = n/2.
                                                         
        long temp = pow(x, n/2);                    // Even exponent → half power ko square karo. THEN,

        if(n % 2 == 0){                        // Odd exponent → half power ko square karke ek extra x multiply karo.
            return (temp * temp) % MOD;
        }else{
            return (x * temp * temp) % MOD;
        }
    }

    public int countGoodNumbers(long n) {
        long even = (n + 1)/2;
        long odd = n/2;

        long first = pow(5, even) % MOD;
        long second = pow(4, odd) % MOD;

        return (int) ((first * second) % MOD);
    }
}