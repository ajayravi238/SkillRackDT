import java.util.*;
public class SortDateWithMultipleCondition {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] dates = new String[num];
		for(int i=0; i<num; i++) {
		    dates[i] = sc.nextLine();
		}
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		ArrayList<Integer> date = new ArrayList<>();
		ArrayList<String> month = new ArrayList<>();
		ArrayList<Integer> year = new ArrayList<>();
		for(int i=0; i<num; i++) {
		    String[] sp = dates[i].split("-");
		    date.add(Integer.parseInt(sp[0]));
		    month.add(sp[1]);
		    year.add(Integer.parseInt(sp[2]));
		}
		for(int i=0; i<num; i++) {
		    for(int j=0; j<num-1; j++) {
		        if(date.get(j) > date.get(j+1)) {
		            int temp = date.get(j);
		            String m = month.get(j);
		            int y = year.get(j);
		            
		            date.set(j, date.get(j+1));
		            month.set(j, month.get(j+1));
		            year.set(j, year.get(j+1));
		            
		            date.set(j+1, temp);
		            month.set(j+1, m);
		            year.set(j+1, y);
		        }
		        else if(date.get(j) == date.get(j+1)) {
		            int f = 0, s = 0;
		            for(int k=0; k<12; k++) {
		                if(months[k].equals(month.get(j))) {
		                    f = k;
		                }
		                if(months[k].equals(month.get(j+1))) {
		                    s = k;
		                }
		            }
		          //  System.out.println(f + " " + s);
		            if(f > s) {
		                int temp = date.get(j);
		                String m = month.get(j);
		                int y = year.get(j);
		                
		                date.set(j, date.get(j+1));
		                month.set(j, month.get(j+1));
		                year.set(j, year.get(j+1));
		                
		                date.set(j+1, temp);
		                month.set(j+1, m);
		                year.set(j+1, y);
		            }
		            else if(f == s) {
		                if(year.get(j) > year.get(j+1)) {
		                    int temp = date.get(j);
		                    String m = month.get(j);
		                    int y = year.get(j);
		                    
		                    date.set(j, date.get(j+1));
		                    month.set(j, month.get(j+1));
		                    year.set(j, year.get(j+1));
		                    
		                    date.set(j+1, temp);
		                    month.set(j+1, m);
		                    year.set(j+1, y);
		                }
		            }
		        }
		    }
		}
		for(int i=0; i<num; i++) {
		    String f = String.format("%02d", date.get(i));
		    System.out.println(f + "-" + month.get(i) + "-" + year.get(i));
		}
	}
}
