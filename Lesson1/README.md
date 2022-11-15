# Notes cho lesson 1

## 1. Notes about Java
###- Class name must be same with Java file (eg: HelloWorld.java --> class HelloWorld).

###- To compile:
```
    javac HelloWorld.java 
```

###- To run:
```
    java HelloWorld 
```
###- class must have main() method to run:
```java
class DogTestDrive {
    public static void main(String[] args) {
        System.out.println("running...");
    }
}
```

## 2. Notes about OOP
###- Class: the blueprint/template (eg: Person)
###- Object: real objects created from class (eg: Person q = new Person();)
###- Abstraction: map things in the real world to classes in programming.
###- Encapsulation (information hiding): hide the internal information of object by ```private``` keyword. Expose needed methods by ```public``` keyword.
###- Inheritance: superclass (lớp cha) and subclass (lớp con). Subclass inherits all instance variables/methods from super class.
###- Polymorphism (many forms): 1 variable can point to an object of type superclass or an object of type subclass.
```java
class DogTestDrive {
    public static void main(String[] args) {
        Animal a = new Animal();
        a = new Dog();
        a = new Cat();
    }
}
```
