import java.io.*;
import java.util.*;
public class sam{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        double b=t.nextDouble();
        double h=t.nextDouble();
        double d=t.nextDouble();
        double r=b*0.12;
        System.out.format("%.2f
",r);
        System.out.format("%.2f",(b+h+d+r));
       
    }
}