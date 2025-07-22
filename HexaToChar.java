import java.util.*;

public class HexaToChar
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
		    int dec = Integer.parseInt(arr[i], 16);
		    System.out.print((char)dec);
		}
	}
}
