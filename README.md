# Requirements

 * Java Development Kit 21
 * No libraries or built-in functions are required to execute the program

# Compilation

 The program can be compiled with the included Gradle wrapper by running:

 ```
 ./gradlew build
 ```

# Execution

 After compiling, the program can be executed with the Gradle run task and corresponding args:

 ```
 ./gradlew run --args="<base_value> <number_1> <number_2> <number_n>"
 ```

# Sample Execution & Output

 Sample Compilation:
 ```
 ./gradlew build
 ```

 Sample Execution:
 ```
 ./gradlew run --args="60 0.5 0.25 0.75 0.8 0.16666"
 ```

 Sample Output:
 ```
 | Base 10  | Base 60 |
 | :--------|:--------|
 | 0.5      | 0.30    |
 | 0.25     | 0.15    |
 | 0.75     | 0.45    |
 | 0.8      | 0.48    |
 | 0.16666  | 0.9;59;58;33;36;0;0;0 |
 ```