package Lesson4;

public class Pot{
    private int size;
    public static Pot singlePot;

    private Pot(){

    }

    public static Pot create(){
        if(singlePot ==null){
            singlePot = new Pot();
        }
        return singlePot;
    }
}
