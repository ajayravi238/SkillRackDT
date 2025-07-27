import java.util.*;
public class StringCopyAndPasteShortcut {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		List<String> res = new ArrayList<>();
		String lastCopy = "";
		for(int i=0; i<arr.length; i++) {
		    if(arr[i].equals("Ctrl+C")) {
		        if(!res.isEmpty()) {
		            lastCopy = String.join(" ", res);
		        }
		    }
		    else if(arr[i].equals("Ctrl+V")) {
		        if(!lastCopy.isEmpty()) {
		            String[] copied = lastCopy.split(" ");
		            for(String word : copied) {
		                res.add(word);
		            }
		        }
		    }
		    else {
		        res.add(arr[i]);
		    }
		}
		for(String i : res) {
		    System.out.print(i + " ");
		}
	}
}
