package Lesson3;

public class MyInteger {
    private int value;
    public boolean greaterThan (MyInteger other){
        return (this.value > other.value);
    }
    public boolean lessThan (MyInteger other){
        return (other.greaterThan(this));
    }
    public MyInteger increment(){
        value++;
        return this;
    }
}
