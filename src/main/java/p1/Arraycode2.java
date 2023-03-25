package p1;
import java.util.Scanner;
public class Arraycode2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("Enter the count of classes:");
Scanner sc=new Scanner(System.in);
int cls=sc.nextInt();
System.out.println("Enter the count of students:");
int stu=sc.nextInt();
int arr[][]=new int[cls][stu];
for(int i=0;i<cls;i++) {
	System.out.println("Inside the class:"+(i+1));
	for(int j=0;j<stu;j++) {
		System.out.println("Enter the marks of student:"+(j+1));
		arr[i][j]=sc.nextInt();
	}
}
System.out.println("----------------------");
for(int i=0;i<cls;i++) {
	System.out.println("Inside the class:"+(i+1));
	for(int j=0;j<stu;j++) {
		System.out.println("The marks of student:"+arr[i][j]);
		
	}

}
}
}