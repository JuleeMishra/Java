/*
Since read and write operation is character by charater, so to read millions character , application
has to perform read and write operation millions time. Hence there is performance decrease.
So we should always go for line oriented streams
For line oriented stream we use bufferedStream.

Normal stream : gets the data from hard disk
-----------------
FileInputStream
FileOutputStream
FileReader
FileWriter

Buffered Stream : gets the data from buffered memory
-----------------
BufferedInputStream
BufferedOutputStream
BufferedReader
BufferedWriter

Buffered streams are developed based on normal streams.


*/
import java.io.*;
class Test3
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader("Julee.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("Julee_Out.txt")); 
		
		String line ;
		while ((line = br.readLine())!= null)
		{
			System.out.println(line); //typecast c to char
			bw.write(line);
			bw.newLine();
		}
		br.close();//close the connection to avoid data loss
		bw.close();
	}
}
/***
Output pattern in Julee_Out.txt:
Hi Julee.
How are you doing ?
Its great to learn Java with you...
***/

