
public class Array1 {
	public static void main(String[] args) {
		int[] a = {10,20,30,40}; //integer array a = assign the values 
		//To print the array we have three approach
		// 1st approach
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		// 2nd approach by for loop
		for (int i = 0; i < a.length ;i++) //index starts from zero upto length(var name) will be incremented
		{
			System.out.println(a[i]);
		}
		
		//3rd approch is for each loop 
		for (int aa :a) // right hand side of collon is data which we want to print i.e "a" and left hand side is int data 
		{
			System.out.println(aa);
		}
	}

}
