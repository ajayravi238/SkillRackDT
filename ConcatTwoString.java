import java.util.*;

public class ConcatTwoString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i+=2) {
		    System.out.println(arr[i] +  arr[i+1]);
		}
	}
}
