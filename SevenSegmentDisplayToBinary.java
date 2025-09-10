import java.util.*;
public class SevenSegmentDisplayToBinary {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		Map<Integer, String> m = new HashMap<>(n.length());
		m.put(0, "1111110");
		m.put(1, "0110000");
		m.put(2, "1101101");
		m.put(3, "1111001");
		m.put(4, "0110011");
		m.put(5, "1011011");
		m.put(6, "1011111");
		m.put(7, "1110000");
		m.put(8, "1111111");
		m.put(9, "1111011");
		String res = "";
		for(int i=0; i<n.length(); i++) {
		    res += m.get(Character.getNumericValue(n.charAt(i)));
		}
		System.out.println(Long.parseLong(res, 2));
	}
}
