import java.util.*;

public class FormatDateMonthYear
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		sc.nextLine();
		String m=sc.nextLine();
		long y=sc.nextLong();
		System.out.println("1-Jan-"+y);
		System.out.println("1-"+m+"-"+y);
		System.out.println(d+"-"+m+"-"+y);
	}
}
