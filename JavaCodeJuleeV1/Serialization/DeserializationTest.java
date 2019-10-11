import java.io.* ;
class DeserializationTest 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("abc1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Emp e = (Emp)ois.readObject();
		System.out.println(e.eid+"         "+e.ename);
	}
}
