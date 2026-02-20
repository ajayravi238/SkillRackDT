import java.util.*;
public class ValidPasswordNameAndDOB {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String[] arr = name.split(" ");
		String fname = arr[0];
		String lname = arr[arr.length-1];
		String date = sc.nextLine();
		String[] dateArr = date.split("-");
		String year = dateArr[2];
		String password = sc.nextLine();
		StringBuilder res = new StringBuilder();
		res.append(lname.substring(0, 2));
		res.append(year);
		res.append(fname.substring(fname.length()-2));
		res = res.reverse();
		res.setCharAt(0, Character.toUpperCase(res.charAt(0)));
		for(int i=1; i<res.length(); i++) {
		    res.setCharAt(i, Character.toLowerCase(res.charAt(i)));
		}
		if(password.equals(res.toString())) {
		    System.out.println("Correct");
		} else {
		    System.out.println("Wrong");
		}
	}
}
