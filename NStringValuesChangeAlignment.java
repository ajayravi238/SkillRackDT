import java.util.*;
public class NStringValuesChangeAlignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		ArrayList<String> arr = new ArrayList<>();
		arr.add(s);
		if(s.length() != n) {
			for(int i=1; i<n; i++) {
				arr.add(sc.next());
			}
			char[][] res = new char[arr.get(0).length()][n];
			for(int i=0; i<arr.size(); i++) {
				for(int j=0; j<arr.get(i).length(); j++) {
					res[j][i] = arr.get(i).charAt(j);
				}
			}
			for(int i=0; i<arr.get(0).length(); i++) {
				for(int j=0; j<n; j++) {
					System.out.print(res[i][j]);
				}
				System.out.println();
			}
		}
		else {
			int count = 0;
			while(sc.hasNext()) {
				arr.add(sc.next());
				count++;
			}
			char[][] res = new char[n][count+1];
			for(int i=0; i<count+1; i++) {
				for(int j=0; j<n; j++) {
					res[j][i] = arr.get(i).charAt(j);
				}
			}
			for(int i=0; i<n; i++) {
				for(int j=0; j<count+1; j++) {
					System.out.print(res[i][j]);
				}
				System.out.println();
			}
		}
	}
}
