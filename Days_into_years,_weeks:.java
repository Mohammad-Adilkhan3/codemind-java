import java.io.*;
import java.util.*;
public class sam{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int T=t.nextInt();
        int r=T%365;
       System.out.println(T/365);
       System.out.println(r/7);
    }
}