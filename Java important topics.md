### Java important topics:



##### OOPS



✅ irst Code (Correct):



public class Main {

&nbsp; int x = 5;



&nbsp; public static void main(String\[] args) {

&nbsp;   Main myObj = new Main();       // Creating object inside main method

&nbsp;   System.out.println(myObj.x);   // Accessing instance variable through object

&nbsp; }

}



This works because:



main() is the entry point.



You’re creating the object inside a method (main), where statements can be executed.



❌ Second Code (Incorrect):



public class Main {

&nbsp; int x = 5;



&nbsp; Main myObj = new Main();               // This line is allowed (field initialization)

&nbsp; System.out.println(myObj.x);          // ❌ ERROR HERE

}





❌ Why it Fails:



 **---- In Java, you cannot write executable statements like System.out.println(...) directly in the class body, outside a method or block -----**



This line:



System.out.println(myObj.x); is an executable statement, and must be placed:



Inside a method (main, constructor, or any other method), or



Inside an initializer block ({}), or



Inside a static initializer (static {})



