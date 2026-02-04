import java.util.*;
public class LongestSubarrayIntegerTrain {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		int maxSum = 0, maxLen = 0;
		boolean found = false;
		for(int i=0; i<N-1; i++) {
		    int curSum = Integer.parseInt(arr[i]);
		    int len = 1;
		    for(int j=i+1; j<N; j++) {
		        if(arr[j].charAt(0) == arr[j-1].charAt(arr[j-1].length()-1)) {
		            curSum += Integer.parseInt(arr[j]);
		            len++;
		            if(len >= 2) {
		                found = true;
		                if(len > maxLen || (len == maxLen && curSum > maxSum)) {
		                    maxLen = len;
		                    maxSum = curSum;
		                }
		            }
		        }
		        else {
		            break;
		        }
		    }
		}
		if(!found) {
		    int maxEle = Integer.parseInt(arr[0]);
		    for(int i=1; i<N; i++) {
		        maxEle = Math.max(maxEle, Integer.parseInt(arr[i]));
		    }
		    System.out.println(maxEle);
		}
		else {
		    System.out.println(maxSum);
		}
	}
}
