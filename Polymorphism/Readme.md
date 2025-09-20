# 🔹 Polymorphism in Java

👉 Meaning:
Polymorphism = “Many forms”
It allows one thing (method, object, operator) to behave in different ways depending on the context.

# ✨ Types of Polymorphism in Java
# 1. Compile-time Polymorphism (Static Binding / Method Overloading)

Same method name, different parameters (number or type).
Decided at compile time.

# 2. Runtime Polymorphism (Dynamic Binding / Method Overriding)

Parent and child have same method name + parameters.
Decided at runtime, based on the object being referenced.

# 🔑 Key Points

Method Overloading = Compile-time polymorphism.
Method Overriding = Runtime polymorphism.
Achieved via inheritance and method overriding.
Helps in code flexibility and reusability.

# ✍️ Practice Question (For You)

Create a program for a Bank System:
Base class Bank with a method getRateOfInterest().
Child classes SBI, HDFC, and ICICI override getRateOfInterest().
In the main method, create objects of each bank and call the method.