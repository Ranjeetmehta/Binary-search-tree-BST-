import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i*i<=n;i++){
			System.out.println(i*i);
		}
	}
}
