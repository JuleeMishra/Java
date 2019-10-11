public class Arrays{
	
	public static void printArray(int[][] arry){
		System.out.println("Original array");
		for(int i=0; i<arry.length; i++){
			for(int j=0; j<arry[0].length; j++){
				System.out.print(arry[i][j]+" ");
			}
			System.out.println("\t");
		}
	}
	
	public static void swapCol(int c1, int c2, int[][] a1){
		System.out.println("swap two columns in an array");
		for(int i=0; i<a1.length; i++){
			 int temp = a1[i][c1] ;
			 a1[i][c1] = a1[i][c2];
			 a1[i][c2] = temp;
			 System.out.println(a1[i][c1]+"  "+a1[i][c2]);
		}	
	}
	public static String argmax(int[][] a1){
		System.out.println("position of index where maximum number exist");
		int maxNum =0;
		int maxRow =0;
		int maxCol =0;
		for (int i=0; i<a1.length; i++){
			for(int j=0; j<a1.length; j++){
				if(a1[i][j]>maxNum){
					maxNum = a1[i][j];
					maxRow = i ;
					maxCol = j ;
				}
			}
		}
		return "maxNum: "+maxNum+" "+"maxRow: "+maxRow+" "+"maxCol: "+maxCol;
	}
	

	
	
	public static void fillX(char[][] b){
		System.out.println("Create X with stars");
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b.length; j++){
				if(j==i || j==b.length-i-1){
					b[i][j]='*';
				} else {
					b[i][j]=' ';
				}
				System.out.print(b[i][j]+" ");
			}
			System.out.println("\t");
		}
		
	}
}


/*
class ArrayTests{
	public static void main(String args[]){
		int[][] a1= {{1,2,3,4},  [0,0] [0,1] [0,2] [0,3] [0,4]
					 {5,6,7,8},	 [1,0] [1,1] [1,2] [1,3] [1,4]
					 {9,1,2,3}}; [2,0] [2,1] [2,2] [2,3] [2,4]
		Arrays.swapCol(0,1,a1);  [3,0] [3,1] [3,2] [3,3] [3,4]
		Arrays.printArray(a1);   [4,0] [4,1] [4,2] [4,3] [4,4]
		
		
}
		
		*  
		
*/