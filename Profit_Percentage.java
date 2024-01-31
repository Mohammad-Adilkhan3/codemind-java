import java.io.*;
import java.util.*;
public class lp{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int x=t.nextInt();
        int y=t.nextInt();
        double p=(y-x);
        double pp=(p/x)*100;
        System.out.format("%.2f",pp);
    }
}