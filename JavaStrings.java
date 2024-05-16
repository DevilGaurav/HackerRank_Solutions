import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int C=A.length()+B.length();
        System.out.println(C);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else System.out.println("No");
        String a=A.substring(0,1).toUpperCase();
        String b=B.substring(0,1).toUpperCase();
        
        System.out.println(a+A.substring(1)+" "+b+B.substring(1));
        
        
    }
}
