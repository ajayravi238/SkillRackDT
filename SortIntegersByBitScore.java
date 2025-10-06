import java.util.*;
public class SortIntegersByBitScore {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.next();
		}
		int[] sArr = new int[N];
		for(int i=0; i<N; i++) {
		    int sum = 0;
		    for(int j=0; j<arr[i].length(); j++) {
		        int a = Character.getNumericValue(arr[i].charAt(j));
		        String bin = Integer.toBinaryString(a);
		        int b = Integer.parseInt(bin);
		        sum += a*b;
		    }
		    sArr[i] = sum;
		}
		for(int i=0; i<N; i++) {
		    for(int j=0; j<N-1; j++) {
		        if(sArr[j] > sArr[j+1]) {
		            int temp = sArr[j];
		            String t = arr[j];
		            sArr[j] = sArr[j+1];
		            arr[j] = arr[j+1];
		            sArr[j+1] = temp;
		            arr[j+1] = t;
		        }
		        else if(sArr[j] == sArr[j+1]) {
		            if(Integer.parseInt(arr[j]) > Integer.parseInt(arr[j+1])) {
		                int temp = sArr[j];
		                String t = arr[j];
		                sArr[j] = sArr[j+1];
		                arr[j] = arr[j+1];
		                sArr[j+1] = temp;
		                arr[j+1] = t;
		            }
		        }
		    }
		}
		for(int i=0; i<N; i++) {
		    System.out.print(arr[i] + " ");
		}
	}
}
