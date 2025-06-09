import java.util.*;
public class ShiftLastXBit {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int X = sc.nextInt();
		String binary = Long.toBinaryString(N);
		StringBuilder sb = new StringBuilder(binary);
		for(int i=0; i<(32-binary.length()); i++) {
		    sb.insert(0, '0');
		}
		char last = sb.charAt(sb.length()-1);
		sb.insert(sb.length()-X, last);
		sb.deleteCharAt(sb.length()-1);
		String res = sb.toString();
		long ans = Long.parseLong(res, 2);
		System.out.println(ans);
	}
}
