# Requirements

 * Java Development Kit 21
 * No libraries or built-in functions are required to execute the program

# Compilation

 The program can be compiled with the included Gradle wrapper by running:

 ```
 ./gradlew build
 ```

# Execution

 After compiling, the program can be executed with the Gradle run task and provided --args:

 ```
 ./gradlew run --args="<number_1> <number_2> <number_n>"
 ```

# Sample Execution & Output

 Compilation:
 ```
 ./gradlew build
 ```

 Execution:
 ```
 ./gradlew run --args="0.5 0.25 0.75"
 ```

 Sample Output:
 ```
 | Base 10 | Base 2 |
 | :-------|:-------|
 | 0.5     | 0.1    |
 | 0.25    | 0.01   |
 | 0.75    | 0.11   |
 ```