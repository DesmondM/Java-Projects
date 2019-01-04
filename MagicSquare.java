/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquare;

/**
 *
 * @author User
 */
public class MagicSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int n=5, i=0, j=0; 
    int entry=1;
    int square[][] = new int[n][n];
    
    int start = (n/2);
    square[i][start]=entry;
    entry++;
   
   j=start;
   i--;
   j++;
  
   //2nd entry
    if (i<0){i=n-1;  square[i][j]=entry; entry++;}
   
   i--;
   j++;
   
   //3rd entry
   if (square[i][j]==0){square[i][j]=entry; entry++;}
     
   i--;
   j++;
   
   //4rd entry
   if(j==n){j=0; square[i][j]=entry; entry++;}
   i--;
   j++;
   
  //5th entry
   if(square[i][j]==0){square[i][j]=entry; entry++;}
    i--;
    j++;
   
  //6th entry
  if ( square[i][j]!=0 ){i=i+2; j--;  square[i][j]=entry; entry++;}
   i--;
    j++;
  //7th entry
  if ( square[i][j]==0 ){square[i][j]=entry++;}
  i--;
   j++;
  //8th entry
if ( square[i][j]==0 ){square[i][j]=entry++;}
i--;
j++;
//9th entry
if ( i<0 ){i=n-1; square[i][j]=entry++;}
i--;
j++;
//10th entry
if ( j==n ){j=0; square[i][j]=entry++;}
i--;
j++;
//11th entry
if ( square[i][j]!=0 ){i=i+2; j--; square[i][j]=entry++;}
 i--;
 j++;
  //12th entry
  if ( square[i][j]==0 ){square[i][j]=entry++;}

  i--;
 j++;
  //13th entry
  if ( square[i][j]==0 ){square[i][j]=entry++;}

   i--;
 j++;
 //14th entry
  if ( square[i][j]==0 ){square[i][j]=entry++;}

   i--;
 j++;
  //15th entry
  if ( square[i][j]==0 ){square[i][j]=entry++;}

   i--;
 j++;
  //16th entry
  if ( i<0 && j==n ){i=i+2; j--; square[i][j]=entry++;}
  i--;
 j++;
  //17th entry
  if ( j==n ){j=0; square[i][j]=entry++;}
  
 i--;
 j++;
 //18th entry
  if ( i<0 ){i=n-1; square[i][j]=entry++;}

 i--;
 j++;
 //19th entry
  if ( square[i][j]==0 ){square[i][j]=entry++;}
  
  i--;
 j++;
 //20th entry
  if ( square[i][j]==0 ){square[i][j]=entry++;}
  
 i--;
 j++;
 //21th entry
  if ( square[i][j]==0 ){square[i][j]=entry++;}
  else {i=i+2; j--; square[i][j]=entry++;}
  
  i--;
 j++;
 //22th entry
  if ( square[i][j]==0 ){square[i][j]=entry++;}
  
 i--;
 j++;
 //23th entry
   if ( j==n ){j=0; square[i][j]=entry++;}
   
   
i--;
 j++;
 //24th entry
  if ( square[i][j]==0 ){square[i][j]=entry++;}  
 i--;
  j++;
 //25th entry
  if ( i<0 ){i=n-1; square[i][j]=entry++;}
  
   
    for (i =0; i<n; i++){
           for(j=0; j<n; j++){
            
            System.out.print(square[i][j]+ "\t");
      }
           System.out.println();
        }
   
   }
    
}