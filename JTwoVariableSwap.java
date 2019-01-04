/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcleverswap;

/**
 *
 * @author User
 */
public class JTwoVariableSwap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Swap two numbers without creating third variable
        
        int a =10, b=20;
        
        System.out.printf("Before swapping the values were: a = %d  and b= %d" + "\n", a, b);
        
        a= a+b; //10+20 = 30
        b= a-b; //30-20 =10
        a= a-b; //30-10 =20
        
        System.out.printf("After swapping the values were: a = %d  and b= %d" + "\n", a, b);
        
    }
    
}
