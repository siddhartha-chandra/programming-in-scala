# programming-in-scala

** About: **

The idea of this project is to get a compilation of solutions to problems from various sources at one place. The solutions in this repository are written in Scala. The motivation behind this is to allow viewers and contributors to be able to learn and solve problems in a functional way. Scala is my language of choice because of its elegance and ability to drive a person to compose a problem in well defined types and structures. This not only enables readability of the solution, but also allows for solving a problem more quickly and in an error-free manner.

** Contents: **

For now, I am focussing on problems from these sources:

1. Cracking the Coding Interview - 5th edition (Gayle Laakmann McDowell)
2. 99 Problems in Scala
   http://aperiodic.net/phil/scala/s-99/
3. Elements of Programming Interviews (Adnan Aziz | Tsung-Hsien-Lee | Amit Prakash)
4. Hackerrank:
   https://www.hackerrank.com/domains/fp/intro
5. Coursera/Functional Programming Principles in Scala    
   https://www.coursera.org/learn/progfun1
6. Coursera/Functional Programming Principles in Scala
   https://www.coursera.org/learn/progfun2

** How to contribute **

For this project to make good progress and be beneficial to the community on the whole,
this would need active contribution from fellow Scala-coders. In order to contribute, follow these steps:

Lets say you want to work on 'problem X' from 'Arrays and Strings' section of Cracking the coding interview.

-> The first step to do is fork the repository.

-> Next, checkout the feature-branch of the given sub-project.
   i.e feat/ctci_arraysAndStrings in this case.

-> Next, if the problem has not already been solved, write the solution and raise a
   Pull Request. I will review as soon as I can and have it merged to the right feature branch, which will in turn be merged to Develop and Master, after a while.

-> In case the problem has already been solved in the feature branch, you can still
   submit a solution and raise a PR as long as it:
   1) Adds clarity to solution
   2) Reduces complexity in either Time or Space
   3) Uses functional programming concepts to implement the solution
     (only in case one doesn't already exist)

-> For project config and structure related fixes and additions,
   please raise a PR to the 'Develop' branch

-> In case of any issues(eg. a given subproject branch does not exist that you want to
   contribute to), please raise a git issue

-> Currently not accepting Test contributions (even though they are a crucial element).
   That should change in the future though, once I refactor the code-base.
   I'll update the README then

Important:
Currently, I am accepting contributions ONLY as scalaWorkseet files (*.sc), as
I get some issues while trying to maintain a scala project structure.
If someone more experienced can help me with setting up multiple-projects in this repository, it would be much appreciated. This can also help transition to submitting complete solutions instead of scalaWorkseets. If you can help with this, then raise a PR in the develop branch.

Hoping to make this a one-stop shop for all Scala enthusiasts, looking at increasing their skills.
