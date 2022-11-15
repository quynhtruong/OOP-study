# Notes for lesson 2

##1. Các thuật ngữ cho class và object trong java:
###- Tạo object = instantiate an object = create an object.

###- Khi object được tạo từ 1 class, object đó gọi là "instance of class".

###- Thuộc tính = instance variables

###- Hàm = method

###- Tên biến của object = object reference (vd: Dog d = new Dog(); biến ```d``` gọi là object reference).

##2. Class and object

###- Class have instance variables (thuộc tính) and methods (hàm).

###- Use nouns (eg: name, title, age...) for instance variables and verbs (eg: bark(), checkPrime()...) for methods.

###- Methods can change value of instance variables. (eg: setName(String name) will change the ```name``` instance variable's value).

###- Instance variables: thuộc tính của class.

###- Local variables: variables of method, they will be removed after method finishes.

##3. Encapsulation:

###- Big rule: mark instance variables private and create public setter/getter methods.

##4. Access modifiers: private, public, protected, default.

###- private: only methods in the same class can access the private instance variables.

###- public: any method can access the public instance variables.

###- default (no specified): Only methods in the same package (directory) can access the instance variables.

###- protected: Methods in the same package (directory) and subclass can access the instance variables.



