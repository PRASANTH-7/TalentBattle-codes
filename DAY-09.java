/*Write a program to find Number of digits in an integer*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int a=sc.nextInt();
    
     int n=0,count=0;
     if(a==0){
      System.out.println("1");
     }
     else{
   while(a>0){
    count++;
     a=a/10;
    
   }
   System.out.println(count);
     }
  }
}
