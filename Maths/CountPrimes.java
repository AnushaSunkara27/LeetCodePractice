public class CountPrimes {
        public int countPrimes(int n) {
            if (n <= 2) {
                return 0;
            }
    
            boolean[] isPrime = new boolean[n];
            // Initialize all numbers as prime
            for (int i = 2; i < n; i++) {
                isPrime[i] = true;
            }
    
            // Apply Sieve of Eratosthenes
            for (int i = 2; i * i < n; i++) {
                if (isPrime[i]) {
                    // Mark multiples of i as not prime
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
    
            // Count prime numbers
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }
    
            return count;
        }
}
