import java.io.*;
import java.util.*;
public class mono{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
           int r1=sc.nextInt();
            int r2=sc.nextInt();
            int r3=sc.nextInt();
            int s=r1+r2+r3;
            int m=Math.max(Math.max(r1,r2),r3);
            int M=s-m;
            if(M<m){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
        }
    }
}
}