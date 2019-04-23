# Exercise 4

## 4.1

See separate file.

## 4.2

How to measure state coverage?
To know what states one has visited, one must know the state diagram beforehand, and then use known inputs to trigger certain transitions and check for success.
Percentage wise, the number of states visited divided by the total number of states: coverage = visited / total * 100.

How to measure transition coverage?
It's the same as state coverage, except substitute "state" with "transition".
There are often more transitions (arrows on the diagram) than states, so this is a stricter requirement.

## 4.3

Sequence of states that gives 100% transition coverage:

1. Check in with booking number
2. Enter INvalid number
3. Enter VALID number
4. Enter some luggage
5. Choose to reserve a seat
6. Choose available seat
7. Take card and tag
8. Check in with credit card
9. Insert fake card
10. Insert proper card
11. Choose NOT to reserve a seat
12. Cancel

With a 100% transition coverage you necessarily have 100% state coverage, but not vice versa.
