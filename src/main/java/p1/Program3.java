package p1;
/**
 * 
 */

/**
 * @author 91702
 *

 */
import java.util.Scanner;
public class Program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
int count=1;
for(int i=1; i<=n;i++) {
for(int j=1; j<=n; j++) {
	System.out.print(count+" ");
	count=count+1;
}
System.out.println();
}
	}

}
