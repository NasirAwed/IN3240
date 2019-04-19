# Mandatory assignment 2

This document contains only notes and thoughts.
It is not (at the moment of writing this) part of our answer to the assignment.

## Part 1 - JUnit Unit Testing

Prime numbers are only divisible by itself and 1.
We shall use the _Erathostenes' sold_ algorithm for finding primes:

1. Make a list of all integers from 2 ... N
2. Iterate from the second element up through the final one, whilst deleting
   those which are divisible by the first element
3. All elements that just "survived" being evaluated for deletion, are regarded
   as a set by itself, then go to 2
4. When no more subsets can be made, the complete list now contains only primes

## Miscellaneous notes

* Why MUST we "use Eclipse as an IDE"?
  * (What else could we use it as, haha)
  * Maybe I'll try using just the terminal
