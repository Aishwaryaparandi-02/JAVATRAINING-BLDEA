package p1;
/**
 * 
 */

/**
 * @author 91702
 *
 */
import java.util.Scanner;
public class Code8 {

	/** * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=sc.nextInt();
for(int i=0;i<n; i++) {
	for(int j=0; j<n; j++) {
		if(i == 0||i == (n-1)|| j == 0|| j == (n-1)|| j == n/2||i == n/2||i == j ||i+j == (n-1)||i+j == n/2||j-i == n/2||i-j == n/2||i+j==(n-1)+n/2) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
	}
	System.out.println();
}
	}

}
