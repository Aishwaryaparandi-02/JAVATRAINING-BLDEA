package p1;
import java.util.Arrays;
public class Arrayeql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {10,30,25,68,40,15,98,78,144,71,54,8};
int arr2[]= {40,15,98,144,71,54,78,10,30,25,68,8};
Arrays.sort(arr1);
Arrays.sort(arr2);
if(arr1.length==arr2.length) {
	for(int i=0;i<arr1.length;i++) {
		if(arr1[i]==arr2[i]) {
			System.out.println("Arrays not equal");
			System.exit(0);
			
		}
	}
	System.out.println("Arrays are equal");
}
else {
	System.out.println("Arrays are not equal");
}
	}
}
