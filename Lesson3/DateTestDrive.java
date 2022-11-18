package Lesson3;

public class DateTestDrive {
    public static void main(String[] args){
        int thisYear = 2010;
        Date d1 = new Date(thisYear, 9,26);
        Date d2 = new Date(2000, 1, 1);
        d1.copyTo(d2);
        Date d3 = d2.copy();
    }
}
