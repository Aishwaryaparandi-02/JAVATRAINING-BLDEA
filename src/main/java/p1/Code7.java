package p1;
/**
 * 
 */

/**
 * @author 91702
 *
 */
import java.util.Scanner;
public class Code7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
for(int i=1;i<=n;i++) {
	for(int j=1;j<n;j++) {
	if(i==j||i==n) {
		System.out.print("$"+" ");
	
	}
	else
	{
		System.out.print("#"+" ");
	}
	
	}
	System.out.println();
}
	}

}
