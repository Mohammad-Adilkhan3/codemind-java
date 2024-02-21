import java.io.*;
import java.util.*;
public class samp{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
         int n=t.nextInt();
        int h=n/3600;
        int rem=n%3600;
        int m=rem/60;
        int s=rem%60;
        System.out.println("H:M:S-"+h+":"+m+":"+s);
    }
}