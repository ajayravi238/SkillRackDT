import java.util.*;
public class CombinationsString {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    
	    int start=str.indexOf("[");
	    int end=str.indexOf("]");
	    
	    String prefix=str.substring(0,start);
	    String suffix=str.substring(end+1);
	    String inside=str.substring(start+1,end);
	    
	    String[] arr=inside.split("\\|");
	    ArrayList<String> res=new ArrayList<>();
	    for(int i=0;i<arr.length;i++){
	        res.add(prefix+arr[i]+suffix);
	    }
	    Collections.sort(res);
	    for(String t:res){
	    System.out.print(t+" ");
	    }
	}
}
