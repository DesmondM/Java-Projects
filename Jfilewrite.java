
package jfilewrite;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Jfilewrite {
   public static void main( String[] args ) { 
      try { 
         String data = "Tutorials Point is a best website in the world";
         File f1 = new File("abc.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         } 
         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("Done");
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}
