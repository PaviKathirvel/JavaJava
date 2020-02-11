import java.util.*;
public class NinetyShift{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int a[][] = new int[n][n];
	int i,j;
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++){
			a[i-1][j-1] = scan.nextInt();
		}
	}
	int b[][] = new int[n][n];
	int x=1,y;
	for(j=1;j<=n;j++){
		y=1;
		for(i=n;i>=1;i--){
			b[x][y] = a[i][j];
			y++;
			}
		x++;
	}
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++){
			System.out.print(b[i][j]+" ");
			}
		System.out.println();
	}
}
}