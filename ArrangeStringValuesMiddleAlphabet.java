import java.util.*;
public class ArrangeStringValuesMiddleAlphabet {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextLine();
		}
		int len = arr[0].length();
		for(int i=0; i<S.length(); i++) {
		    int flag = 0;
		    for(int j=0; j<N; j++) {
		        if((String.valueOf(S.charAt(i))).equalsIgnoreCase((String.valueOf(arr[j].charAt(arr[j].length()/2))))) {
		            System.out.println(arr[j]);
		            flag = 1;
		        }
		    }
		    if(flag == 0) {
		        for(int k=0; k<len; k++) {
		            if(k == len/2) {
		                System.out.print(S.charAt(i));
		            }
		            else {
		                System.out.print("*");
		            }
		        }
		        System.out.println();
		    }
		}
	}
}
