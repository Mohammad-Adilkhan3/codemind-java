import java.io.*;
import java.util.*;
public class lp{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int x=t.nextInt();
        double v=4/3.0*3.14*x*x*x;
        System.out.format("%.2f",v);
    }
}