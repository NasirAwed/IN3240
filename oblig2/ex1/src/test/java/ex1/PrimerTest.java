package ex1;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimerTest {
  @Test
  public void testAppHasAGreeting() {
    Primer p = new Primer();
    int N = 100;
    int[] primes;

    primes = p.getPrimesUpTo(N);
    for (int i = 0; i < primes.length; i++)
      System.out.println(primes[i]);

    System.out.println(p.isPrime(0));
    System.out.println(p.isPrime(1));
    System.out.println(p.isPrime(2));
    System.out.println(p.isPrime(3));
    System.out.println(p.isPrime(4));

    assertEquals(2, 3);
  }
}
