import java.util.*;
import java.lang.*;
import java.io.*;

class Wordle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
		    String r = sc.next();
		    String ans = "";
		    
		    for (int i=0;i<5; i++ ){
		        if (s.charAt(i)==r.charAt(i)) {
		            ans +='G';
		        }else{
		            ans+='B';
		        }
		    } 
		    System.out.println(ans);
		}

	}
}
