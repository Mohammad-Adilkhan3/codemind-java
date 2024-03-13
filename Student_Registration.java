import java.io.*;
import java.util.*;
public class samp{
    public static void main(String args[]){
        Scanner t=new Scanner(System.in);
        int x=t.nextInt();
        for(int i=0;i<x;i++){
            int n=t.nextInt();
            int m=t.nextInt();
            int k=t.nextInt();
            if(n<m-k){
            System.out.println("YES");
            }
             else{
             System.out.println("NO");
        }
        }
        
        
    }
}