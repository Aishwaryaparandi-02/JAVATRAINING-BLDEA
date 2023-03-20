package p1;
import java.util.Scanner;
public class Code3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:");
int n=sc.nextInt();
for(int i=1; i<=n; i++) {
	for(int j=1;j<=n;j++) {
		if(i==1||i==n||j==1||j==n) {
			System.out.print("$");
		}
		else {
			System.out.print("-");
		}
		
	}
	System.out.println();
}
		// TODO Auto-generated method stub

	}

}
