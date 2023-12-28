/*Write a program to find the Quadrants in which coordinates lie*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    if(a>0 && b>0){
      System.out.println("The point lies in first quadrant");
    }
    else if(a<0 && b>0){
      System.out.println("The point lies in second quadrant");
    }
    
    else if(a>0 && b<0){
      System.out.println("The point lies in third quadrant");
    }
    else{
      System.out.println("The point lies in fourth quadrant");
    }
    
  }
}
