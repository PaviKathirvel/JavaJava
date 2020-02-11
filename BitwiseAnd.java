import java.util.*;
import java.io.*;

public class BitwiseAnd{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Test cases : ");
		int testcase = scan.nextInt();
		int result[] = new int[testcase];
		int i=0;
		for(i = 0; i < testcase; i++){
			int resultsum = 0;
			System.out.print("Size : ");
			int size = scan.nextInt();
			int array[] = new int[size];
			System.out.print("Enter elements : ");
			for(int j = 0; j < size; j++){
				array[j] = scan.nextInt();
				}
			for(int j = 1; j < size-1; j++){
				 int sum = 0;
				 sum = array[j] & array[j+1];
				 resultsum = resultsum + sum;
			}
			result[i] = resultsum;
			
			}
		for(i = 0 ; i < testcase ; i++){
			System.out.println(result[i]);
			}
			
		}
	
	}

