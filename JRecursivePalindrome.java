/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrecursivepalin;

/**
 *
 * @author User
 */
public class JRecursivePalindrome {
     public static boolean isPal(String str){
         if (str.length()==0||str.length()==1){
             return true;
         }
         if (str.charAt(0)==str.charAt(str.length()-1)){
             System.out.println(str.substring(1, str.length()-1));
             return isPal(str.substring(1, str.length()-1));
         }
         return false;
     }
    public static void main(String[] args) {
       String test = "Racecar";
       test= test.toLowerCase();
       if(isPal(test)){
           System.out.println("The string is a palindrome");
       }else{
           System.out.println("The string is not  a palindrome at all");
    }
    }
}
