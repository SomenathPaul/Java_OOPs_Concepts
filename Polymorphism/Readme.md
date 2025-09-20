# 🔹 Polymorphism in Java

👉 Meaning:
Polymorphism = “Many forms”<br>
It allows one thing (method, object, operator) to behave in different ways depending on the context.

# ✨ Types of Polymorphism in Java<br>
# 1. Compile-time Polymorphism (Static Binding / Method Overloading)

Same method name, different parameters (number or type). <br>
Decided at compile time.

# 2. Runtime Polymorphism (Dynamic Binding / Method Overriding)

Parent and child have same method name + parameters. <br>
Decided at runtime, based on the object being referenced.

# 🔑 Key Points

Method Overloading = Compile-time polymorphism. <br>
Method Overriding = Runtime polymorphism.<br>
Achieved via inheritance and method overriding.<br>
Helps in code flexibility and reusability.

# ✍️ Practice Question (For You)

Create a program for a Bank System:<br>
Base class Bank with a method getRateOfInterest().<br>
Child classes SBI, HDFC, and ICICI override getRateOfInterest().<br>
In the main method, create objects of each bank and call the method.