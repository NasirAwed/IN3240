class Main {
  public static void main(String[] args) {
    Primer p = new Primer();
    int N = 100;
    int[] primes;

    primes = p.getPrimesUpTo(N);
    for (int i = 0; i < primes.length; i++)
      System.out.println(primes[i]);
  }
}
