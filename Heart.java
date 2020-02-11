import java.util.*;
import java.io.*;
public class Heart{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println();
		int input = scan.nextInt();
		int a = 2;
		int b = input-1;
		int i = 1;
		
		while(i<=input){
			if(i==1){
				for(int j=1;j<=input;j++){
					if(j==a || j==b){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}
				a++;
				b--;	
			}
			else if(i<=(input/2) && a<=b){
				for(int j = 1; j <= input; j++){
					if(j==1 || j==input || j==a || j==b){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}
				a++;
				b--;
			}
			else if(i<=(input/2+1)){
				for(int j = 1; j <= input; j++){
					if(j==1 || j==input){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}
			}
			else{
				if(i==(input/2+2)){
					a=2;
					b=input-1;
				}
				for(int j = 1; j <= input; j++){
					if(j==a || j==b){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}
				a++;
				b--;
			}
			i++;
			System.out.println();
			
		}
	}
}