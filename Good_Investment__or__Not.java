import java.io.*;
import java.util.*;
public class samp{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int x=t.nextInt();
        int y=t.nextInt();
        if(y*2<=x){
            System.out.println("YES");
        }
        else{
             System.out.println("NO");
        }
    }
}