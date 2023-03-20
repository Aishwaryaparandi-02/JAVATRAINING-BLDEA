package p1;
/**
 * 
 */

/**
 * @author 91702
 *
 */

import java.util.Scanner;
public class Program6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
int count;
for(int i=1;i<=n; i++) {
	count=i;
	for(int j=1; j<=i; j++) {
		System.out.print(count+" ");
		count=count+2;
	}
	System.out.println();
}
	}

}
