# Exercise 2

Using **equivalence partitions** and **boundary value analysis**.

## 2.1 (i and ii)

Equivalence partitions (VALID or implicitly invalid):

* Months
  * P1 = (infty, 0]
  * P2 = [1, 12] VALID
  * P3 = [13, 99]
  * P4 = [100, infty)
* days
  * P1 = (infty, 0]
  * P2 = [1, 31] VALID
  * P3 = [32, 99]
  * P4 = [100, infty)

The boundary values are the numbers at each closed end of the intervals (i.e. the numbers next to '[' and ']').

Alternatives:
Viewing the combinations of months and days partitions as a matrix of partitions.
Using the zodiacs ase partitions (this actually helped in the next exercise).

## 2.2 (mostly experience-based and specification-based)

Failure to show informative note:
When clicking the button and no values are specified.

Inconsistent fonts (with state transition testing):
Clicking with no values differ when doing it after just starting the program or after viewing a zodiac description.

Letters or other symbols in entry box:
Doesn't give a proper error message.

Sagittarius Boundary Value Analysis (on zodiacs):
Sagittarius end (12-21) is "unvalid date"

Cancer boundary value analysis (on dates):
Should fail at June 31.

## 2.3

See separate document for IEEE829-style report.

# Exercise 3

## 3.1

(see separate file for decision table)

We combined EV and combustion into 1 condition.
Either it is electric (T) or it is not (F, combustion).
This resulted in a very terse table, but it is correct.

If we had separate conditions for this, we would need to invalidate (X) impossible cases: Such as neither electric nor combustion.
This would also require us to make a decision about hybrid vehicles (incomplete spec, or bad interpretation).

## 3.2

Reduction is impossible with our beautifully brief table, but had it been bigger, we could've joined those collumns which had the same output results.
Those columns are covered by the same rule.
