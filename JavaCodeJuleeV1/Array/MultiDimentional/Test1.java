class Test1{
	public static void main(String args[]){
		int firstArray[][] ={{8,9,10,11},{12,13,14,15}};
		int secondArray[][]= {{1,2,3,4},{5},{6,7,8}};
		System.out.println("This is the first array");
		display(firstArray);
		
		System.out.println("This is the second array");
		display(secondArray);
	}
		public static void display(int x[][]){
			for (int row=0; row<x.length; row++){
				for (int column=0; column<x[row].length; column++){
					System.out.print(x[row][column]+"\t");
				}
				System.out.println();
			}
		}
}

/**
C:\Users\julee\Desktop\JavaPractice>java Test
This is the first array
8       9       10      11
12      13      14      15
This is the second array
1       2       3       4
5
6       7       8
**/