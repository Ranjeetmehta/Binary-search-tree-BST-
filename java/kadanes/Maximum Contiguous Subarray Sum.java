import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        Solution ob =new Solution();
        long ans = ob.maxSubarraySum(a,n);
        System.out.println(ans);
    }
}
class Solution{
    public long maxSubarraySum(int a[],int n){
        //Write code here
		long maxSum=Integer.MIN_VALUE;
		long currTrain=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			long ifStartNewTrain=a[i];
			long IfSitWithCurrTrain=currTrain+a[i];
			currTrain=Math.max(ifStartNewTrain,IfSitWithCurrTrain);
			maxSum=Math.max(maxSum,currTrain);
		}
		return maxSum;
    }
}
