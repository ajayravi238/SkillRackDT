import java.util.*;
public class SplitBinaryAndSortInteger {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextInt();
		}
		String[] bin = new String[N];
		List<String> div = new ArrayList<>();
		for(int i=0; i<N; i++) {
		    bin[i] = Integer.toBinaryString(arr[i]);
		    if(bin[i].length()%2 == 0) {
		        div.add(bin[i].substring(0, bin[i].length()/2));
		        div.add(bin[i].substring(bin[i].length()/2));
		    }
		    else {
		        div.add(bin[i].substring(0, (bin[i].length()/2)+1));
		        div.add(bin[i].substring(bin[i].length()/2));
		    }
		}
		List<Integer> res = new ArrayList<>();
		for(int i=0; i<div.size(); i++) {
		    res.add(Integer.parseInt(div.get(i), 2));
		}
		Collections.sort(res);
		for(int i : res) {
		    System.out.print(i + " ");
		}
	}
}
