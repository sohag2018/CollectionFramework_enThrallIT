package exceptionHandling;

/*
 * Topic: Exception Handling
# Exception And Error: (common question in interview)
Errors occurred due to the environment in which the application is running. For example, due to a lack of system resources, OutOfMemory” and “StackOverflow etc.
Exceptions are caused by the code of the application itself.
	
•	When we execute our Java code, different errors can be occurred: coding errors (exception) made by the programmer, due to wrong input etc.

•	When an error occurs, Java will normally stop and generate an error message. 
The technical term for this is: Java will throw an exception (throw an error).
•	We can handle exception but we can’t handle error
•	The error message (here we mean exception) which will be thrown is from any of Exception Classes.


 

Note: in the above image you can see some exceptions (for example, Arithmatic Exception) extend “RuntimeException” (on the right-hand side) which are called unchecked/runtime exception means these exceptions can’t be caught in the time code compilation. Can be caught at runtime. 

And rest all exception classes extend Exception class-these exception can be caught when we compile our code. These types of exceptions called checked/compile time exception.



# How to handle Exception
	With try—catch block, and also with throw, throws, finally keywords in our code.

What try and catch perform here:
===============================
The "try" statement allows you to define a block of code to be tested for errors while it is being executed.
The 'catch' statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs:

Syntax
------
try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}


what Finally does:
=================
The finally statement lets you execute code, after try...catch, regardless of the result


The throw keyword:
==================
-The throw statement allows you to create a custom error
(throw keyword is used to explicitly throw an exception within a method or block of code)
-The throw statement is used together with an exception type. There are many exception types available in Java:
ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

Example of using throw keyword
------------------------------
public class xxxx {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}


The throws keyword:
==================
-The throws keyword is used to declare which exceptions can be thrown from a method
-The throws keyword is used in a method signature

-The throws keyword in Java is used to declare exceptions that can occur during the execution of a program. 
-For any method that can throw exceptions, it is mandatory to use the throws keyword to list the exceptions that can be thrown. 
-The throws keyword provides information about the exceptions to the programmer as well as to the caller of the method that throws the exceptions.
-When a method declares that it throws an exception, it is not required to handle the exception. 
The caller of a method that throws exceptions is required to handle the exceptions (or throw them to its caller and so on) 
so that the flow of the program can be maintained.

-Only checked exceptions are required to be thrown using the throws keyword. 
Unchecked exceptions don’t need to be thrown or handled explicitly in code.

-It gives an information to the programmer that there may occur an exception. So, it is better for the programmer
 to provide the exception handling code so that the normal flow of the program can be maintained.

-Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException, it is programmers' fault that he is not checking the code before it being used.
type method (arguments) throws Exception1, Exception2, … {  }

Example of using throws keyword
------------------------------- 
public static void writeToFile() throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
    bw.write("Test");
    bw.close();
}

public static void main(String[] args) {
try {
        writeToFile();
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
}



# Java Exception Propagation(calling chain):****
An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method. 
If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack. 
This is called exception propagation.

Example of Propagation:
----------------------
class PropagationIdea{  
  void divide(){  //---- >method which will create exception
    int data=50/0;  
  }  
  void firstCallingMethod(){  //  ----->method which is calling problematic method but not handling
    Divide();  
  }  
  void secondHandlingMethod(){  //  ----->method which is calling problematic method with handling
   try{  
    firstCallingMethod();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   PropagationIdea obj=new PropagationIdea();  
   obj.secondHandlingMethod();   
   System.out.println("normal flow...");  
  }  
} 

 In the above example exception occurs in the divide() method where it is not handled, so it is propagated to the previous firstCallingMethod() method 
 where it is not handled, again it is propagated to the secondCallingMethod() method where exception is handled.
 
 
 call stack will be look like:
 ============================
----------------------
 Divide()               -->exception occurred
 ---------------------
 firstCallingMethod()
 ---------------------
 secondHandlingMethod() -->exception handled
 ---------------------
 main()
 ---------------------
|call stack|


Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).

# Checked Exception:
* -are the exceptions that are checked at compile time
* -the exception that must be either caught or declared in the method in which thrown.
* -inherits from java.lang.Exception not java.lang.RuntimeException 
 * Technically, we can say All exception class extends Exception class are checked exception. 
 * handle:-If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.
 * 1. By catching the exception and handling it. OR 
2. by declaring that the exception can be thrown using the "throws" keyword.
 
 * Note: All the Application or business logic exception should be checked exception.

Unchecked Exception:
*are those Exceptions whose handling is NOT verified during Compile time
 **are those Exception Class are subclass of RuntimeException Class --> extends RuntimeException Class
 *The program won't give a compilation error-so can't check in compile time but they are checked at runtime.
 **we don't have to declare unchecked exceptions in a method with the throws keyword
 *these exceptions happen due to bad programming
 for example, c
 (1)Logically we can't divide 10 by 0---> it will occur unchecked exception (ArithmaticException)
 (2) we can't expect index value which doesn't exist--->ArrayIndexOutOfBoundsException
 (3) obj reference which has null value but using that--> NullPointerException

FAQ:
1.	What is difference between Error and Exception?
2.	What is difference between throw and throws keyword in Exception handling?
3.	What common exception do you get frequently?
4.	What are the differences between checked and unchecked exception?

 * */


public class ExH1_ExceptionHandle_Info {

}
