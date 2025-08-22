import java.util.*;
public class StringToMatrix {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String res = "";
		if(str1.length() > str2.length()) {
		    for(int i=0; i<str2.length(); i++) {
		        res += str1.charAt(i);
		        res += str2.charAt(i);
		    }
		    res += str1.charAt(str1.length()-1);
		}
		else if(str1.length() < str2.length()) {
		    for(int i=0; i<str1.length(); i++) {
		        res += str1.charAt(i);
		        res += str2.charAt(i);
		    }
		    res += str2.charAt(str2.length()-1);
		}
		else {
		    for(int i=0; i<str1.length(); i++) {
		        res += str1.charAt(i);
		        res += str2.charAt(i);
		    }
		}
		int k = 0;
		for(int i=0; i<N; i++) {
		    for(int j=0; j<N; j++) {
		        System.out.print(res.charAt(k++) + " ");
		    }
		    System.out.println();
		}
	}
}
