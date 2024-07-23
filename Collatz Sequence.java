import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number");
        int  num=sc.nextInt();
        
        int count=0;
        int sum=0;
        System.out.println(num);
         while (num!=1){
            if (num%2==0){
                
                num/=2;
                
            } else {
                
               
                num=num*3+1;
            }
            System.out.println(num);
            sum++;
        
   
         } 
         System.out.println("count:"+sum);
}
}
