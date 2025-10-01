import java.util.*;

public class SolveExpression
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] num = str.split("[*+=]");
		String[] spl = str.split("[0-9x]");
		if(spl[1].equals("*")) {
		    if(num[0].equals("x")) {
		        int a = Integer.parseInt(num[2]);
		        int b = Integer.parseInt(num[1]);
		        System.out.println(a/b);
		    }
		    else if(num[1].equals("x")) {
		        int a = Integer.parseInt(num[2]);
		        int b = Integer.parseInt(num[0]);
		        System.out.println(a/b);
		    }
		    else if(num[2].equals("x")) {
		        int a = Integer.parseInt(num[2]);
		        int b = Integer.parseInt(num[1]);
		        System.out.println(a*b);
		    }
		}
		else if(spl[1].equals("+")) {
		    if(num[0].equals("x")) {
		        int a = Integer.parseInt(num[2]);
		        int b = Integer.parseInt(num[1]);
		        System.out.println(a-b);
		    }
		    else if(num[1].equals("x")) {
		        int a = Integer.parseInt(num[2]);
		        int b = Integer.parseInt(num[0]);
		        System.out.println(a-b);
		    }
		    else if(num[2].equals("x")) {
		        int a = Integer.parseInt(num[2]);
		        int b = Integer.parseInt(num[1]);
		        System.out.println(a+b);
		    }
		}
	}
}

//x*3=6
