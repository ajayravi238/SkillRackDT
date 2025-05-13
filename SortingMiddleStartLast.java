import java.util.*;
public class SortingMiddleStartLast {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextLine();
		}
		for(int i=0; i<num; i++) {
		    for(int j=0; j<num-1; j++) {
		        if(arr[j].charAt(arr[j].length()/2) > arr[j+1].charAt(arr[j+1].length()/2)) {
		            String temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		        else if(arr[j].charAt(arr[j].length()/2) == arr[j+1].charAt(arr[j+1].length()/2)) {
		            if(arr[j].charAt(0) > arr[j+1].charAt(0)) {
		                String temp = arr[j];
		                arr[j] = arr[j+1];
		                arr[j+1] = temp;
		            }
		            else if(arr[j].charAt(0) == arr[j+1].charAt(0)) {
		                if(arr[j].charAt(arr[j].length()-1) > arr[j+1].charAt(arr[j+1].length()-1)) {
		                    String temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;
		                }
		            }
		        }
		    }
		}
		for(int i=0; i<num; i++) {
		    System.out.println(arr[i]);
		}
	}
}
