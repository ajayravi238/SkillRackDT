import java.util.*;
public class MessagerAppPrintMessage {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextLine();
		}
		Map<String, String> m = new LinkedHashMap<>();
		for(int i=N-1; i>=0; i--) {
		    String[] sp = arr[i].split(":");
		    if(m.containsKey(sp[0])) {
		        continue;
		    }
		    else {
		        m.put(sp[0], sp[1]);
		    }
		}
		for(Map.Entry<String, String> i : m.entrySet()) {
		    System.out.println(i.getKey() + ":" + i.getValue());
		}
	}
}
