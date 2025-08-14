import java.util.*;

public class EvaluateBitwise
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char ch = sc.next().charAt(0);
		String resStr1 = "", resStr2 = "";
		for(int i=0; i<str1.length(); i++) {
		    if(str1.charAt(i) == 'a') {
		        resStr1 += '0';
		    }
		    else {
		        resStr1 += '1';
		    }
		    if(str2.charAt(i) == 'a') {
		        resStr2 += '0';
		    }
		    else {
		        resStr2 += '1';
		    }
		}
		StringBuilder res = new StringBuilder();
		if(ch == '&') {
		    for (int i = 0; i < resStr1.length(); i++) {
                res.append((resStr1.charAt(i) == '1' && resStr2.charAt(i) == '1') ? 'b' : 'a');
            }
		}
		else if(ch == '|') {
		    for (int i = 0; i < resStr1.length(); i++) {
               res.append((resStr1.charAt(i) == '1' || resStr2.charAt(i) == '1') ? 'b' : 'a');
            }
		}
		else {
		    for (int i = 0; i < resStr1.length(); i++) {
                res.append((resStr1.charAt(i) != resStr2.charAt(i)) ? 'b' : 'a');
            }
		}
		System.out.println(res);
	}
}
