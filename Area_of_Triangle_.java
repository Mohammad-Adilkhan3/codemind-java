import java.io.*;
import java.util.*;
public class samp{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int a=t.nextInt();
        int b=t.nextInt();
        int c=t.nextInt();
        double s=(a+b+c)/2.0;
        System.out.printf("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}