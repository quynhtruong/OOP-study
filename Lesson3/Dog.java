package Lesson3;

public class Dog {

    void bark(String a){
        System.out.println("Ruff! Ruff!");
    }
    void bark(int numOfBark){
        while (numOfBark > 0){
            System.out.println("ruff");
            numOfBark--;
        }
    }
}
