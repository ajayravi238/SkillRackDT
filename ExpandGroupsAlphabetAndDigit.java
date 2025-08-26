import java.util.*;

public class ExpandGroupsAlphabetAndDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split("\\d+");
		String[] numbers = str.split("\\D+");
		String[] num = new String[words.length];
		int k=0;
		for(int i=0; i<numbers.length; i++) {
		    if(!(numbers[i].isEmpty())) {
		        num[k++] = numbers[i];
		    }
		}
		String res = "";
		for(int i=0; i<words.length; i++) {
		    for(int j=0; j<words[i].length(); j++) {
		        for(int a=0; a<Character.getNumericValue(num[i].charAt(j)); a++) {
		            res += words[i].charAt(j);
		        }
		    }
		}
		System.out.println(res);
	}
}
