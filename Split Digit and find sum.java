import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    String[] arr=s2.split("[()]");
	    int s=0,e=0;
	    long sm=0;
	    for(int i=0;i<arr.length;i++){
	        int y=0;
	        String r="";
	        if(!arr[i].equals("")){
	            if(arr[i].charAt(0)!='-'){
	            y=Integer.parseInt(arr[i]);
	            e+=y;
	            r+=s1.substring(s,e);
	            sm+=Long.parseLong(r);
	            s=e;
	     
	            }
	            else{
	               y=Integer.parseInt(arr[i].substring(1));
	               e+=y;
	               r+="-";
	               r+=s1.substring(s,e);
	               sm+=Long.parseLong(r);
	               s=e;
	            }
	        }
	        
	       
	        
	        
	    }
	    System.out.print(sm);

	}
}
