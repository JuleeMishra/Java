// if all the three variables have the same name keyword like "this", "super" are used to distinguish the variable
class Parent {
	int a = 10;
	int b = 20;

}
class Child extends Parent{
	int a =100;
	int b = 200;
	void add(int a,int b){
		System.out.println(a+b);//local
		System.out.println(this.a+this.b);//current instance variable
		System.out.println(super.a+super.b);//super instance variable 
	}
	public static void main(String[] args) {
		new Child().add(1000, 2000);
	}
}