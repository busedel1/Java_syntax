import java.util.*;
import java.io.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int k=1;
            int solj=a+b;
            for(int j=0;j < n; j++){
                System.out.printf("%d ",solj);
                k=k*2;
                solj=solj+k*b;
            }
        }
        System.out.printf("%n");
        in.close();
    }
}

