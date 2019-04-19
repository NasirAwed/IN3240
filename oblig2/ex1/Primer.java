import java.util.Arrays;

class Primer {
  public boolean isPrime(int x) {
    return false; // TODO
  }

  public int[] getPrimes(int N) {
    boolean[] isPrimes;
    int[] primes;

    isPrimes = new boolean[N];
    Arrays.fill(isPrimes, true);
    isPrimes[0] = false;
    isPrimes[1] = false;

    primes = new int[N]; // TODO smaller size
    int idx = 0; // TODO don't declare and init vars within body!
    for (int i = 0; i < isPrimes.length; i++) {
      if (isPrimes[i]) {
        primes[idx] = i;
        idx++;
      }
    }

    return primes;
  }
}
