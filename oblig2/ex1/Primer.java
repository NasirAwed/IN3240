import java.util.Arrays;

class Primer {
  public boolean isPrime(int x) {
    return false; // TODO
  }

  public int[] getPrimesUpTo(int N) {
    boolean[] primeFlags;
    int numFound;

    primeFlags = new boolean[N];
    numFound = flagPrimesUpTo(primeFlags);

    return listPrimesFromFlags(primeFlags, numFound);
  }

  private int flagPrimesUpTo(boolean[] flags) {
    int numFound;

    assumePrimesTrue(flags);
    numFound = 0;

    for (int i = 2; i < flags.length; i++) {
      if (!flags[i])
        continue;

      numFound++;

      for (int j = i + 1; j < flags.length; j++) {
        if (Util.isDivisible(j, i))
          flags[j] = false;
      }
    }

    return numFound;
  }

  private void assumePrimesTrue(boolean[] v) {
    Arrays.fill(v, true);
    v[0] = false;
    v[1] = false;
  }

  private int[] listPrimesFromFlags(boolean[] flags, int found) {
    int[] primes;
    int idx;

    primes = new int[found];
    idx = 0;
    for (int i = 0; i < flags.length; i++) {
      if (flags[i]) {
        primes[idx] = i;
        idx++;
      }
    }

    return primes;
  }
}
