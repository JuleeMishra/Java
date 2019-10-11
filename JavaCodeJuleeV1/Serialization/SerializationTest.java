/*
Serialization is transffering data from one layer to another layer. Example: your application contains different types of layers like DB layer,JDBC, Presentation
layer,Buisiness layer,request gathering layer etc. So if we want to transffer data between these layers , your class must implements interface 
called serialisable interface.
serialisable interface is markable interface it doesn't contain any methods, but whenever your class is implementing that interface your class is
acquiring some capabilties to perform serialisation , those capabilties are provided by JVM.
The process of converting java object to .txt file or network supported form is called serialisation.
The process of reading object from .txt file is called Deserialisation.
Always two classes are required for serialisation and Deserialisation method.
1) Serialisation Method.
a) FileOutputStream
b) ObjectOutputStream -->To write the data

2) Deserialisation Method.
a)FileInputStream
b)ObjectInputStream
*/
import java.io.* ;
class  SerializationTest implements Serializable
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		Emp e = new Emp(111, "Julee");
		FileOutputStream fos = new FileOutputStream("abc1.txt"); //fos is abc.txt file
		ObjectOutputStream oos = new ObjectOutputStream(fos); // like to write object to text file fos 

		oos.writeObject(e); // Writing employee object  
		System.out.println("Serialisation proess completed: ");
		//I would like to trnsffer abc.txt file through network
	}
}
