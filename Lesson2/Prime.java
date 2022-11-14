package Lesson2;

/**
 * Viết 1 class tên là Prime, có 1 method để kiểm tra 1 số có phải là số nguyên tố hay không.
 * Viết 1 method khác, dùng method bên trên để liệt kê ra 100 số ngyên tố đầu tiên.
 */
public class Prime {

    public boolean checkPrime(int x){
        for(int i=2; i<x; i++)
        {
            if(x % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public void writePrime(){
        int count = 1;
        for(int i = 2; i<10000; i++){

            if(checkPrime(i)== true){


                if(count > 100){
                    break;
                }
                else {
                    count += 1;
                }
                System.out.println(i +"; ");
            }
        }


    }
}
