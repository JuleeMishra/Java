
public class A {
	
	public static void main(String[] args) {
		String name = "Julee";
		String name1 = "Julee";
		String name2 = new String("Julee").intern();
		System.out.println(name.hashCode()+" "+name1.hashCode()+" "+name2.hashCode());// a=10 b= 15
		
	}

}
