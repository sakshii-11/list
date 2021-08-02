package duplicacy.java;
import java.io.*;
import java.util.*;

public class Duplicate { 

    static public void main (String[] args)
    {
        int []arr = {5,9,10,1,6,4,2,5,3,7};
             int l;
             try { 
            	 System.out.println("Array contains..");
            	 for(l=0;l<10;l++) 
            	 {
            		 System.out.println(arr[l]);
            	 }
             }
            	 catch(ArrayIndexOutOfBoundsException e) {
            		 System.out.println("array index out of bound");
            	 }
             System.out.println("Duplicate elements in given array: "); 
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  

}

}
