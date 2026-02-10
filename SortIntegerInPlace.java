import java.util.*;

public class SortIntegerInPlace
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		List<Integer> intArr = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
		    if(arr[i].matches("-?\\d+")) {
		        intArr.add(Integer.parseInt(arr[i]));
		    }
		}
		Collections.sort(intArr);
		int k = 0;
		for(int i=0; i<arr.length; i++) {
		    if(!(arr[i].matches("-?\\d+"))) {
		        System.out.print(arr[i]  + " ");
		    }
		    else {
		        System.out.print(intArr.get(k++) + " ");
		    }
		}
	}
}
