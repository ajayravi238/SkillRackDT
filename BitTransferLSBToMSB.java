import java.util.*;
public class BitTransferLSBToMSB {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
		    String bin = Integer.toBinaryString(arr[i]);
		    String res = "";
		    if(bin.charAt(bin.length()-1) == '0') {
		        res += '1';
		    }
		    else {
		        res += '0';
		    }
		    res += bin.substring(0, bin.length()-1);
		    System.out.print(Integer.parseInt(res, 2) + " ");
		}
	}
}
