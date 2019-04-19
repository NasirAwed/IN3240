import java.util.Arrays;

class Primer {
  private boolean isDivisible(int a, int b) {
    // TODO refactor out of this class

    return a % b == 0;
  }

  public boolean isPrime(int x) {
    return false; // TODO
  }

  public int[] getPrimesUpTo(int N) {
    boolean[] isPrimes;
    int[] primes;
    int numFound;

    isPrimes = new boolean[N];
    Arrays.fill(isPrimes, true);
    isPrimes[0] = false;
    isPrimes[1] = false;

    numFound = 0;
    for (int i = 0; i < isPrimes.length; i++) {
      if (!isPrimes[i])
        continue;

      numFound++;

      for (int j = i + 1; j < isPrimes.length; j++) {
        if (isDivisible(j, i))
          isPrimes[j] = false;
      }
    }

    primes = new int[numFound];
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
