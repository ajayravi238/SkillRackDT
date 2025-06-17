import java.util.*;
public class PowerBank&MobileCharge {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int[] pc=new int[p];
		int spc=0;
		for(int i=0;i<p;i++){
		    pc[i]=sc.nextInt();
		    spc+=pc[i];
		}
		int m=sc.nextInt();
		int[] mc=new int[m];
        for(int i=0;i<m;i++){
            mc[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m-1;j++){
                if(mc[j]<mc[j+1]){
                    int t=mc[j];
                    mc[j]=mc[j+1];
                    mc[j+1]=t;
                }
            }
        }
        int c=0;
         //System.out.println(spc);
        for(int i=0;i<m;i++){
            int y=100-mc[i];
            spc-=y;
            if(spc<0){
                System.out.println(c);
                return;
            }
            else{
                c++;
            }
        }
          System.out.println(c);       
	}
}
