package ex1;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimerTest {
  @Test
  public void testFindArrayOfTenFirst() {
    int[] expected;
    int[] actuall;

    expected = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    actuall = Primer.getPrimesUpTo(30);
    assertArrayEquals(expected, actuall);
  }

  @Test
  public void testNegativeNumber() {
    int[] emptyArray;

    emptyArray = new int[0];
    assertArrayEquals(emptyArray, Primer.getPrimesUpTo(-1));
    assertArrayEquals(emptyArray, Primer.getPrimesUpTo(-2));
    assertArrayEquals(emptyArray, Primer.getPrimesUpTo(-10));
  }

  @Test
  public void testNoLengthArray() {
    assertArrayEquals(new int[0], Primer.getPrimesUpTo(0));
  }

  @Test
  public void testLengthOf100First() {
    assertEquals(100, Primer.getPrimesUpTo(541).length);
  }

  @Test
  public void testFirstFiveIndividuals() {
    assertEquals(Primer.isPrime(0), false);
    assertEquals(Primer.isPrime(1), false);
    assertEquals(Primer.isPrime(2), true);
    assertEquals(Primer.isPrime(3), true);
    assertEquals(Primer.isPrime(4), false);
  }
}
