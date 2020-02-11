import java.util.*;
public class NamingPattern{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	String str=s.next();
	int n=str.length();
	char ch;
	int i,j;
	for(i=1;i<=n;i++){
	    ch=str.charAt(i-1);
	    for(j=1;j<=n;j++){
	        if(i==j){
	            System.out.print(ch+" ");
	        }
	        else
	            System.out.print("  ");
	    }
        System.out.println();
    }
}
}