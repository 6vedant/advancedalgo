// created by Vedant
// https://www.hackerrank.com/challenges/sparse-arrays/problem

import java.io.*;
import java.util.*;

public class Solution {

     public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

	        Scanner scan = new Scanner(System.in);
	        Scanner s = new Scanner(System.in);
	        int m = Integer.parseInt(scan.next());
	        String arr[] = new String[m];
	        for(int i=0;i<m;i++){
	            arr[i] = scan.next();
	        }
	        int n = Integer.parseInt(scan.next());
	        String pat[] = new String[n];
	        for(int i=0;i<n;i++){
	            pat[i] = scan.next();
	        }
	        
	        for(int i=0;i<n;i++){
	            System.out.println(getCount(pat[i],arr));
	        }
	        
	        scan.close();
	        s.close();
	        
	        
	    }
	    
	    public static int getCount(String str,String[] arr){
	        int count =0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i].equals(str)){
	                count++;
	            }
	        }
	        
	        return count;
	    }
	    
	}
