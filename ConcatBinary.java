import java.util.*;

public class ConcatBinary
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		String str = Integer.toBinaryString(N1);
		String con = str.concat(String.valueOf(N2));
		System.out.println(Integer.parseInt(con, 2));
	}
}
