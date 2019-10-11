/*
By using BufferedInputStream it is not possible to read the data line by line.

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
class Test4
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
	 /* File f = new File("Julee1.txt");
		FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fis));
	*/
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Julee1.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Julee1_out.txt"));
			
		int c ;
		while ((c = bis.read())!= -1)
		{
			System.out.println((char)c); //typecast c to char
			bos.write(c);
			
		}
		bis.close();//close the connection to avoid data loss
		bos.close();
	}
}
/***
Output pattern in Julee1_out.txt:
H
i

J
u
l
e
e
.



H
o
w
***/
 
