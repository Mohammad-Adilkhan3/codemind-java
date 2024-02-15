import java.io.*;
import java.util.*;
public class sam{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int m=t.nextInt();
        int T=n;
        n=m;
        m=T;
        System.out.println(n);
        System.out.println(m);
    }
}