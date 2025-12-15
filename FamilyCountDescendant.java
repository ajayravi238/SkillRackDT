import java.util.*;
public class FamilyCountDescendant {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
		    arr[i] = sc.nextLine();
		}
		String name = sc.nextLine();
		Set<String> fam = new HashSet<>();
		    fam.add(name);
		    boolean flag = true;
		    while(flag) {
		        flag = false;
		        for(int i=0; i<N; i++) {
		            String[] sArr = arr[i].split(" ");
		            String child = sArr[0];
		            String father = sArr[1];
		            if(fam.contains(father) && !(fam.contains(child))) {
		                fam.add(child);
		                flag = true;
		            }
		        }
		    }
		    System.out.println(fam.size());
	}
}
