## Test levels and test types

### Test levels

Test levels are a grouping of different test activities corresponding to the different levels of development.
Hence, test levels correspond to to different objectives and fit in at different places in the development cycle, and match different test types.
Test levels are important to define because several diciplines are involved in development.

A common simplified version of the V-model corresponds to the following test levels:
* Unit testing (Component testing)
  * Tests: Modules, programs, objects, classes, etc
* Integration testing
  * Tests interfaces (components, OS, hardware, filesystem, etc)
* System testing
  * Tests the whole system
* Acceptance testing
  * Validation against user needs

Other development processes have different test levels than this.
One could be using a different variation of the V-model, or maybe some iterative development process, or something else.
Whatever process one uses, developing tests should be done at the corresponding level in the dev process.
At each level, one should figure out the objectives, test basis, test objects,  typical defects/failures, approaches and responsibilities.

More details can be expanded for each of these levels.
As an example, acceptance testing may comprise of: Operational acceptance test, compliance acceptance test, alpha testing, beta testing.

### Test types

Test types are a categorization of different generic ways that testing can be done.
There are primarily four broader categories of test types:
* Functional
* Non-functional
* Structural
* Changes

Functional testing is about the actions or behavior that a system can perform.
Or stated differently "what the system does".
For a given input, the system is expected to react so and so.
And that is the reason why it's called "black box testing"; only inputs and outputs matter, and not implementation details.
I could also be noted that this _type_ of testing fits any _level_ of testing, but what drives it (test basis) are requirements (in the form of a spec doc, use cases, or something else).

Non-functional testing (a bit of a misnomer in my opinion), also called "product characteristics testing" is about how well the system performs.
This could be measured in e.g. efficiency, portability, reliability, usability, etc.
Non-functional testing could be called "how-testing", while functional testing could be called "what-testing".
This type of testing may also be used at any level of testing.

Structural testing utilizes the internal structure of the system (that is why it's called white box testing).
Such internals could include branches, blocks of code, functions/methods, classes, or other "coverage items".
When counting the "exercised" coverage items of choice, one can compare to the total amount of coverage items available, and hence get a percentage of "how thorough one has tested".
This type of testing _can_ be applied at any testing level, but is very suited at unit testing (aka component testing) or integration testing.

Change-related testing is applied after modifying the system.
Two common examples are 1) after fixing a bug, one does _confirmation testing_ to ensure that the fix was successful, and 2) regression testing to ensure that modifications to the system did not fuck up some other (seemingly unrelated) part of the system.
Just like all the other types of testing, this can be applied at any level of testing.

## Testing techniques

Testing techniques are prescriptions for how to perform a certain type of test.
This term can maybe best be described by drawing a taxonomy:
At the top of the taxonomy, we can differentiate between _static_ and _dynamic_ testing.

Static testing **does not run/execute the system**.
It could be done by manual review: either formal, informal, technical, walkthrough, inspection.
Or it could be automated, by code analysers: such a linting, data flow analysis, control flow analysis.

Dynamic testing doe run the system.
But here it is easier to subdivide the taxonomy even further:
Structure-based (as in the types of testing) does e.g. statement coverage, decision coverage, condition coverage.
Experience-based, can be done by error guessing, or exploratory testing.
Specification-based testing may utilize equivalence partitioning, boundary value analysis, use case testing, state transition testing, decision tables.

Choosing which one (or more) of the test techniques to use depends (of course) on the situation.
Risk is always a factor, determining how thorough and how wide one must test.
Resources is another factor, which can be arbitrarily subdivided into e.g. time, budget, documentation, knowledge, etc.
Other factors may also apply.

## Test management

## Team coordination
