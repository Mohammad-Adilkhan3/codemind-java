import java.io.*;
import java.util.*;
public class sam{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int T=t.nextInt();
        for(int i=0;i<T;i++){
            int x=t.nextInt();
            int y=t.nextInt();
            int d=x/y;
            int r=x%y;
            System.out.println(d+r);
        }
    }
}