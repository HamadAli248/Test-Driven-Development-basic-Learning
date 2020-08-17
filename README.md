

What needs to be done?

 


The customer wants a calculator service that performs
the following operations on whole numbers:

 

add ( value1, value2 ) and returns the sum
subtract ( value1, value2 ) and returns the subtraction

 


We were asked to implement using Test Driven Development.

 


What are the tasks (what and how)

 


-> Create a new Java Gradle Project in IntelliJ: DONE

 

-> Create one test case for the add operation    DONE
Question: the production code does not exist, how are we going to
test something that does not exist?

 

This the purpose of TDD: first you create the test case

 

3 steps of TDD

 

RED   the test case will fail because the code does not exist
GREEN write the minimum code to make the test case PASS
REFACTOR to remove duplication

 

-> Create one more test case for add operation


## Running

### ./gradlew build || ./gradlew run

Runs the app in the console.<br>
You will also see any lint errors in the console.


### ./gradlew test

Runs the tests in the console.<br>
