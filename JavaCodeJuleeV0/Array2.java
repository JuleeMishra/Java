
public class Array2 {
	public static void main(String[] args) {
		int[] a= new int [5]; //instantiation i.e declare integer with size of 5. Array is created with default values of 0
		for(int aa:a);
		{
			System.out.println(aa);
		}
		boolean[] b = new boolean [3];
		for (boolean bb : b);
		{
			System.out.println(bb);
		}
		A[] a1 = new A[3]; // A is a user defined type
		for (A a2:a1);
		{
			System.out.println(a2);
		}
	
	}

}
