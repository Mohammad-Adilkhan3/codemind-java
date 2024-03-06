import java.io.*;
import java.util.*;
public class samp{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int h=s.nextInt();
        int d=s.nextInt();
        if(n>50 && h>60 && d>100){
            System.out.println(10);
        }
        else if(n>50 && h>60){
            System.out.println(9);
        }
        else if(h>60 && d>100){
            System.out.println(8);
        }
        else if(n>50 && d>100){
            System.out.println(7);
        }
        else if(n>50 || h>60 || d>100){
            System.out.println(6);
        }
        else{
            System.out.println(5);
        }
        
       
    }
}