/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbinarytodecimal;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class JBinaryToDecimal {

   public static int toDecimal(long n){
       
       int k, i =0, num =0;
       while(n>0){
          k=(int)n%10;
        if((k==1)||(k==0)){
          num+= k*Math.pow(2, i);
           n/=10;
           i++;  
       }
       } return num;
   }
    public static void main(String[] args) {
       long bin;
       System.out.println("Enter binary number to convert...");
       Scanner input = new Scanner(System.in);
       bin=input.nextLong();
       System.out.println("The converted version is: " + toDecimal(bin));
    }
    
}
