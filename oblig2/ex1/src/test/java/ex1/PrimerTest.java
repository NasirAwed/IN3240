package ex1;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimerTest {
  @Test
  public void testAppHasAGreeting() {
    int N = 100;
    int[] primes;

    primes = Primer.getPrimesUpTo(N);
    for (int i = 0; i < primes.length; i++)
      System.out.println(primes[i]);

    assertEquals(Primer.isPrime(0), false);
    assertEquals(Primer.isPrime(1), false);
    assertEquals(Primer.isPrime(2), true);
    assertEquals(Primer.isPrime(3), true);
    assertEquals(Primer.isPrime(4), false);
  }
}
