import java.util.*;
public class RollDiePattern {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
		    if(str.charAt(i) == '1') {
		        System.out.println("- - -");
		        System.out.println("- * -");
		        System.out.println("- - -");
		    }
		    else if(str.charAt(i) == '2') {
		        System.out.println("* - -");
		        System.out.println("- - -");
		        System.out.println("- - *");
		    }
		    else if(str.charAt(i) == '3') {
		        System.out.println("* - -");
		        System.out.println("- * -");
		        System.out.println("- - *");
		    }
		    else if(str.charAt(i) == '4') {
		        System.out.println("* - *");
		        System.out.println("- - -");
		        System.out.println("* - *");
		    }
		    else if(str.charAt(i) == '5') {
		        System.out.println("* - *");
		        System.out.println("- * -");
		        System.out.println("* - *");
		    }
		    else {
		        System.out.println("* - *");
		        System.out.println("* - *");
		        System.out.println("* - *");
		    }
		}
	}
}
