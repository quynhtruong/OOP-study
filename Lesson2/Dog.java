package Lesson2;

public class Dog {
    private int size;
    private String breed;
    private String name;

    public void setSize(int s){
        if(s>0){
            size = s;
        }
    }
    public int getSize(){
        return size;
    }
    void bark(){
        if(size>14)
            System.out.println("Ruff! Ruff");
        else
            System.out.println("Yip! Yip!");
    }
    void getBigger(){
        size +=5;
    }
}
