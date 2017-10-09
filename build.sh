#!/bin/bash

mkdir -p junit/4.12

curl http://central.maven.org/maven2/junit/junit/4.12/junit-4.12.jar > ./junit/4.12/junit-4.12.jar

mkdir -p org/hamcrest/hamcrest-core/1.3/

curl http://central.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar > ./org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

mkdir -p target/classes
javac MyStack.java
mv MyStack.class ./target/classes
javac MyStackDemo.java
mv MyStackDemo.class ./target/classes

mkdir -p target/test-classes/
javac -classpath cs498/mp1/target/test-classes/:./junit/4.12/junit-4.12.jar:./org/hamscrest/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:. ./MyStackTest.java
mv MyStackTest.class ./target/test-classes/

java -cp target/classes MyStackDemo

java -cp ./target/test-classes:junit/4.12/junit-4.12.jar:org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore MyStackTest
