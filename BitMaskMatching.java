import java.util.*;
public class BitMaskMatching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		String bin=Integer.toBinaryString(N);
		int len=bin.length();
		StringBuilder sb=new StringBuilder(bin);
		for(int i=0; i<26-len; i++) {
			sb.insert(0,"0");
		}
		String bi=sb.toString();
		String aph="ZYXWVUTSRQPONMLKJIHGFEDCBA";
		String ans="";
		for(int i=0; i<26; i++) {
			if(bi.charAt(i)=='1') {
				ans+=aph.charAt(i);
			}
		}
		int c=0;
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<ans.length(); j++) {
				if(str.charAt(i)==ans.charAt(j)) {
					c++;
				}
			}
		}
		if(c==str.length()) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
