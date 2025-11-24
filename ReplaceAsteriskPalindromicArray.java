import java.util.*;
public class ReplaceAsteriskPalindromicArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		int y=n%2==0?n/2:(n/2)-1;

		for(int i=0,j=n-1; i<n/2 & j>=y; i++,j--) {
			if(!arr[i].equals("*") && !arr[j].equals("*")) {
				if(!arr[i].equals(arr[j])) {
					System.out.print("-1");
					return;
				}
			}
			if(arr[i].equals("*") && arr[j].equals("*")) {
				arr[i]="1";
				arr[j]="1";
			}
			if(arr[i].equals("*")) {
				arr[i]=arr[j];
			}
			if(arr[j].equals("*")) {
				arr[j]=arr[i];
			}

		}
		if(n%2!=0) {
			if(arr[n/2].equals("*")) {
				arr[n/2]="1";
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
