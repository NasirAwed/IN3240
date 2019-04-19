package ex1;

import java.util.Arrays;

class Primer {
  public static boolean isPrime(int x) {
    boolean[] primeFlags;

    primeFlags = new boolean[x + 1];
    flagPrimesUpTo(primeFlags);

    return primeFlags[x];
  }

  public static int[] getPrimesUpTo(int N) {
    boolean[] primeFlags;
    int numFound;

    primeFlags = new boolean[N + 1];
    numFound = flagPrimesUpTo(primeFlags);

    return listPrimesFromFlags(primeFlags, numFound);
  }

  private static int flagPrimesUpTo(boolean[] flags) {
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

  private static void assumePrimesTrue(boolean[] v) {
    Arrays.fill(v, true);
    for (int i = 0; i < 2 && i < v.length; i++)
      v[i] = false;
  }

  private static int[] listPrimesFromFlags(boolean[] flags, int truths) {
    int[] primes;
    int idx;

    primes = new int[truths];
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
