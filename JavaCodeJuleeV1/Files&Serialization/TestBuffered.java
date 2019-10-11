/*
Read data from TestInputFile.txt file and write output to TestOuputFile.txt. 
(If output file already present in the location then it will ovewrite the data).

Note: Check the read methods using javap java.io.FileInputStream
*/
import java.io.*;
class TestBuffered{
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
			FileReader fis = new FileReader("TestInputFile.txt"); //1st line
			BufferedReader br = new BufferedReader(fis);             //2nd line
			// or instead of 1st and 2nd line
			// new BufferReader(new FileReader("TestInputFile.txt"));
			
			FileWriter fos = new FileWriter("TestOuputFile.txt");
			BufferedWriter bw = new BufferedWriter(fos);
			
			//new BufferWriter(new FileWriter("TestOuputFile.txt"));
			
			
			String Line ;
			
			while ((Line = br.readLine())!=null) { 
				System.out.println(Line);
				bw.write(Line); //output not written line by line in output file
				bw.newLine(); ////output written with new line.
				}
			
			br.close();
			bw.close();
	}
}