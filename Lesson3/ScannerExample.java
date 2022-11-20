package Lesson3;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ScannerExample {
    public static void main (String[] args){
        try{
            Scanner sc = new Scanner (new FileInputStream("test.dat"));
            String s = sc.next();
            int i = sc.nextInt();

            while (sc.hasNextLong()){
                long aLong = sc.nextLong();
            }
            sc.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
