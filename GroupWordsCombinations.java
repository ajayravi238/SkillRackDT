import java.util.*;
public class GroupWordsCombinations {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		String[] res = new String[arr.length];
		for(int i=0; i<arr.length; i++) {
		    char[] chArr = arr[i].toCharArray();
		    Arrays.sort(chArr);
		    res[i] = String.valueOf(chArr);
		}
		boolean[] visited = new boolean[arr.length];
		for(int i=0; i<arr.length; i++) {
		    if(visited[i]) {
		        continue;
		    }
		    List<String> y = new ArrayList<>();
		    y.add(arr[i]);
		    visited[i] = true;
		    for(int j=i+1; j<arr.length; j++) {
		        if(!visited[j] && res[i].equals(res[j])) {
		            y.add(arr[j]);
		            visited[j] = true;
		        }
		    }
		    for(String z : y) {
		        System.out.print(z + " ");
		    }
		    System.out.println();
		}
	}
}
