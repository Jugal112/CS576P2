# CS576P2
Stable Priority Queue including JUnit Tests, Emma Coverage Report, and Find Bugs Coverage Report

The source code is located in 

   /stablepq/src/main

The JUnit tests are located in

   /stablepq/src/test

To run the JUnit tests, run the following command

   "cd stablepq"
   
   "mvn test"

To run the program, run

   "cd stablepq"
   
   "java -cp target/stablepq-0.0.1-SNAPSHOT.jar com.stablepriorityqueue.Main"

To view the FindBugs report go to

   /stablepq/target/site
   
   double click on "findbugs.html"

To view the Emma Coverage report go to

   /stablepq/target/site/emma
   
   double click on "index.html"
   
   ***Warning: emma coverage report generation is incompatible with maven now so I had to manually generate it with the Eclipse plugin.  Do not run "mvn clean"
   
   ***Important: the emma coverage report only shows coverage for either the main application or the tests, but never both. The coverage report shows close to 50% coverage because the tests were not run when generating the report. If the tests were run, the main application would not be run. Please view the coverage of the "main" directory and you will see close to 100% coverage.
   
#Improvements made from the findBugs report were

##SBSC: Method concatenates strings using + in a loop (SBSC_USE_STRINGBUFFER_CONCATENATION)

   I replaced the string concatenation in PriorityQueue.toString() with a buffer that I appended strings to. Then I called buffer.toString() to get the final string.

##RV: Negating the result of compareTo()/compare() (RV_NEGATING_RESULT_OF_COMPARETO)

   I had a negative sign in front of my compareTo() statement for comparing elements in the queu based on time.  The negative sign was there because the larger the time value is for an element, the later it was created which is not what we want in the priority queue. We wants the earlier time to be "greater than" the later time so we must negate it.  To fix this bug, I simply swapped the arguments in the compareTo() function which effectively negates it.