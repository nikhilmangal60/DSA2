/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int findMinL(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 2;
        return (n+1)+findMinL(n/2)+findMinL(n-1-n/2);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n,m;
		while(t!=0)
		{
		    n = sc.nextInt();
		    m = sc.nextInt();
		    
		    int maxL = n*(n+3)/2;
		    int minL = findMinL(n);
		  //  System.out.println(minL);
		  //  System.out.println(maxL);
		    if(m>=minL && m<=maxL)
		        System.out.println("0");
		    else if(m>maxL)
		        System.out.println(m-maxL);
		    else
		        System.out.println("-1");
		    t--;
		}
		
	}
}
