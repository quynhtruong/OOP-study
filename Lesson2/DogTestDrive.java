package Lesson2;

public class DogTestDrive {
    public static void main (String[] args){
        Dog one = new Dog();
        one.setSize(7);
        Dog two = new Dog();
        two.setSize(13);

        two.bark();
        two.getBigger();
        two.bark();

        one.bark();
    }
}
