import java.util.*;

public class RecursiveSplitString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		String[] arr=input.split(" ");

		Map<Character, List<Integer>> map = new LinkedHashMap<>();

		for (String token : arr) {
			int num = Integer.parseInt(token.substring(0, token.length() - 1)); // 20
			char group = token.charAt(token.length() - 1);//a

			if (!map.containsKey(group)) {
				map.put(group, new ArrayList<>());
			}
			map.get(group).add(num);

		}
		System.out.println(map);
		int rows = map.size();
		int cols = 0;
		for (List<Integer> list : map.values()) {
			cols = list.size();
			break;              
		}
		System.out.println(rows + " " + cols);
		for (List<Integer> list : map.values()) {
			for (int val : list) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
}
