# Java-Assignment-009

## Part 1 - Assignment

NOTE: The use of recursive method calls is not allowed.

### Create a class named, ArrayProcessing
* The class should have the following fields:
    * One array that will hold 5 objects of type int. You pick the name.
    * One Scanner object. You pick the name.
* The class should have a constructor that performs the following:
    * Creates the array and Scanner objects (they are already declared as fields, now they need to be “created”).
    * Calls the method getNumbers.
    * Calls the method processNumbers.

* Create a method named, getNumbers, with a return type of void and no parameters that does the following: 
    * Uses a for loop to prompt and grab five integers from the terminal window using the Scanner object and assign each one to an array element.
        * NOTE: Do not use the constant 5 in the for-loop test, use the length field.

* Create a method named, processNumbers, with a return type of void and no parameters that does the following: 
    * Uses an appropriate loop statement to: 
    * Call the method printMenu.
    * Test the result returned from printMenu and calls one of the processing methods: add, mult, print, reverse.
    * If the result returned from printMenu is invalid, an error message is printed.
    * Uses a call to the method named, again, as the loop condition which allows the whole process above to repeat until the result from the again method is false.

* Create a method named, printMenu, with a return type of int and no parameters that does the following: 
    * Prints the following menu to the terminal window:
    ```
    Choose an option to perform:
    1) Add numbers
    2) Multiply numbers
    3) Print numbers
    4) Print number in reverse
    ```
    * Grabs input from the Scanner object and returns it to the calling statement.

* Create a method named, add, with a return type of void and no parameters that does the following:
    * Uses a for loop and the array length field to sum the numbers in the array and print the final sum, with the appropriate label, only once to the terminal window.
        * NOTE: Do not use the constant 5 in the for-loop test, use the length field.

* Create a method named, mult, with a return type of void and no parameters that does the following:
    * Uses a for loop and the array length field to multiply the numbers in the array together and print the final product, with the appropriate label, only once to the terminal window.
        * NOTE: Do not use the constant 5 in the for-loop test, use the length field.

* Create a method named, print, with a return type of void and no parameters that does the following:
    * Uses a for loop and the array length field to print each number, with the appropriate label, in the array to the terminal window.
        * NOTE: Do not use the constant 5 in the for-loop test, use the length field.

* Create a method named, reverse, with a return type of void and no parameters that does the following:
    * Uses a for loop and the array length field to print each number in the array IN REVERSE ORDER, with the appropriate label, to the terminal window.
        * NOTE: Do not use a constant in the for-loop, use the length field.

* Create a method named, again, with a return type of boolean and no parameters that does the following:
    * Prompts the user to enter the integer 1 to choose another option or 2 to exit.
    * Grabs an int from the terminal using the Scanner object.
    * Tests the number entered and returns true if the int is a 1 and false if it is something else.

## Part 2 - Submission

* Make sure to use the Git tab at the bottom of IntelliJ to create a Spring2023 feature branch
* Commit and Push your running code back to your GitHub account
* Issue a Pull request back to my Java-Assignment-009 repo
* Cut and Paste the Pull request URL into your Canvas assignment to turn it in.
