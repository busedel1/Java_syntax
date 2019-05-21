import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner nc = new Scanner(System.in);
        int i=1;
        while(nc.hasNext()){
            String s = nc.nextLine();
            System.out.printf("%d %s%n",i,s);
            i++;
        }
    }
}

