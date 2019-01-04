/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsumofdigits;
import java.util.*;

/**
 *
 * @author User
 */
public class JSumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter digit");
        
        int num=input.nextInt();
        System.out.println("The sum of digits is "+ sum_ofDigits(num));
    }
   
    public static int sum_ofDigits(int n){
        int result=0;
        
        while(n>0){
            result+= n%10;
            n= n/10;
        }
        return result;
    }
}
