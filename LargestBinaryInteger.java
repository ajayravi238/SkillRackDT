import java.util.*;

public class LargestBinaryInteger
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = String.valueOf(num);
		char[] chArr = str.toCharArray();
		String[] strArr = new String[str.length()];
		for(int i=0; i<chArr.length; i++) {
		    if(i == 0) {
		        strArr[i] = Integer.toBinaryString(Character.getNumericValue(chArr[i]));
		        strArr[i] += str.substring(1);
		    }
		    else if(i == chArr.length-1) {
		        strArr[i] = str.substring(0, chArr.length-1);
		        strArr[i] += Integer.toBinaryString(Character.getNumericValue(chArr[i]));
		    }
		    else {
		        strArr[i] = str.substring(0, i);
		        strArr[i] += Integer.toBinaryString(Character.getNumericValue(chArr[i]));
		        strArr[i] += str.substring(i+1);
		    }
		}
		for(int i=0; i<strArr.length; i++) {
		    for(int j=0; j<strArr.length-1; j++) {
		        if(Long.parseLong(strArr[j]) < Long.parseLong(strArr[j+1])) {
		            String temp = strArr[j];
		            strArr[j] = strArr[j+1];
		            strArr[j+1] = temp;
		        }
		    }
		}
		System.out.println(strArr[0]);
	}
}
