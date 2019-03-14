Assignment 1 in IN3240/IN4240

Part 1
======

See the accompanying source and report files.

Part 2
======

* https://docs.sonarqube.org/display/SONAR/User+Guide
* https://sonarcloud.io/about/sq

### Task 0

* Tried to do option 3, but the process was like hell on earth
  * The invasive system of sonarcloud wants way to many permissions
  * One has to download proprietary buildwrapper and scanner
  * Running the buildwrapper fails with `LD_PRELOAD cannot be preloaded`
  * Hardly worth the suffering
* https://github.com/byllgrim/svi
* https://sonarcloud.io/dashboard?id=byllgrim_svi

```
INFO: Analysis total time: 8.708 s
INFO: ----------------------------------------------------------------------
INFO: EXECUTION SUCCESS
INFO: ----------------------------------------------------------------------
INFO: Total time: 10.305s
INFO: Final Memory: 30M/369M
INFO: ----------------------------------------------------------------------
```

### Task 1

1.  The metrics of a quality gate are checkpoints, that your program needs to pass before the release.
2.
    1. Bugs are logic failures or syntax failures resulting in that your program will not be able to execute.
    2. Vulnerabilities are security weaknesses that can be used by bad actors.
    3. Code Smells are indications that there is a deeper problem in the system
    4. Blocker are issues that you absolutly need to fix, before continuing.
    5. Coverage is the extent to which you have exercised the code.
3.
    1. 0 
    2. 0
    3. 22

### Task 2

1.
    * Smell 1: "Reduce the number of nested break and goto statements from 2 to 1 authorized." 
      It complains because loops should not have more than one break.
    * Smell 2: "Complete the task associated to this "TODO" comment."
      It complains because it tracks TODO tags to remind devs.
    * Code smell 3."Add a "default" case to this switch statement."
      Default in a switch case is required to protect the system form future additions to enum.
    * Code smell 4. "Define each identifier in a dedicated statement."
      The declarations may be confusing regarding type.
2.
    * Smell 1: Rewrite the logic of the offending loop construct
    * Smell 2: You just need to complete the task in the TODO comment.
    * Smell 3: Adding a default case will solve the issue.
    * Smell 4: Declare the type on each line, separately.

### Task 3

1.
    1. A False-positive is an issue pointed out by the analytics tool, but the developer means it is not an issue.
    2.  False-negative is the inverse of 3.1.1.

2.  A example of a false-positve is the code smell 4: "Define each identifier in a dedicated statement".
    A example of a false-negative is old comments referring to old code.


Part 3
======

Easy task
* Session id: `eDxgXL`
* https://cyber-dojo.org/kata/edit/eDxgXL

Hard task
* Session id: `bftdZb`
* https://cyber-dojo.org/kata/edit/bftdZb
* Forked for implementing diagonals: https://cyber-dojo.org/kata/edit/HqDNUA

It became clear after a while that the granularity of our tests should've been smaller.
We should have done just a miniscule piece of functionality at a time.
What we initially did was one major test succeeded by an iternity in refactoring phase.

We tried to follow this cycle:
![tdd_cycle](./tdd.png)

Part 4 Static testing - Reviews 
======


What is the purpose and benefits of reviews?

The purpose is to find defects and bugs in the program you are developing. As the project progresses, so do the price of fixing a defect. So, the benefit is clearly saving both time and money.


What are the fundamental steps for executing a formal review, e.g. an inspection?

Number one is planning, the moderator assigns to the people who are participating their roles. Then comes the kick off, a moderator will give all the participants that is up to review.
Individual preparation is the next stage. Here the participants will review the document. And note down any defects they find.
At the review meeting, which is the following stage is where the participants give the findings, and the author takes notes.
At the rework is where the author fixes the defects reported in the review meeting.
Then the last stage is the follow-up, where the moderator checks if the defects has been fixed.


 What different kinds of reviews do we have?

We have Informal review, where it’s “informal”. Nothing is documented and can be two people discussing. Walkthrough is where a designer or a developer leads a team to go through the product and make comments on various defects or errors. A technical review is where a team of qualified personnel examine the appropriateness of the software product. And identify discrepancies.  The inspection is where qualified people review the product for bugs and defects, it will help the author to improve the software.



Which roles participate in the different kinds of reviews and what are the responsibilities of the different roles?

In informal review, we do not define roles. As the group can be small as 2 people.
Walkthrough author who is responsible to request the walkthrough. The presenter is responsible for the agenda. Moderator is to make the Walkthrough happen. Then we have the reviewers, their job is to evaluate the product. Last but not least, we have the scribe, he or she will take notes, record errors, take down comments or unresolved questions during the walkthrough. 
A technical review consists of a moderator, whose job is to conduct the review, collect the data, and plays a key part in every stage (not the rework stage).  Inspector is a role, where the person job is to find defects. From a general point of view and for the perspective of a expert.  The author provides information of the work product, responsible for fixing major defects, and minor defects. Then we have a reader, who guides the team through the product. Can also preform the duties of an inspector.
The recorder records the defects found, he or she can also perform the duties of an inspector.

 Are reviews an efficient means of quality assurance? Justify your answer.

Yes, because if you choose to release product without doing any form of reviews. The chances of a defect in the product is high. And the price of fixing a product after-release is exponential higher than finding and fixing it during development. You also have no idea if the product actually solves the problem you design it for. In the worst-case scenario, you may have to scrap the software and start over.

What are the factors for a successful performance of reviews?

Be prepared for the meeting, reflect on the different roles of the participants, overall goals for the meeting. During the meeting you should aim for a conversation between equals. Hit the most important topics, be constructive. Give helpful feedback, illustrate clearly and avoid personal attacks.
After the meeting, write down the targets you have agreed upon.   

Which testing principle is followed when using reviews in the early stages of the development process?

You need to know what you are testing. Why are you testing it, what to test, and how to test it.

How are static analysis and reviews related?

Both can be used to find defects and errors without actually running the code. Static analysis uses tools to find formal faults such as syntax errors or if the code is not the set standard for formatting. Unlike reviews, these tools makes static analysis unlimited because of automation.   


