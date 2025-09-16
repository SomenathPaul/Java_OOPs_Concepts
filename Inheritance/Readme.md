# 🏗️ Inheritance in Java
🔹 Definition <br>

Inheritance is the process by which one class (child/subclass) acquires the properties and behaviors (fields + methods) of another class (parent/superclass).
It promotes code reusability and establishes a parent-child relationship. <br>

class Parent { <br>
   // parent fields + methods <br>
}

class Child extends Parent { <br>
   // child fields + methods <br>
}

# 👉 extends keyword is used to inherit.

<br>

🔹 Types of Inheritance in Java

(Java supports everything except multiple inheritance with classes) <br>
Single Inheritance → One parent, one child. <br>
Multilevel Inheritance → Parent → Child → Grandchild. <br>
Hierarchical Inheritance → One parent, multiple children. <br>
# ❌ Multiple Inheritance with classes is not allowed (but possible with interfaces).

<br>

# 🔑 Things to Remember 

super keyword → Used to call parent class constructor/method. <br>
Private fields are not inherited (but can be accessed with getters/setters). <br>
Constructors are not inherited, but the child can call parent’s constructor using super(). 