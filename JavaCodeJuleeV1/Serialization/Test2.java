/*
Read method return first charater unicode value in the form of integer. To check the end of stream we re having a predefined constant. 
Constant is called -1 constant. So if it is not equal to -1, means I would like to write data to xyz.txt file.
If = -1 means stream is ended.
Steps
1) Create Input and output channels
2) Read the data from surce file
3) Hold the data into variable
4) write the data to target file
5) close the channels
*/
import java.io.*;
class Test2 
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		FileReader fis = new FileReader("xyz.txt");//read the data in char format internally
		FileWriter fos = new FileWriter("xyz_out.txt");//write

		int c ;
		while ((c = fis.read())!= -1)
		{
			//System.out.println(c); //unicode values printed in char format
			System.out.println((char)c); //typecast c to char
			fos.write(c);
		}
		fis.close();//close the connection to avoid data loss
		fos.close();
	}
}

/***
Output pattern in xyz_out.txt:
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