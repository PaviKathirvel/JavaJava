import java.util.*;
import java.io.*;
public class Hello{
	public static void main(String args[]){
		System.out.println("Hello");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text : ");
		String str = scan.nextLine();
		int offset = scan.nextInt();
		char array[] = new char[str.length()];
		char encoded[] = new char[str.length()];
		char decoded[] = new char[str.length()];
		array = str.toCharArray();
		System.out.println(array);
		System.out.println("********");
		for(int i = 0;i<array.length;i++){
			encoded[i] = (char)('a' + (i - 'a' + offset)%26);
		}
		System.out.println(encoded);
		for(int i = 0;i<array.length;i++){
			decoded[i] = (char)('a' + (i - 'a' - offset)%26);
		}
		System.out.println(decoded);
	}
}