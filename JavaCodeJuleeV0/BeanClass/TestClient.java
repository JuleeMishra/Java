class TestClient{
	public static void main(String[] args){
		EmpBean eb1= new EmpBean();
		eb1.setEid(111);
		eb1.setEname("Julee");
		
		int eid= eb1.getEid();
		System.out.println(eid);
		String Ename = eb1.getEname();
		System.out.println(Ename);
		
		EmpBean eb2= new EmpBean();
		eb2.setEid(222);
		eb2.setEname("Siya");
		
		int eid1= eb2.getEid();
		System.out.println(eid1);
		String Ename1 = eb2.getEname();
		System.out.println(Ename1);
	}
}