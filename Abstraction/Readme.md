# 🔹 Abstraction in Java
<br>
# 👉 Meaning:
Abstraction = Hiding implementation details and showing only the essential features to the user. <br>
It focuses on “what an object does” instead of “how it does it.”

# ✨ Ways to Achieve Abstraction

Abstract Classes (0–100% abstraction)<br>
Declared with abstract keyword.<br>
Can have both abstract methods (no body) and concrete methods (with body).<br>
Cannot be instantiated.

# Interfaces (100% abstraction)

Declared with interface keyword.<br>
Only method signatures (till Java 7).<br>
From Java 8 onward → can have default and static methods too.<br>
A class implements an interface using implements keyword.   

# 🔑 Key Points

Abstract class → when you want partial abstraction (common code + abstract methods).<br>
Interface → when you want full abstraction and multiple inheritance (since a class can implement multiple interfaces).<br>
Cannot create objects of abstract classes or interfaces.

# ✍️ Practice Question (For You)

Design an abstract class Shape with an abstract method calculateArea().<br>
Subclasses: Circle, Rectangle, Triangle.<br>
Implement calculateArea() differently in each subclass.<br>
In the main method, create objects of these shapes and print their areas.