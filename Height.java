import java.io.*;
import java.util.*;
public class samp{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int x=t.nextInt();
        int y=t.nextInt();
        if(x>y){
            System.out.println(x);
        }
        else if(x<y){
            System.out.println(y);
        }
    }
}