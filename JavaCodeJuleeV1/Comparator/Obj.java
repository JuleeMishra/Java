class Obj{
	int a = 15;
public void chk(){
	System.out.println(this);
	System.out.println(this.a);
}
public static void main(String[] args){
	Obj ob = new Obj();
	ob.chk();
	}
}