# base
Base project for clojure, build with gradle.

You can create *.jar file use gradle for run without clojure.jar file:
    1) gradlew uberjar
    2) gradle uberjar

And run *.jar:
    1) java -jar build/libs/base-standalone.jar

You can create *.jar file use gradle for use with clojure.jar file:
    1) gradlew jar
    2) gradle jar

And run *.jar:
    1) java -cp libs/jars/clojure-1.7.0.jar:build/libs/base.jar base.core