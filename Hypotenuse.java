import java.io.*;
import java.util.*;
public class hyp{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int a=t.nextInt();
        int b=t.nextInt();
        System.out.printf("%.2f",Math.sqrt((a*a)+(b*b)));
    }
}