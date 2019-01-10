/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpairnumbers;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class JPairNumbers {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        
        for(int j=2; j<=300; j++){
            if (is_Prime(j)&& is_Prime(j+2)){
                System.out.println(j + " is a prime number and " + (j+2));
        }
        }
}
    
    public static boolean is_Prime(int n){
        if (n<2) return false;
        for(int i = 2; i<=n/2; i++){
            if(n%i==0)
                return false;
        }
        return true;
                    
    }
}