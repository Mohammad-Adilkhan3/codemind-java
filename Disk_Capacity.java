import java.io.*;
import java.util.*;
public class samp{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int s=t.nextInt();
        int b=t.nextInt();
        System.out.println(2*n*s*b*512);
    }
}