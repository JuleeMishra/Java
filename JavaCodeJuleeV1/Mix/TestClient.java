class  TestClient
{ 
	
	public static void main(String[] args) 
	{
		BeanClass b = new BeanClass();
		b.setName("Julee");
		b.setAge(28) ;
		String ID = b.getID();
		System.out.println(ID);
		int Age = b.getAge();
		System.out.println(Age);
	}
}
