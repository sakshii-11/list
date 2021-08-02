package practice2.java;
import java.io.*;
import java.util.*;

public class Calcuation {
	 // arr[] of size n
    static int largest(int []arr,int n)
    {
        Arrays.sort(arr);
        return arr[n - 1];
    }
 
    // Driver code
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
        int n = arr.length;
        System.out.println("largest element is  " + largest(arr, n));
        }

}