import java.util.*;
public class AllPossibleConcatenation {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.nextLine();
		String S2 = sc.nextLine();
		StringBuilder sb1 = new StringBuilder(S1).reverse();
		StringBuilder sb2 = new StringBuilder(S2).reverse();
		String[] arr = new String[8];
		arr[0] = S1 + S2;
		arr[1] = S1 + sb2;
		arr[2] = sb1 + S2;
		arr[3] = S2 + S1;
		arr[4] = S2 + sb1;
		arr[5] = sb1.toString() + sb2.toString();
		arr[6] = sb2 + S1;
		arr[7] = sb2.toString() + sb1.toString();
		Arrays.sort(arr);
		for(int i=0; i<8; i++) {
		    System.out.println(arr[i]);
		}
	}
}
