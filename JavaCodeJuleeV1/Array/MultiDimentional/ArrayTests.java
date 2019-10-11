/*
int 
*/
class ArrayTests{
	public static void main(String[] args){
		int[][] a1= {{1,2,3,4},
					 {5,6,7,8},
					 {9,1,2,3}};
		Arrays.printArray(a1);
		Arrays.swapCol(0,1,a1);
		Arrays.printArray(a1);	
		
		String argmax=Arrays.argmax(a1); //find maximum in the array
		System.out.println(argmax);
		
		char[][] b = new char[5][5];
		Arrays.fillX(b);
		
		
	}
}
