import java.util.*;

public class GetWordStartingWithVowel
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
		    if(arr[i].charAt(0) == 'a' || arr[i].charAt(0) == 'e' || arr[i].charAt(0) == 'i' || 
		    arr[i].charAt(0) == 'o' || arr[i].charAt(0) == 'u') {
		        System.out.println(arr[i]);
		    } 
		}
	}
}
