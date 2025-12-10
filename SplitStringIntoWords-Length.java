import java.util.*;
public class SplitStringIntoWordsLength {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		String[] strArr = new String[N];
		String[] dupArr = new String[N];
		int k = 0;
		for(int i=0; i<N; i++) {
		    dupArr[i] = S.substring(k, k+arr[i]).toLowerCase();
		    strArr[i] = S.substring(k, k+arr[i]);
		    k = k+arr[i];
		}
		for(int i=0; i<arr.length; i++) {
		    for(int j=0; j<arr.length-1; j++) {
		        if(arr[j] > arr[j+1]) {
		            int temp = arr[j];
		            String t = strArr[j];
		            String tt = dupArr[j];
		            arr[j] = arr[j+1];
		            strArr[j] = strArr[j+1];
		            dupArr[j] = dupArr[j+1];
		            arr[j+1] = temp;
		            strArr[j+1] = t;
		            dupArr[j+1] = tt;
		        }
		    }
		}
		for(int i=0; i<strArr.length; i++) {
		    System.out.print(strArr[i]);
		}
	}
}
