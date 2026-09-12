# cse2102-lab

I built my system by creating 3 separate class interfaces. I then created another class CarRunner that combined all the interfaces to yield a half gas half electric vehicle; full gas vehicle, and a fully electric vehicle. To test, we used Junit 4. I created the tests and then compiled the classes & interfaces by using the following command: "javac -cp junit-4.13.2.jar c/GasolineInterface.java c/ElectricInterface.java c/HybridVehicle.java c/CarRunner.java u/HybridVehicleTest.java". I then ran the tests by using this command: "java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./" org.junit.runner.JUnitCore u.HybridVehicleTest" It results in a few lines that read:
JUnit version 4.13.2
.....
Time: X.XX (editors note: it was 0.009 for me)

OK (5 tests)
