# Singleton Design Pattern Project 👩🏻‍💻🎯

## Project Overview 📌
This project demonstrates the Singleton Design Pattern in Java. The Singleton Design Pattern ensures that a class has only one instance and provides a global point of access to it.

## File Descriptions 📑

### SystemClock.java 📁

This class implements the Singleton Design Pattern for a system clock. It ensures that only one instance of SystemClock exists and provides a method to get the current system time in milliseconds.

### Methods: ⚙️
* getInstance(): Returns the single instance of SystemClock. If the instance does not exist, it creates one.
* currentTimeMillis(): Returns the current system time in milliseconds.
 <br><br>

## SingltonDesginPattern.java  📁

This is the main class that demonstrates the usage of the SystemClock singleton. It verifies that only one instance of SystemClock is created and used throughout the application.

### Methods: ⚙️
main(String[] args): The entry point of the application. It creates two references to SystemClock using getInstance() and prints the current system time. It also checks if both references point to the same instance.
