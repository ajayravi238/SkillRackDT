import java.util.*;
import java.util.regex.*;
public class InvertSignAndEvaluatePolynominalExpression {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int x = sc.nextInt();
		String newStr = "";
		for(int i=0; i<S.length(); i++) {
		    if(S.charAt(i) == '+') {
		        newStr += '-';
		    }
		    else if(S.charAt(i) == '-') {
		        newStr += '+';
		    }
		    else {
		        newStr += S.charAt(i);
		    }
		}
		System.out.println(newStr);
	        
	    Pattern p=Pattern.compile("([+-]\\d+)x\\^(\\d+)");
	    Matcher m=p.matcher(newStr);
	    
	    double res=0;
	    while(m.find()){
	        int cof=Integer.parseInt(m.group(1));
	        int pow=Integer.parseInt(m.group(2));
	        
	        res+=cof*Math.pow(x,pow);
	        
	    }
		System.out.println((int) res);
		
	}
}
