# Essay

## Fundamental test process

Fundamental test process are test planning and control, test analysis and design, test implementation and execution, evaluating and exit criteria and reporting. And finally, test closure. You go through these phases sequentially and iteratively, so it fits the agile mantra of Iterative, incremental and evolutionary development.  As you break up the product development and test each block according to the fundamental test process. 
As you develop and test in blocks it makes it easier to choose what to test. According to the 7 test principles exhaustive testing is not possible, therefore you must be aware and don’t get stuck testing everything. It’s a lot harder to over-test in small blocks. Some drawbacks may be some unforeseen bugs after stitching each block together, it may come from communication failure.

## Testing principles

But as the principle defect cluster tells us is that 80% of defects are found in 20% of the modules. It may make it easier to identify them in agile development. And in each sprint, you may need to design new method of testing. The principle pesticide paradox tells us that test cases need to be regularly reviewed & revised, adding new & different test cases to help find more defects. It fits to agile development sprints and iterative nature, while you code you can also think, design and implement new testing for that specific module.
But as testing shows the presence of defects not absence of defects. So, after you design and test modules in sprints, defects may appear late in the development when you do a system test. Or it may show that you have a bug free program (no such thing) but you haven’t met the customer´s needs or requirements. That is a problem every development method must account for. According to the 7 testing principles, early testing may be a good tool to solve that problem. It pairs really well with agile development. As you are in constant communication across development team, business team, management and the costumer. The agile development principle to welcome change in requirements will is also a good way to deal early testing. By communicating with the customer and delivering working software frequently makes it easier to test the software in the context it will be used. As testing is context dependent.

## V-model

V-model is another development method. It is popular among test managers as it very beneficiary for them. But it is rigid not flexible and agile is the opposite. It may cause some tension as their methodologies dos not complement each other.

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
Resources/constraints is another factor, which can be arbitrarily subdivided into e.g. time, budget, documentation, knowledge, etc.
Other factors may also apply.

## Test management

The concerns of test management are many, and can be divided among several topics.
The book divides them in 6 sections, but they can also be viewed in relation to the "fundamental testing processes" (particularly plan/control, eval/report, closure/finalizing).

The team and organization "must" be managed.
While testing could be performed by the development team that writes the code, even though they could potentially have a benefit in that they know the system well, having a different team (or 3rd party specialist) could be beneficial in terms of independence.
A person "looking in" can get a whole different perspective and discover a different set of bugs.
In any case, the test leader is responsible for planning, monitoring and controlling; ensuring any requirements for the fundamental processes.

Planning is concerned with delegating responsibilities.
This, of course, relates to the organizatoinal aspect (heeding independence etc).
Controlling and adjusting the set course is part of planning.
To obtain feedback about the process and steer accordingly.
Initially, estimates are made, and subsequently one evaluates both entry- and exit criteria.

Assesing progress, through metrics, checked progress against schedule and budget.
And important point is _visibility_, which can be achieved through monitoring, and such collected information can measure exit criteria.
Summarizing that information is done through reporting, which could serve as useful in future decisions or to inform stakeholders, etc.
Assesment of progress also serves in evaluating risks and controlling the test plan.

Additional responsibilities of test management are so called "configuration management" comprising of keeping track of testing through version control, (identifiable) reports and documentation, and resulting data.
As mentioned, risk assesment is also among the concerns of test management.

## Team coordination

Important parts of coordinating teams are good communication, clear objectives, defined roles i.a..
In orchestrating this, one may also keep in mind the independence level of testing: Author, same team, separate team, 3rd party.
The roles of a team can for example be divided into test leader and tester.
It is also important to consider that planning is a form of communication with project team, testers, peers, managers, other stakeholders.
Teams can also play a part in organizational issues, among: Lacking people, skills, training, communication, complexity of team or organization.
Communication should be kept constructive and fact-focused.
Management also plays a role in making sure that the requirements are well defined and that responsibilities are well understood.

## Exploratory testing

Exploratory Testing is defined as simultaneous learning, test design and test execution.
If you continuously and frequently develop software part of a bigger system.  Then exploratory testing may help you with the rapid development. It also will help you with automated testing. It focuses on new features while automated testing accounts for regression issues. The testing style of exploratory testing are unstructured, and it can focus on high risk areas and find possible issues with the product.

## Test-Driven development

Test-driven development is a software development process you have short development cyle where requirements are specific test cases. It can cause extra work as in agile development may change requirements late in the development phase. But It may help the costumer  communicate his or hers wishes more clearly.
