import java.io.*;
import java.util.*;

class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer Ar = new StringBuffer(A);
        if(Ar.toString().equals( Ar.reverse().toString() ) ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



