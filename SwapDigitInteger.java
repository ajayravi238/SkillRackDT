import java.util.*;
public class SwapDigitInteger {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		int[] X = new int[num];
		int[] Y = new int[num];
		for(int i=0; i<num; i++) {
		    X[i] = sc.nextInt();
		    Y[i] = sc.nextInt();
		}
		char[] arr = str.toCharArray();
		for(int i=0; i<num; i++) {
		    char temp = arr[X[i]-1];
		    arr[X[i]-1] = arr[Y[i]-1];
		    arr[Y[i]-1] = temp;
		}
		String res = String.valueOf(arr);
        if(str.equals(res)) {
            System.out.println("YES");
        }
        else {
            System.out.println((Long.parseLong(res))*2);
        }
	}
}
