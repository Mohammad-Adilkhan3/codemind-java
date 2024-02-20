import java.io.*;
import java.util.*;
public class sam{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int b=t.nextInt();
        int h=t.nextInt();
        int d=t.nextInt();
        double s=(b+h+d)/2.0;
        double res=Math.sqrt(s*(s-b)*(s-h)*(s-d));
        System.out.format("%.2f
",res);
       
    }
}