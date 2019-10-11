/*
Read data from TestInputFile.txt file and write output to TestOuputFile.txt. (If output file already present in the location then it will ovewrite the data).

Note: Check the read methods using javap java.io.FileInputStream
*/
import java.io.*;
class TestChar{
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
			FileReader fis = new FileReader("TestInputFile.txt");
			FileWriter fos = new FileWriter("TestOuputFile.txt");
			
			
			int c ;
			
			while ((c = fis.read())!=-1) { 
				System.out.println((char)c);
				fos.write(c);
			}
			
			fos.close();
	}
}