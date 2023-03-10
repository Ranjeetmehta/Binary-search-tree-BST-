import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String inputLine[] = br.readLine().trim().split(" ");
        //size of array
        int n = Integer.parseInt(inputLine[0]);
        int start[] = new int[n];
        int end[] = new int[n];
        
        //adding elements to arrays start and end
        inputLine = br.readLine().trim().split(" ");
        for(int i = 0; i < n; i++)
            start[i] = Integer.parseInt(inputLine[i]);
        
        inputLine = br.readLine().trim().split(" ");
        for(int i= 0; i < n; i++)
            end[i] = Integer.parseInt(inputLine[i]);
        
        System.out.println(new Solution().solve(start, end, n));
    
    }
}

class Solution
{
    
    public static int solve(int start[], int end[], int n)
    {
        // add your code here
		int[][] inters=new int[n][2];
		for(int i=0;i<n;i++){
			inters[i][0]=start[i];
			inters[i][1]=end[i];
			
		}
		Arrays.sort(inters,(a,b)->{
			if(a[1]==b[1]) return a[0]-b[0];
			return a[1]-b[1];
		});
		int cend=0;
		int count=0;
		for(int i=0;i<n;i++){
		if(cend<inters[i][0]){
			cend=inters[i][1];
			count++;
		}
			
		}
return count;
    }












	
}
