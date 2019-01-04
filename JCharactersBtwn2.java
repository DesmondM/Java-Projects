/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcharactersbtwn2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class JCharactersBtwn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start char");
        char first=input.next().charAt(0);
        
        System.out.println("Enter last char");
        char second=input.next().charAt(0);
        
        System.out.println("The chars in between");
        
        print_chars(first, second ,5);
        
    }
    
    public static void print_chars(char a1, char a2, int n){
        for(int ctr = 1; a1<=a2; ctr++, a1++){
            System.out.print(a1 +" ");
            if(ctr%n==0) System.out.println(" ");
        }
        System.out.print("");
    }
}
