package p1;
/**
 * 
 */

/**
 * @author 91702
 *
 */
import java.util.Scanner;
public class Code6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the required marks:");
		int marks=sc.nextInt();
		if(marks<40) {
			System.out.println("Result came out is fail:");
		}
		else if(marks<70) {
			System.out.println("Result came is out is firstclass");
		}
		else 
			System.out.println("Result came out is distinction");
		// TODO Auto-generated method stub

	}

}
