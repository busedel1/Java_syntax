import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.printf("%d%n", A.length()+B.length());

        String capitalA,capitalB;
        
        capitalB=B.substring(0, 1).toUpperCase()+B.substring(1,B.length());
        capitalA=A.substring(0, 1).toUpperCase()+A.substring(1,A.length());

        if(A.compareTo(B)>0){
            System.out.printf("Yes%n");
        }
        else {
            System.out.printf("No%n");
            
        }
        System.out.printf("%s %s",capitalA,capitalB);
    }
}



