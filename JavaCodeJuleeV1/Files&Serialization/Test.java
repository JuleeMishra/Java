/*
Read data from TestInputFile.txt file and write output to TestOuputFile.txt. (If output file already present in the location then it will ovewrite the data).

Note: Check the read methods using javap java.io.FileInputStream
*/
import java.io.*;
class Test{
	public static void main(String[] args) throws FileNotFoundException,IOException {
		//create a byte oriented channel
			FileInputStream fis = new FileInputStream("TestInputFile.txt");
			FileOutputStream fos = new FileOutputStream("TestOuputFile.txt");
			
			//Read the data
			int c ;
			//read() returns 1st character unicode value in the form of  integer. C stores unicode values. -1 represents characters or stream not available
			while ((c = fis.read())!=-1) { 
				System.out.println((char)c);
				fos.write(c);
			}
			//Close the channel
			fis.close(); //to overcome data loss. Its always recommended
			fos.close();
	}
}