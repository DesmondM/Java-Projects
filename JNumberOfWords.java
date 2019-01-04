 
package jnumberofwords;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JNumberOfWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter String");
        String str= input.nextLine();
        System.out.println("There are "+ word_Count(str)+ " words in your string"+"\n");
    }
        public static int word_Count(String str){
            int count =0; 
            if(!(" ".equals(str.substring(0, 1)))||(" ".equals(str.substring(str.length()-1)))){
            return count;
        }
            for(int i=0; i<str.length(); i++){
                 if (str.charAt(i)==' '){
                 count++;
             }
               
             }
            return count+1;
        }
       
        
    }
    

