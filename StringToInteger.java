import java.util.*;

public class StringToInteger
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str = s.toLowerCase();
		for(int i=0; i<str.length()-1; i++) {
		    if(str.charAt(i) == 'o') {
		        System.out.print(1);
		        i+=2;
		    }
		    else if(str.charAt(i) == 't' && str.charAt(i+1) == 'w') {
		        System.out.print(2);
		        i+=2;
		    }
		    else if(str.charAt(i) == 't' && str.charAt(i+1) == 'h') {
		        System.out.print(3);
		        i+=4;
		    }
		    else if(str.charAt(i) == 'f' && str.charAt(i+1) == 'o') {
		        System.out.print(4);
		        i+=3;
		    }
		    else if(str.charAt(i) == 'f' && str.charAt(i+1) == 'i') {
		        System.out.print(5);
		        i+=3;
		    }
		    else if(str.charAt(i) == 's' && str.charAt(i+1) == 'i') {
		        System.out.print(6);
		        i+=2;
		    }
		    else if(str.charAt(i) == 's' && str.charAt(i+1) == 'e') {
		        System.out.print(7);
		        i+=4;
		    }
		    else if(str.charAt(i) == 'e') {
		        System.out.print(8);
		        i+=5;
		    }
		    else {
		        System.out.print(9);
		        i+=4;
		    }
		}
	}
}
