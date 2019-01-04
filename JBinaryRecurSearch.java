/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbinaryrecursearch;

/**
 *
 * @author User
 */
public class JBinaryRecurSearch {

  public static int binaryRecurS(int arr[],int first, int last, int target)
      {
          if(last>=last){ 
                         int mid=first+(last-first)/2; if(arr[mid]==target){return mid;} 
                         if(arr[mid]>target){return binaryRecurS(arr,first, mid-1, target);}
                         else{return binaryRecurS(arr, mid+1,last, target);}}
      
       return -1;
      }

  
    public static void main(String[] args) {
        int arr[]= {2,4,7,9,12,13 ,15,17,20,21,27,28,31,33,35,41};
        int target=7;
        int last=arr.length-1;
        int first=0;
        int result= binaryRecurS(arr,first,last, target);
        if(result==-1){
            System.out.println("Element not found");
            }else
            System.out.println("Element found at " + result);
        }
    }
    

