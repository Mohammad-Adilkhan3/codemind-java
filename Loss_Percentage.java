import java.io.*;
import java.util.*;
public class lp{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int x=t.nextInt();
        int y=t.nextInt();
        double l=x-y;
        double lp=(l/x)*100;
        System.out.format("%.2f",lp);
    }
}