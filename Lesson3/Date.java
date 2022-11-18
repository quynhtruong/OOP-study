package Lesson3;

public class Date {
    int year;
    int month;
    int day;
    public Date(int y, int m, int d){
        year = y;
        month = m;
        day = d;
    }
    public void copyTo(Date d){
        d.year = year;
        d.month = month;
        d.day = day;
    }
    public Date copy(){
        return new Date(year, month, day);
    }
}
