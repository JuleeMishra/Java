ratna5256@gmail.com 
1st Part video - 41 vedios
https://www.youtube.com/watch?v=gKqBPq3i62c&list=PLd3UqWTnYXOkIbQ-9MfOK4HOGo0Hdtuti
2nd Part video - 41 vedios
https://www.youtube.com/playlist?list=PL8ouULfa9Bh6TnRW3TOzXhbIryqaQ9MuO
3rd Part video - 16 vedios
https://www.youtube.com/playlist?list=PLd3UqWTnYXOncH32Ov0zmqK-hdkOKVIXt


public class Assignment1 {
	int a = 100; // instance variable a and b
	int b = 200;
	
	public static void main(String[] args) {
		Assignment1 t = new Assignment1();
		System.out.println(t.a);
		System.out.println(t.b);
		Assignment1.m1();
	}
	static void m1(){
		Assignment1 t = new Assignment1();// 
		System.out.println(t.a);
		System.out.println(t.b);
		
	}
	

}
-------------------------------------------------------------------------------------------------------

public class Assignment2 {
	int a = 100;
	int b = 50;
	static int c = 20;
	static int d = 30;
	public static void main(String[] args) {
		Assignment2 t = new Assignment2();
		t.m1();
		Assignment2.m2();
	}
	void m1(){
		System.out.println("This is for instance method"+"  "+a);
		System.out.println("This is for instance method"+"  "+b);
		//Assignment2 t = new Assignment2();
		System.out.println("This is for instance method"+"  "+Assignment2.c);
		System.out.println("This is for instance method"+"  "+Assignment2.d);
		
	}
	static void m2(){
		Assignment2 t = new Assignment2();
		System.out.println("This is for static method"+"  "+t.a);
		System.out.println("This is for static method"+"  "+t.b);
		System.out.println("This is for static method"+"  "+Assignment2.c);
		System.out.println("This is for static method"+"  "+Assignment2.d);
		}

}

----------------------------------------------------------------------------------------------------------

 //check default values of instance variable
public class DefaultValues {
 
	int a;
	boolean b;
	
public static void main(String[] args) {
	
	DefaultValues t = new DefaultValues();
	System.out.println(t.a);
	System.out.println(t.b);
}
}


/*  // check default values of static variable as below
  public class DefaultValues {
 
	static int a;
	static boolean b;
	
public static void main(String[] args) {
	
	System.out.println(DefaultValues.a);
	System.out.println(DefaultValues.b);
}
}
*/
// check default values of local variable as below
/*public class DefaultValues {
 
	
public static void main(String[] args) {

	 int a;
	 boolean b;
	System.out.println(a); //this will always show a error saying "local variable a may not have been initialized"
	System.out.println(b); // so conclusion is no default values are there for local variables. We always have to initialize the local varialble.
}
}
*/
---------------------------------------------------------------------------------------------------
// example 1 method without parameters
class MethodExample1 {
	void m1(){ //instance method
		System.out.println("m1 method ");
	}
	static void m2(){ //static method
		System.out.println("m2 method ");
	}
	public static void main(String[] args) { // main method
		MethodExample1 t = new MethodExample1();
		t.m1();
		MethodExample1.m2();
		
	}

}

---------------------------------------------------------------------------------------
// example 2 method with parameters of primitive values
class MethodExample2 {
	void m1(int a, char ch){ //instance method
		System.out.println("m1 method ");
		System.out.println(a);
		System.out.println(ch);
	}
	static void m2(String str, double d){ //static method
		System.out.println("m2 method ");
		System.out.println(str);
		System.out.println(d);
	}
	public static void main(String[] args) { // main method
		MethodExample2 t = new MethodExample2();
		t.m1(43, 'J');
		MethodExample2.m2("Julee", 10.5);
		
	}

}

------------------------------------------------------------------------------------------
// example 3 methods with objects/class as parameters. This is generally used in real time project.
class X{}
class Emp{}
class Y{}
class student{}

class MethodExample3 {
	void m1(X x, Emp e){ //instance method with X and Emp as class variable type parameters. It expect class as argument.
		System.out.println("m1 method ");
	}
	static void m2(Y y, student s){ //static method
		System.out.println("m2 method ");
		
	}
	public static void main(String[] args) { // main method
		MethodExample3 t = new MethodExample3();
		X x1 = new X();
		Emp e1 = new Emp();
		t.m1(x1,e1);
		Y y1 = new Y();
		student s1 = new student();
		MethodExample3.m2(y1,s1);
		
		
	}

}

---------------------------------------------------------------------------------------------------------
// Method calling
public class MethodExample4 {
	void m1(){
		m2(); //instance method calling
		System.out.println("m1 method");
	}
	void m2(){
		m3(10);
		System.out.println("m2 method");
	}
	void m3(int a){
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		MethodExample4 t = new MethodExample4();
		t.m1();
	}

}
--------------------------------------------------------------------------------------------
//this keyword ..first priority goes to local variable
//inside the static method this keyword is not allowed
public class MethodExample5 {
	int a = 100;
	int b = 200;
	void m1(int a, int b){
		System.out.println(a+b);
		System.out.println(this.a+this.b);//300 //this keyword used to represent instance variable if both (instance and local variable have the same name)
	}
	public static void main(String[] args) {
		MethodExample5 t = new MethodExample5();
		t.m1(10,15);
	}

}
----------------------------------------------------------------------------------------------

public class Test {
	//instance variable
	int a = 100;
	int b= 200;
	//static method below
public static void main(String[] args) { // main method only this method executed by JVM.
	
	Test t = new Test();
	t.m1(); // calling instance method in main for execution of the instance method
	System.out.println(t.a);// calling instance variable through object
	System.out.println(t.b);
}
void m1(){ //instance method
	System.out.println(a);
	System.out.println(b);
	

}
}
----------------------------------------------------------------
// default Construcor example 
public class MethodExample6 {
	void m1(){
		System.out.println("m1 method");
	}
	/* default constructor examle
	   MethodExample6()
	   { 
	   //empty implementation
	   }
	 */
	public static void main(String[] args) {
		MethodExample6 t = new MethodExample6();
		t.m1();
	}

}
-------------------------------------------------------------------------------------
/* 
 constructor with arguments
 */
public class Test {
	void m1(){
		System.out.println("m1 method");
	}
	// should declare all constructor If at least one constructor declaration is present then 
	Test(){
		System.out.println("0-arg constructor");
	}
	// declaration of user defined constructor example with argument
	Test(int a){
		System.out.println("1-arg constructor");
		
	}
	public static void main(String[] args) {
		Test t = new Test();
		Test t1 = new Test(10);
		t.m1();
		t1.m1();
	}

}
-------------------------------------------------------------------------------------------------
//Constructor with compilation error
/* 
 constructor with arguments
 */
public class Test {
	void m1(){
		System.out.println("m1 method");
	}
	
	// declaration of user defined constructor example with argument
	Test(int a){
		System.out.println("1-arg constructor");
		
	}
	public static void main(String[] args) {
		Test t = new Test();
		Test t1 = new Test(10);
		
	}

}
--------------------------------------------------------------------------------------------------
/* 
default values are created at the time of object creation
 */
public class Emp { //instance value
	int eid; //0 
	String ename;// null
	float esal; //0.0
	
	 
	void disp(){
		System.out.println("emp id ="+eid);
		System.out.println("emp name ="+ename);
		System.out.println("emp sal ="+esal);
	}
	
	public static void main(String[] args) {
		Emp e = new Emp();
		e.disp();
		}

}

//Output
emp id =0
emp name =null
emp sal =0.0

-----------------------------------------------------------------------------------------
/* 
 
 */
public class Emp3 { //instance var
	int eid = 111; //0 
	String ename = "Julee";// null
	float esal = 10000.87f; //0.0
	
	Emp3(){ 
		/*eid = 111; // if local variable is not initiated then this constructor by default take the values of instance var
		ename = "Ratan";
		esal = 10000.56f; */
	}
	 
	void disp(){
		System.out.println("emp id ="+eid);
		System.out.println("emp name ="+ename);
		System.out.println("emp sal ="+esal);
	}
	
	public static void main(String[] args) {
		Emp3 e = new Emp3();
		e.disp();
		;
	}

}
--------------------------------------------------------------------------------------------------------------------------

/* 
 
 */
public class Emp { //instance value
	int eid; //0 
	String ename;// null
	float esal; //0.0
	
	Emp(int eid,String ename,float esal ){ // local value of EMP constructor
		this.eid = eid; // assign local var to instance var 
		this.ename = ename;
		this.esal = esal;
	}
	 
	void disp(){
		System.out.println("emp id ="+eid);
		System.out.println("emp name ="+ename);
		System.out.println("emp sal ="+esal);
	}
	
	public static void main(String[] args) {
		Emp e1 = new Emp(111,"Ratan",10000);
		e1.disp();
		Emp e2 = new Emp(222,"anu",20000);
		e2.disp();
	}

}
-------------------------------------------------------------------------------------------------------------------------------------------------------
// one constructor can call another constructor using "this" keyword.
// example1 :   while executing 0-arg constructor I would like to call 1-arg constructor.


public class Test {
	Test(){
		this(10); //control will go to 1-arg constructor. this of parameter value of 1-argument constructor
		System.out.println("0-argument constructor");
	}
	Test(int a){
		this(10,20);
		System.out.println("1-argument constructor"); // control goes to 2-argument constructor
	}
	Test(int a, int b){
		System.out.println("2-argument constructor");// this will be executed first and return control to 2nd arg.
	}
	public static void main(String[] args) {
		Test t = new Test();
		
	}

}
--------------------------------------------------------------------------------------------------------------------

example 2: 
//Call to "this" statement should be in first inside the constructor logic.
// Below will throgh error

public class Test {
	Test(){
		System.out.println("0-argumen constructor");
		this(10); // this of parameter value of 1-argument constructor
	}
	Test(int a){
		System.out.println("1-argument constructor");
	}
	Test(int a, int b){
		System.out.println("2-argument constructor");
	}
	public static void main(String[] args) {
		Test t = new Test();
		
	}

}

Error:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Constructor call must be the first statement in a constructor

	at Test.<init>(Test.java:4)
	at Test.main(Test.java:13)
---------------------------------------------------------------------------------------------------
Example 3:
// One constructor will be able to call one constor at a time so only one "this" keyword is allowed inside a constructor.

public class Test {
	Test(){
	    this(10); // this of parameter value of 1-argument constructor
	    this(10,20); // this of parameter value of 1-argument constructor
		System.out.println("0-arguments constructor");
		
	}
	Test(int a){
		System.out.println("1-argument constructor");
	}
	Test(int a, int b){
		System.out.println("2-argument constructor");
	}
	public static void main(String[] args) {
		Test t = new Test();
		
	}

}

Error:
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Constructor call must be the first statement in a constructor

	at Test.<init>(Test.java:4)
	at Test.main(Test.java:13)
----------------------------------------------------------------------------------------------------------------------------
Example 4:
/* Formats of object creation.
1) Named object creation 
example: Test t = new Test();  --t is reference variable 
2) Nameless Approach
example: new Test(); ---- Test is class name  
*/

public class Test {
	Test(){
		System.out.println("0-argumen constructor");
		
	}
	Test(int a){
		System.out.println("1-argument constructor");
	}
	Test(int a, int b){
		System.out.println("2-argument constructor");
	}
	public static void main(String[] args) {
		//named approach
		Test t = new Test();
		Test t1 = new Test(10);
		Test t2 = new Test(10,20);
		//Nameless approach
		new Test();
		new Test(10);
		new Test(10,20);
		
	}

}
----------------------------------------------------------------------------
// Instance block will run first then constructor will execute
public class InstBlock {
	InstBlock(){
		System.out.println("0-arg constructor execution");
	}
	{
		System.out.println("Instance block execution");
	}
	public static void main(String[] args) {
		new InstBlock();
	}
	

}
--------------------------------------------------------------------------------------------------------
// example3: Every time the constructor called, instance block will get executed each time.
// Every time the constructor called, instance block will get executed each time.
public class InstBlock1 {
	InstBlock1(){
		System.out.println("0-arg constructor execution chk");
	}
	InstBlock1(int a){
		System.out.println("1-arg constructor execution chk");
	}
	InstBlock1(int a,int b){
		System.out.println("2-arg constructor execution chk");
	}
	{
		System.out.println("Instance block execution chk");
	}
	public static void main(String[] args) {
		InstBlock1 t = new InstBlock1();
		InstBlock1 t1 = new InstBlock1(10);
		InstBlock1 t2 = new InstBlock1(10,20);
		
	}
	

}
------------------------------------------------------------------------------------------------
//Example 4:
// Inside one class it is possible to have multiple constructor but the execution will be top to bottom
public class InstBlock2 {
	InstBlock2(){
		System.out.println("0-arg constructor execution ");
	}
	InstBlock2(int a){
		System.out.println("1-arg constructor execution ");
	}
	{
		System.out.println("Instance block-1 execution ");
	}
	{
		System.out.println("Instance block-2 execution ");
	}
	public static void main(String[] args) {
		InstBlock2 t = new InstBlock2();
		InstBlock2 t1 = new InstBlock2(10);
		
		
	}
	

}
----------------------------------------------------------------------------------------------------
//Static Block
//Example 1:
// static block will executed only one time with the creation of .class file by JVM. Instance block are executed every time during 
// object creation
public class StaticBlock1 {
	StaticBlock1(){
		System.out.println("0-arg constructor execution ");
	} 
	StaticBlock1(int a){
		System.out.println("1-arg constructor execution ");
	}
	{
		System.out.println("Instance block-1 execution ");
	}
	{
		System.out.println("Instance block-2 execution ");
	}
	static 
	{
		System.out.println("Static Block-1 execution ");
	}
	static 
	{
		System.out.println("Static Block-2 execution ");
	}
	
	public static void main(String[] args) {
		StaticBlock1 t = new StaticBlock1();
		StaticBlock1 t1 = new StaticBlock1(10);
		
		
	}
	

}

Output: 
Static Block-1 execution 
Static Block-2 execution 
Instance block-1 execution 
Instance block-2 execution 
0-arg constructor execution 
Instance block-1 execution 
Instance block-2 execution 
1-arg constructor execution 
------------------------------------------------------------------------------------------------------------------------
//Static Block
//Example 2:
// Since no object is created , Instance block will not be executed. However When we compile the .java file it will create a .class file. So at the time of
//.Class file creation static block will be executed.
//

public class StaticBlock1 {
	{
		System.out.println("Instance block-1 execution ");
	}
	{
		System.out.println("Instance block-2 execution ");
	}
	static 
	{
		System.out.println("Static Block-1 execution ");
	}
	static 
	{
		System.out.println("Static Block-2 execution ");
	}
	
	public static void main(String[] args) {
			
		
	}
	

}

Output:
Static Block-1 execution 
Static Block-2 execution 
--------------------------------------------------------------------------------------------------------------------------
To execute static block it is mandatory to have main method. If main method is not present inside the class it should be callled through
another class having main method through "forename" method.
Cause for this mandate is becauze at the time of execution of .java file JVM loads .class file into memory and at the time of loading Static block will
get executed.  
// Calling class B and C who don't have their own main method
public class A {
	static
	{
		System.out.println("static block A");
	}
	public static void main(String[] args) 
	{
	    Class.forName("B"); // this will throw error Unhandled exception type ClassNotFoundException
		Class.forName("C"); // Unhandled exception type ClassNotFoundException
	}

}

// Class B without main method called in Class A 

public class B {
	static {
	System.out.println("B class static block");
	}

}


// Class C without main method called in Class A
public class C {
	static{
	System.out.println("C class static block");
	}

}

output: 
static block A
B class static block
C class static block
----------------------------------------------------------------------------------------------------------------
//Static block are used to initialize the value of static variable
public class StaticBlockUse {
	static int eid;
	static {
		eid = 222 ; // at the time of class loading static block will  execute so inialized the value of eid
	}
	static void m1(){
		System.out.println(StaticBlockUse.eid);
		
	}
	public static void main(String[] args) {
		StaticBlockUse.m1();
	}

}
-----------------------------------------------------------------------------------------------
//Application without inheritance. Same method repeated in class AWI, AWI1 and AWI2. To shorten the code and remove the duplicacy 
// check class Inheritance

public class AWI {
	void m1(){}
	void m2(){}
	public static void main(String[] args) {
		
	}
	

}

//Application without inheritance. Same method repeated in class AWI, AWI1 and AWI2. To shorten the code and remove the duplicacy 
// check class Inheritance
public class AWI1 {
	void m1(){}
	void m2(){}
	void m3(){}
	void m4(){}
	public static void main(String[] args) {
		
	}

}

//Application without inheritance. Same method repeated in class AWI, AWI1 and AWI2. To shorten the code and remove  
//the duplicacy run Class AWI2 extends AWI1 class
/*
 public class AWI2 {
 
	void m1(){}
	void m2(){}
	void m3(){}
	void m4(){}
	void m5(){}
	void m6(){}
	public static void main(String[] args) {
		
	}

}
*/
 public class AWI2 extends AWI1 {
   // void m1(){}
	//void m2(){}
	//void m3(){}
	//void m4(){}
	 void m5(){}
	 void m6(){}
	public static void main(String[] args) {
		
	}

}
--------------------------------------------------------------------------------------------

class A1 
{	void m1(){System.out.println("m1 method");}
	void m2(){System.out.println("m2 method");}
}
class B1 extends A1
{	void m3(){System.out.println("m3 method");}
	void m4(){System.out.println("m4 method");}
}
class c1 extends B1 
{	void m5(){System.out.println("m5 method");}
	void m6(){System.out.println("m6 method");}
	public static void main(String[] args) 
	{	A1 a = new A1(); 
		a.m1();a.m2();
		B1 b = new B1();
		b.m3(); b.m4();b.m1();b.m2();
		c1 c = new c1();  // object should be created for child class
		c.m1();c.m2();c.m3();c.m4();c.m5();c.m6();
	}
}
Output:
m1 method
m2 method
m3 method
m4 method
m1 method
m2 method
m1 method
m2 method
m3 method
m4 method
m5 method
m6 method
----------------------------------------------------------------------------------------------------------------
// if all the three variables have the same name then keyword like "this", "super" are used to distinguish the variable
class Parent {
	int a = 10;
	int b = 20;

}
class Child extends Parent{
	int a =100;
	int b = 200;
	void add(int a,int b){
		System.out.println(a+b);//local   3000
		System.out.println(this.a+this.b);//current instance variable   300
		System.out.println(super.a+super.b);//super/parent class instance variable    30 
	}
	public static void main(String[] args) {
		new Child().add(1000, 2000);
	}
}
------------------------------------------------------
//if parent and child class have the same method then priority goes to
//child class.
class Parent {
	void m1(){System.out.println("Parent class m1 method");}
}
class Child extends Parent{
	void m1(){System.out.println("Child class m1 method");}
	void m2()
	{
		m1(); // execution priority goes to child class method
		m1();
	}
	public static void main(String[] args) {
		new Child().m2();
	}
}
Output:
Child class m1 method
Child class m1 method
------------------------------------------------------------------
//if parent and child class have the same method then priority goes to
//child class. to distinguish the methods use keyword "this" and "super"
class Parent {
	void m1(){System.out.println("Parent class m1 method");}
}
class Child extends Parent{
	void m1(){System.out.println("Child class m1 method");}
	void m2()
	{
		this.m1(); // to distinguish the methods use keyword "this" and "super"
		super.m1();
	}
	public static void main(String[] args) {
		new Child().m2();
	}
}
Output:
Child  class m1 method
Parent class m1 method
------------------------------------------------------------------------
Inheritance:  Super Class constructors
------------------------------------
// use super keyword to refer parent class constructor and this for current
class Parent 
{
	Parent(){System.out.println("Parent class 0-arg constructor");}
}
class Child extends Parent{
	Child()
	{
		this(10);// while executing Child class 0-arg m2 constructor I would like to call child constructor with 1-arg
		System.out.println("Child class 0-arg constructor");
	}
	Child(int a)
	{
		super();
		System.out.println("Child class 1-arg constructor");
	}
	public static void main(String[] args) {
		new Child();
		
	}
}

output:
Parent class 0-arg constructor
Child class 1-arg constructor
Child class 0-arg constructor
--------------------------------------------------------------------
//inside the constructor "this" keyword must be first statement and so for "super"
eg:
class Parent {
	Parent(){System.out.println("Parent class 0-arg m1 constructor");}
}
class Child extends Parent{
	Child()
	{
		this(10);// while executing Child class 0-arg m2 constructor I would like to call child constructor with 1-arg
		System.out.println("Child class 0-arg m2 constructor");
	}
	Child(int a)
	{
		
		System.out.println("Child class 0-arg m2 constructor");
		super();
	}
	public static void main(String[] args) {
		new Child();
		
	}
}

Error:
InheritanceEg3.java:14: error: call to super must be first statement in constructor
                super();
                     ^
1 error
-------------------------------------------------------------------------------------
// inside child class we can call superclass constructor. It must be the first statement.
class Parent {
	Parent(){System.out.println("Parent class 0-arg constructor");}
}
class Child extends Parent{
	Child()
	{
		super();// inside child class we can call superclass constructor. It must be the first statement.
		System.out.println("Child class 0-arg constructor");
	}
	
	public static void main(String[] args) {
		new Child();
		
	}
}
--------------------------------------------------------------------------------
// inside child class we can call superclass constructor. It must be the first statement.
class Parent {
	// if no constructor is written then it means that it have 0-arg constructor with empty implementation. and it will not generate any error even while called by child class
}
class Child extends Parent{
	Child()
	{
		super();// inside child class we can call superclass constructor. It must be the first statement.
		System.out.println("Child class 0-arg constructor");
	}
	
	public static void main(String[] args) {
		new Child();
		
	}
}

output: 
Child class 0-arg constructor
-------------------------------------------------------------------------------------------------
// In below expected output should be "Child class 0-arg  constructor". but out here is different.
class Parent {
	Parent(){System.out.println("Parent class 0-arg  constructor");}
}
class Child extends Parent{
    //super();
	Child()
	{
		System.out.println("Child class 0-arg  constructor");
	}
	
	public static void main(String[] args) {
		new Child();
		
	}
}
 output:
Parent class 0-arg  constructor
Child class 0-arg  constructor

Points to be noted: If you do not mention any keyword for constructor like "this" and "super" then compiler will generate "super" keyword by default.
---------------------------------------------------------------------------------------------
// if keyword "this" or "super" not used in constructor then comiler will generate super() constructor on the top of each called
//constructor
class Parent {
	Parent(){System.out.println("Parent class 0-arg  constructor");}
}
class Child extends Parent{
	Child(){System.out.println("Child class 0-arg  constructor");}
	Child(int a)
	{
		//super(); compiler generated code
		System.out.println("Child class 1-arg  constructor");
	}
	
	public static void main(String[] args) {
		new Child();
		new Child(10);
	}
}

output:
Parent class 0-arg  constructor
Child class 0-arg  constructor
Parent class 0-arg  constructor
Child class 1-arg  constructor
-----------------------------------------------------------------------------------------------------

// This will raise a error becauze here super() keyword generated by compiler but no 0-arg constructor present in Parent class
class Parent {
	Parent(int a){System.out.println("Parent class 1-arg  constructor");}
}
class Child extends Parent{
	//super(); compiler generated code
	Child()
	{
		System.out.println("Child class 0-arg  constructor");
	}
	Child(int a)
	{
		//super(); compiler generated code
		System.out.println("Child class 1-arg  constructor");
	}
	
	public static void main(String[] args) {
		new Child();
		new Child(10);
	}
}

Error:
InheritanceEg8.java:8: error: constructor Parent in class Parent cannot be applied to given types;
        {
        ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
InheritanceEg8.java:12: error: constructor Parent in class Parent cannot be applied to given types;
        {
        ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
2 errors
------------------------------------------------------------------------------------
Note down all the points from Corejava-OOPs inheritance Part -3
1) To call parent class constructor use "super" keyword inside child class constructor.
2) Inside child class constructor super keyword must be first statement.
3) Inside the constructor it is not possible to use this and super keyword both at a time.
4) In child class we are calling superclass 0-arg constructor. In parent class there are no 0-arg constructor then default constructor will be created.
5) Compiler generates super keyword at first line of constructer if we do not mention any suer or this keyword in our constructor.
------------------------------------------------------------------------------------
Parent class Instance block
------------------------------------------------------------------------------------
example1: 
source file: InheritanceEg10.java
//Parent class Instance block
//example1: 
class Parent {
	{System.out.println("Parent class instance block");}
}
class Child extends Parent{
	{System.out.println("Child class instance block");}
	public static void main(String[] args) {
		new Child(); //instance block executed during object creation only.
		//new Child();		
	}
}
Output:
Parent class instance block
Child class instance block

/***
Child.java:3: error: illegal start of type
        super();//code is generated by compiler
        ^
Child.java:10: error: illegal start of type
        super();// code is generated by compiler
        ^
2 errors
***/
Example 2:
class Parent {
	{System.out.println("Parent class instance block");}
	//super();//code is generated by compiler// super() can be called only inside child class constructor
	Parent(){
		System.out.println("Parent class 0-arg constructor");
	}
}
class Text extends Parent{
	{System.out.println("Child class instance block");}
	//super();//error: illegal start of type/ error reason:super() can be called only inside child class constructor
	Text(){
		//super(); //compiler generated code
		System.out.println("Child class 0-arg constructor");
	}

	public static void main(String[] args) {
		new Text();  // first instance block executed then constructor		
	}
}

Result:
Parent class instance block
Parent class 0-arg constructor
Child class instance block
------------------------------------------------------------------------------------
Static block Instance block
------------------------------------------------------------------------------------
Example 1:
class Parent {
	{System.out.println("Parent class Instance block");}
	Parent(){
		System.out.println("Parent class 0-arg constructor");
	}
	static {
	System.out.println("Parent class Static block ");
	}
	
}
class Child extends Parent{
	{System.out.println("Child class Instance block");}
	Child(){
		System.out.println("Child class 0-arg constructor");
	}
	static {
		System.out.println("Child class Static block ");
		}

	public static void main(String[] args) {
		new Child();
				
	}
}
output:
Parent class Static block  //while loading class static block will execute. so for one class only one time execution of static block
Child class Static block
Parent class Instance block // Instance block and constructor will execute each time the object created
Parent class 0-arg constructor
Child class Instance block
Child class 0-arg constructor
----------------------------------------------------------------------------------------------------------------
Polymorphism:
Ability to appear in more than one form. So a thing with different behaviour
Types:
1)Compile time polymorphism/ Static binding/ Early binding
we can achieve compile time polymorphism using method overloading concept.
2) Run time polymorphism/Dynamic polymorphism/Late binding
We can achieve run time polymorphism by Method overriding concept.

Types of overloading:
1)Method overloading
2)Constructor overloading
3)Operator overloading

1)Method overloading:
Methods of a class with same name but different in a) Number of argument b)data types called overloaded method.

example
---------
// ing
public class Test {
	void m1(){
		System.out.println("Method with 0-arg");
	}	
	void m1(int a){
		System.out.println("Method with 1-arg");
	}	
	void m1(char a){
		System.out.println("Method with 1-arg but diff data type");
	}	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1('a');
	}

}
output:
Method with 0-arg
Method with 1-arg
Method with 1-arg but diff data type
---------------------------------------------------------------------
//overloaded constructors
class Test {
	Test(int a){System.out.println("int constructor");}
	Test(int a, int b){System.out.println("int int constructor");}
	Test(char a){System.out.println("char constructor");}
	public static void main(String[] args) {
		Test t = new Test(10);
		Test t1 = new Test(10,20);
		Test t2 = new Test('a');
		}

}
output:
int constructor
int int constructor
char constructor
-----------------------------------------------------------------------
one Operator with more than one behaviour called operator overloading.
-----------------------------------------------------------------------
example: "+" used to concatenate string as well as do summation for integer.---> implicit and take care by JVM.
explicitly java does not support operator overloading.
-----------------------------------------------------------------------
Overriding: 
Overriding means replace a thing with another.
To achieve overriding we alwayas need two java class with inheritance(parent-child) relationship.
Below Rules to be followed while overriding.
1) Overriden and overriding method signature must be same.
2) Overriden and overriding method return type should be same at primitive level(byte,short,int,long,float,double,char,boolean.....primitive datatype).
3) It is possible to change return type of method using covarient concept at class level.
4) Final method overridding is not possible. 
  Note: If we add final keyword to class inheritance is not possible. Likewise if we add final keyword in method overriding is not possible. 
  In the same way final variable also can not be modified.
5) It is not possible to override static method in Java because Static method are specific to class. So this concept is also called method hiding concept.
6) It is not possible to override a private method of particular class. Because access permisiion is limited to the particular class and not from outside class even there is a child class of the class containg overriden method.
//overriden and overriding method signature must be same  
class Parent {
	void marry() //overriden method signature
	{System.out.println("Black girl");}
}
class Child extends Parent{
	void marry()//overriding method signature
	{System.out.println("Red girl");}
	public static void main(String[] args) {
		Child c = new Child();
		c.marry(); //new Child().marry(); //output: Red girl
	}
}

output:
Red girl
------------------------------------------------------------------------
//Overriden and overriding method return type should be same at primitive level(byte,short,int,long,float,double,char,boolean.....primitive datatype).

class Parent {
	float marry() //overriden method
	{
		System.out.println("Black girl");
		return 10.5f;
	}
}
class Child extends Parent{
	int marry()//overriding method
	{
		System.out.println("Red girl");
		return 10;
		}
	public static void main(String[] args) {
		Child c = new Child();
		c.marry(); //new Child().marry();
	}
}

Output:
return type int is not compatible with float
-----------------------------------------------------------------------------
// It is possible to change return type of method using covarient concept at class level.
class Animal
{}
class Dog extends Animal
{}
class Parent {
	Animal marry() //void marry() //overriden method
	{
		System.out.println("Black girl");
		/*Animal a = new Animal();
		Animal a ;
		*/
		return new Animal();
	}
}
class Child extends Parent{
	Dog marry() //void marry()//overriding method
	{
		System.out.println("Red girl");
		/*Dog d = new Dog();
		return d ;
		*/
		return new Dog();
		}
	public static void main(String[] args) {
		/*Child c = new Child();
		c.marry();
		*/
		new Child().marry(); //Output: Red girl
	}
}
----------------------------------------------------------------------------------------------------
// Final methods overriding is not possible
class Parent {
	final void marry() //overridden method
	{System.out.println("Black girl");}
}
class Child extends Parent{
	void marry() //overriding method
	{System.out.println("Red girl");}
	public static void main(String[] args) {
		/*Child c = new Child();
		c.marry();
		*/
		new Child().marry();
	}
}
Error:
 marry() in Child cannot override marry() in Parent
        void marry() //overriding method
             ^
  overridden method is final
-------------------------------------------------------------------------------------------------------
// Final variables can not be modified
class Child {
	public static void main(String[] args) {
		final int a = 10; //local variable with final keyword
		a = a+10; // final variable a can not be modified
		System.out.println(a);
	}
}

Error:
OverridingMethodEg5.java:5: error: cannot assign a value to final variable a
                a = a+10; // final variable a can not be modified
                ^
1 error
------------------------------------------------------------------------------
Now a question here is : If a class is final, do we consider the inside variable and method also final?
answer is "No" for variable and "Yes" for method
example:

public class Test {
	int a=100; // not a final
	void m1()// this will be final because to check if it is final we need to 
	// create child class which is not possible
	{
		a = a+10;
		System.out.println(a);
	}
	public static void main(String[] args) {
		new Test().m1();
	}
}
--------------------------------------------------------------------------------
// Different way to create object
class Parent {
}
class Child extends Parent{
}

Parent P = new Parent(); // Valid
Child c = new Child();// valid
Parent p = new Child();//valid. Parent class reference variable p holding child class object
// parent class ref variable is able to hold child class object
Child c = new Parent();//Invalid
---------------------------------------------------------
Polymorphism part 3:  
//By using P i.e P reference var we will be able to call only overrided method but direct method of child class can be accessed using 
//"type casting"(conversion of parent to child type with ref var of child class)
class Parent
{
void m1(){System.out.println("parent m1()");//overridden method
}
}
class Child extends Parent
{
	void m1(){System.out.println("Child m1()");}//overriding method
	void m2(){System.out.println("Child m2()");}//direct method
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.m1(); /*compile time compiler will check m1() method in Parent class so m1() is available in parent class.but at runtime Child class object is created. So Child class is executed here.
       // p.m2(); compile time error. so using P it is able to access only override method of Child object */
	    /* It generates error message. Becauze first compiler will check m2()method in parent class at compile time. Here m2()
		is not available in parent class here. 	*/	
		Child c = (Child)p; //conversion of parent to child type with ref var of child class 
		c.m2();
	}
	}
	
Result:
Child m1()
Child m2()
-------------------------------------------------------------------------------------
Polymorpism part4: Overriding rule no. 5 i.e static methods overriding.
/*compile time compiler check methods in parent class (reference variable) and at run time class' method whose class object is created will be executed.
  */
class Parent
{
static void m1(){System.out.println("parent m1()");
}
}
class Child extends Parent
{
	static void m1(){System.out.println("Child m1()");}//overriding method
	
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.m1();
		
	}
	}
Output:
parent m1() // which is not expected. Expected  result is Child m1()
Reason: It is not possible to override static method in Java because Static method are specific to class. So this concept is also called method hiding concept.

-----------------------------------------------------------------------------------
Polymorpism part4: private Methods overridding
Overriding rule no. 5
If you declare the class as Private, child class will also unable to access the parent class.
/*When you try to access private method from outside the class. You will get a error. Private methods are specific for the class only. so overriding is not possible.
  It is not possible to override a private method of particular class. Because access permisiion is limited to the particular class and not from outside 
  class even there is a child class of the class containg overriden method.
*/
class Parent
{
private void m1(){System.out.println("parent m1()");
}
}
class Child extends Parent
{
	void m1(){System.out.println("Child m1()");}//overriding method
	
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		
	}
	}
	
Output:
error: m1() has private access in Parent

------------------------------------------------------------------------------------------------
Before learning rule no 7 we should know about modifiers.
What is Modifiers ?
1)Public    - It is applicable for variables , Methods, constructors and class  ---> Any package can access public.
2)Protected - It is applicable for variables , Methods ----------------------------> The methods or data members declared as protected are
              accessible within same package or sub/child classes in different package. 
3)Private   - It is applicable for variables , Methods ----------------------------> The methods or data members declared as private are accessible              only within the class in which they are declared.Access is Within the class. Any other class of same package will not be able to
              access these members.Classes or interface can not be declared as private.
4)Default   - It is applicable for variables , Methods, Class ---------------------> The data members, class or methods which are not declared using              any access modifiers i.e. having default access modifier are accessible only within the same package.
--------------------------------------------------------------------------------------------------
Polymorpism part4:

/*Overriding ruleno. 7 
case1: Same level permission i.e (both parent and child have default modifier. so this is overriding concept )
*/
class Parent
{
void m1(){System.out.println("parent m1()");
}
}
class Child extends Parent
{
	void m1(){System.out.println("Child m1()");}//overriding method
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
	}
----------------------------------------------------------------------------------------------------------
/*Overriding ruleno. 7 
case2: Inc level of permission. In java while overriding it is possible to maintain same level or increase level of permission. Reduction in permission is not allowed. 
*/
class Parent
{
protected void m1(){System.out.println("parent m1()"); // within the package it can be accessed or access is possible from child class. here we are reducing the permission.
}
}
class Child extends Parent
{
	public void m1(){System.out.println("Child m1()");}//overriding method. 
	
	}
Output: Error message. attempting to assign weaker access privileges; was protected
----------------------------------------------------------------------------------------------------------
/*Overriding ruleno. 7 
case3: decreasing the permission is not allowed while overridding.
*/
class Parent
{
public void m1(){System.out.println("parent m1()"); // within the package it can be accessed or access is possible from outside child class. here we are reducing the permission.
}
}
class Child extends Parent
{
	 void m1(){System.out.println("Child m1()");}//overriding method. 
	
	}
output:
Error message.
--------------------------------------------------------------------------------------------
Polymorphism part 5:
The process of highlighting the set of services and hiding the implementation in child classes is called abstraction.
example: ATM machine(It shows set of services on screen but hide the implementation interally)
There are two types of method
1) Normal method
syntax:
void m1(){    //method declaration
--------logics--- //Method implementations
}
2) Abstract method (It contains method declaration only and not implementation. Here declaration ends with ";" . To represent the method is abstract we add a modifier named abstract)
syntax:
abstract void m1(); //method declaration

Based on these two category of methods, classes are categoriged in two types.
1) Normal class :
If class contains only normal methods called normal class.
example:
class Test{
void m1(){}
void m2(){}
void m3(){}
}
2)Abstract class/Helper class
If a class contains at least one abstract modifier called Abstract class.
example1:
Abstract class Test{
void m1(){}
void m2(){}
Abstract void m3();
}
example2:
Abstract class Test{
void m1(){}
void m2(){}
void m3();
}

Main difference between both classes:
It is possible to create object for normal class but not possible for Abstract.

Abstract class may or may not contains abstract method but it is not possible to create object of abstract classes.
 Q: How to prevent inheritance: 
 Ans: declare class as final
 Q: How to prevent Overridding ? 
 Ans: declare method as final
 Q: How to prevent object creation ?
 Ans: Declare class as Abstract
 ------------------------------------------------------------------------------------------------------------------------
abstract class Test
{
	abstract void m1(); // Abstract method only highlights services and implemetation will be in child class
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("m4() method");
	}
}
class Test1 extends Test{  // Since we can not create object of Test class we need to  create a child class. Using child class object we can access parent class methods.
	void m1(){System.out.println("m1 method ");}
	void m2(){System.out.println("m2 method ");}
	void m3(){System.out.println("m3 method ");}
	public static void main(String[] args) {
		//Test t = new Test(); //  error: Test is abstract; cannot be instantiated
		Test1 t = new Test1();
		t.m1();
		t.m2();
		t.m3();
		//Parent p = new child();
		Test t1 = new Test1(); // this is possible. Becauze we are only referencing abstract class not generating object of abstract class.
        t1.m1(); //During compile time:  compiler check method in parent class.  	Run Time: Test1 object is created so test1 method is executed.
        t1.m2(); // Compile: Test  Run Time: Test1 
        t1.m3(); // Compile: Test  Run Time: Test1 		
	}
}
--------------------------------------------------------------------------------------------------------
abstract class Test{
abstract void m1(); // Abstract method only highlights services and implemetation will be in child class
abstract void m2();
abstract void m3();
void m4(){System.out.println("m4() method");}
}
abstract class Test1 extends Test{void m1(){System.out.println("m1 method");}
}
abstract class Test2 extends Test1{void m2(){System.out.println("m2 method");}
}
class Test3 extends Test2{
	void m3(){System.out.println("m3 method");}
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.m1();
		t.m2();
		t.m3();
	}
}

Output:
m1 method
m2 method
m3 method

--------------------------------------------------------------------------------------------
/************************************************************************************************************************************************
 * Constructor rule (we have already discussed):
 * Constructor syntax:
 * Class Test{
 * Test(){-----constructor logic-----}
 * Test t = new Test(); //constructor logic is executed during object creation. 
 * }
 * when come to abstract class. Object creation of abstract class is not possible in java. 
 *
 * abstract Class Test{
 * Test()
 * { -----constructor logic-----}
 * Test t = new Test(); //object creation not possible for abstract class. So this line will show error.
 * }
 *
 * Q: Inside abstract class object creation is not possible as we know, but does inside abstract class constructor declaration  possible ?
 * Ans: Yes it is possible to write constructor declaration and logic inside abstract class.
***********************************************************************************************************************************************/

abstract class Test
{
	Test(){	System.out.println("abstract class constructor");} // constructor of Test class
	abstract void m1();
}
class Test1 extends Test
{
	void m1() // normal method
	{
		System.out.println("m1 method");
	}
	Test1() // constructor with implementation
	{
		super(); // this will execute 0-arg super class contructor
		System.out.println("normal class constructor");
	}
	public static void main(String[] args) {
		new Test1().m1();
	}
}

	Output:
	abstract class constructor
    normal class constructor
    m1 method
-----------------------------------------------------------------------------------------------------------------------

/*****************************************************************************************************************************************************
* Keep two points in mind for the following example about instance and static block
* 1) whenever the object is created first  Instance block executed then constructor.
* 2) Static block executed only once for each class load. i.e every time the class file created one static block executed.
* If you have written instance block and static block in abstract class. This blocks only executed by creating object in the child class.
*****************************************************************************************************************************************************/

abstract class Test{
	Test() {System.out.println("abstract class constructor");} //constructor
	{System.out.println("abstract Test class Instance block");} // instance block
	static{System.out.println("abstract Test class static block");}// static block
	
}
class Test1 extends Test{
	Test1()
	{
		super(); // super class constructor
		System.out.println("normal class constructor");
	}
	public static void main(String[] args) {
		new Test1();
		new Test1();
	}
	
}

Output:
abstract Test class static block
abstract Test class Instance block
abstract class constructor
normal class constructor
abstract Test class Instance block
abstract class constructor
normal class constructor
------------------------------------------------------------------------------------------------------------------------------------
import java.nio.charset.MalformedInputException;

/***************************************************************************************************************************
 * Interfaces:
 * Abstract class may or may not have abstract method but Interfaces always have only abstract method in it.                                                                                                                         
 * When coming to Interface, all methods inside will be abstract public method. and by default interfaces are abstract. So for
 * interfaces object creation is not allowed in java.
 * So interfaces are only to highlight functionalities. Interfaces also called SRS Document() Implementation for the interfaces will be in class.
 * syntax of Interface:
 * 
 * Interface IT{  // by default this is abstract. After compilation of interface IT, IT.class file will be generated just like class compilation.
 *  void m1();   // by default this is abstract/public
 * }
 *  
 *********************************************************************************************************************/

interface IT1{   //by default interface is abstract type
	void m1();   //by default method is public abstract type
	void m2();
	void m3();
}
// now below are the class implementation of interface IT1
class Test implements IT1{
	void m1(){System.out.println("m1 method");} // we get the error:  attempting to assign weaker access privileges; was public. so check Interfaces2.java to resolve the problem
	void m2(){System.out.println("m2 method");}  // by default this method is default
	void m3(){System.out.println("m3 method");}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
	}
	}
----------------------------------------------------------------------------------------------------------------------------------------------------
/**********************************************************************************************************************************************
 * Resolving error of Interface IT1:
 * compilation error: attempting to assign weaker access privileges; was public. so check Interfaces2.java to resolve the problem
 * 
 * Child class method trying to reduce the permission of parent class method by overridding.
 *
 * As part of rule of overriding concept, We need to keep in mind that Java allows only same level or higher level of overriding.
 * Meaning Parent child class always have same level or higher level of access than parent methods.
 * So in case of  Interfaces2.java Test methods are of default(which have only one pkg access) while IT1 interface methods are of
 * Public type (public can have all pkg access).
 * So to make child class same or more accessible than parent class we need to add modifier as "Public" to child class methods.
 *  
 **********************************************************************************************************************************************/

interface IT1{  //by default interface is abstract type
	void m1();   //by default method is public abstract type
	void m2();
	void m3();
}
// now below are the class implementation of interface IT1
class Test implements IT1{
	public void m1(){System.out.println("m1 method");} // we get the error:  attempting to assign weaker access privileges; was public. so check Interfaces2.java to resolve the problem
	public void m2(){System.out.println("m2 method");} // this method by default is default. Which have less privilege from public. So we need to convert default to public or higher accessible modifier.
	public void m3(){System.out.println("m3 method");} // Now this program will execute.
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
		IT1 i = new Test(); // so interfaces also able to hold implementation class object.
		i.m1();
		i.m2();
		i.m3();
	}
	
}

Output:
m1 method
m2 method
m3 method
m1 method
m2 method
m3 method
--------------------------------------------------------------------------------------------------------------------------------------------------
/**********************************************************************************************************************************************
 * Interfaces:
 * Example 3 
 **********************************************************************************************************************************************/

interface IT1{  //by default interface is abstract type
	void m1();   //by default method is public abstract type
	void m2();
	void m3();
}
// now below are the class implementation of interface IT1
abstract class Test implements IT1{
	public void m1(){System.out.println("m1 method");} // we get the error:  attempting to assign weaker access privileges; was public. so check Interfaces2.java to resolve the problem
}
abstract class Test1 extends Test{
	public void m2(){System.out.println("m2 method");} // we get the error:  attempting to assign weaker access privileges; was public. so check Interfaces2.java to resolve the problem
}
class Test2 extends Test1{
	public void m3(){System.out.println("m3 method");}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1();
		t.m2();
		t.m3();
	}
}
--------------------------------------------------------------------------------------------------------------------------------------------------------
/*******************************************************************************************************************************************************
 *Interface...
 *Example 4
 *we can apply inheritance properties on interface also .
 * POINTS TO BE NOTED:
 * one class can be able to extends or inherit one class at a time but one interface can extend or inherit more than one interface at a time.
 * 
 * 
 ******************************************************************************************************************************************************/
interface IT1{  //by default interface is abstract type
	void m1();   //by default method is public abstract type
}
interface IT2 extends IT1{  // Here to acquire the property of IT1 use extend keyword with IT2
	void m2();
}
interface IT3 extends IT2{
	void m3();  // So IT3 have m1,m2 and m3 methods.
}
class Test implements IT3{
	public void m1(){System.out.println("m1 method");}
	public void m2(){System.out.println("m2 method");}
	public void m3(){System.out.println("m3 method");}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
		
	}
}

--------------------------------------------------------------------------------------------------------------------------------------------------
/***************************************************************************************************************************
 *Interface...
 *Example 5
 *we can apply inheritance properties on interface also .
 * class extends class
 * interface extends interface
 * class implements interface
 *****************************************************************************************************************************/
interface IT1{  //by default interface is abstract type
	void m1();   //by default method is public abstract type
}
interface IT2 {  // Here to acquire the property of IT1 use extend keyword with IT2
	void m2();
}
interface IT3 extends IT1,IT2{  // extends multiple interface at a time.
	void m3();
}
class Test implements IT3{
	public void m1(){System.out.println("m1 method");}
	public void m2(){System.out.println("m2 method");}
	public void m3(){System.out.println("m3 method");}
	public static void main(String[] args) {
		IT3 t = new Test();
		t.m1();
		t.m2();
		t.m3();
		
	}
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------
Notes:
class A extends B      ---- valid
class A extends B,C    ---- Invalid
class A implements It1 ---- valid
class A implements It1,It2 ---- valid
class A extends A ---- Invalid (cyclic inheritance)


interface It1 extends It2     -----> valid
interface It1 extends It2,it3 -----> valid
interface It1 extends A       -----> Invalid
interface It1 extends It1     -----> Invalid (cyclic inheritance)


(extends keyword must be first keyword)
class A extends B implements It1.It2   ---------->Valid
class A implements B extends It1.It2   -----------> Invalid
------------------------------------------------------------------------------------------------------------------------------------------------------
/* *************************************************************************************************************************
 * Netsed interface 
 * It is possible to declare interface insde interface
 * 
 ***************************************************************************************************************************/
interface It1{
	interface It2{
		void m1();
	}
}
class Test implements It1.It2{  //map.entry where map is main interface and entry is sub interface
	public void m1(){System.out.println("m1 method");}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		new Test().m1();
	}
	
}
-------------------------------------------------------------------------------------------------------------------------------------------------
/* *************************************************************************************************************************
 * Netsed interface 
 * It is possible to declare interface inside class 
 * map.entry method where map is main class and entry is sub interface
 * 
 ***************************************************************************************************************************/
class A{
	interface It2{
		void m1();
	}
}
class Test implements A.It2{  //map.entry where map is main class and entry is sub interface
	public void m1(){System.out.println("m1 method");}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		new Test().m1();
	}
	
}
-----------------------------------------------------------------------------------------------------------------------------------------------------

/* *************************************************************************************************************************
 * Netsed interface 
 * It is possible to declare variable inside interface
 * map.entry method where map is main class and entry is sub interface
 * 
 * 3 points to remember:
 * 1) Interfaces are by default abstract
 * 2) Interface methods by default are public abstract
 * 3) Interface variable by default are public static final
 * we get error here as :  error: cannot assign a value to final variable a
 ***************************************************************************************************************************/
interface It1{ // abstract
	    int a = 10; //public static final
		void m1(); //public abstract
}
class Test implements It1{ 
	public void m1(){
		a = a+ 10;
		System.out.println(a);}
	public static void main(String[] args) {
		Test t = new Test(); //or new Test().m1();
		t.m1();
		
	}
	
}
------------------------------------------------------------------------------------------------------------------------------------------------------
/* *************************************************************************************************************************
 * when you have two interfaces with same variable name and when we trying to implement both interfaces in a class
 * and try to print the value of variable. It will show ambiguity problem.
 * 
 ***************************************************************************************************************************/
interface It1{ // abstract
	    int a = 10; //public static final
}
interface It2{ // abstract
    int a = 99; //public static final
}
class Test implements It1,It2{ 
	public void m1(){
		System.out.println(It1.a);
		System.out.println(It2.a);} // to remove ambuiguity problem we can refer interfacename.var
	     
	public static void main(String[] args) {
		new Test().m1();
		
	}
	
}
--------------------------------------------------------------------------------------------------------------------------------------------------------
 /* *************************************************************************************************************************
 * Limitation of interfaces:
 * There is a problem in implementing(overriding) some methods among all abstract method present in Interface.
 * Let say if 5 method present in one interface then we need to implement(override) all methods. 
 * 
 * So if we want to implement only 2 method among 5 methods of interface,we will get error and to overcome the problem we have to go for "adapter class"
 * 
 ***************************************************************************************************************************/
interface It1{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}
class X implements It1{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
}
class Test implements It1{
	public void m1(){System.out.println("m1 method");}
	public void m2(){System.out.println("m2 method");}
	public void m3(){System.out.println("m3 method");}
	public void m4(){System.out.println("m4 method");}
	public void m5(){System.out.println("m5 method");}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		
	}
}
-----------------------------------------------------------------------------------------------------------------------------------------
/* *************************************************************************************************************************
 * To check predefined method there is a javap command and to know how many method present in particular command use
 * "javap java.io.Serializable". Interface without methods is called "marker interface" . eg- java.io.Serializable, java.util.RandomAccess
 * java.lang.Cloneable
 * Running marker interfaces below:
 * D:\Academics\JavaFiles\JavaCodeJulee>javap java.io.Serializable
 * Compiled from "Serializable.java"
 * public interface java.io.Serializable {
 * }
 * 
 * D:\Academics\JavaFiles\JavaCodeJulee>javap java.util.RandomAccess
 * Compiled from "RandomAccess.java"
 * public interface java.util.RandomAccess {
 * }
 * So what is the use of interface without methods ?
 * Definition of marker Interface:
 * Interface without method. But whenever your class implementing interface your class must acquire some capabilities to perform some operation.
 * called marker Interface.
 * i.e Implementation of interface having no method with ultimate goal to acquire some capabilities to perform some operation.
 * To perform marker interface we need to know cloning i.e duplicate object creation.
 * To create duplicate object we have clone() method (clone method return type is object class) 
 * Initially for a class duplicate object creation is not allowed. If you want to perform duplicate object creation, your class must implement clonable 
 * interface.
 * So again, marker interface doesn't contains any method but whenever your class implementing cloneable marker interface your class is acquiring some
 * capabilities to perform cloning process.
 * Q: But Q is cloneable contains zero method so without methods how the class is acquiring the properties?
 * Ans: without methods capabilties of a class to acquire the properties are provided by JVM. eg- class acquiring cloning properties by cloneable 
 ***************************************************************************************************************************/
class Test implements Cloneable {
	int a = 10;
	int b = 20;
	public static void main(String[] args) throws Exception  
	{ 
		Test t = new Test();
		System.out.println(t.a);  // a = 10
		System.out.println(t.b);  // b = 20
		Test t1 = (Test)t.clone(); // t1 is the duplicate object.
		t.a = 100; // reassignment of a. Later after reassignment if we want to print value prior of reassignment we can use clone().  
		t.b = 200;
		System.out.println(t.a);  // a = 100
		System.out.println(t.b);  // b = 200
		System.out.println(t1.a);  // a = 10 // original value by referring duplicate object.
		System.out.println(t1.b);  // b = 20
	}
}
--------------------------------------------------------------------------------------------------------------------------------------------------------
/* Java predifined are supported in the form of packages. Java contains group of packages and package contains group of
 * classes and interfaces and this classes and interfaces contains group of methods. 
 * eg: java.lang package ------> string class,..,...---------->length method,toUpperCase(),..,...
 * Package is nothing but a folder containing group of classes.
 * Java contains 14 predefined main packages(like java.lang)-----> 
 * this 14 prdefined packages contain 150 sub-packages
 * 150 pakage contans around 7K classes and this 7K classes contains around 7 lac .  
 * 14 main package ---> 150 sub-package ----> 7K classes ------> 7 lac Methods.
 * There are two types of Packages in Java
 * 1) prdefined
 * 2) Userdefined package.
 * Syntax:
 * package com.ibm.bank.loans ;
 * class A{}
 * class B{}
 * 
 * Inside source file we can declare only one package and the declaration of the source file must be on the top.
 * Below are the coding convention for package declaration
 * 1) start with reverse of domain name. eg: if cts.com then write as com.cts (1st part of pkg name)
 * 2) every character of package name in lower case (2nd part of pkg name is project name)
 * 3) in last of the name always write module name.
 * eg: com.ibm.bank.loans 
 * where 
 * com.ibm is reverse of domain name
 * bank is project name
 * loans is module name 
 ************************************************************************************************************************************************/
package com.ibm.bank.loans ; 
	class A{}
	class B{}
	class c{}
	
------------------------------------------------------------------------------------------------------------------
//file1 Message.java
package com.dss.declarations ;
public interface Message 
{
	void morn(); // interface or abstract methods are by defualt public
    void even();
	void gn();
}

// Sourcefile Helper.java
package com.dss.helper;
import com.dss.declarations.Message;
abstract class Helper implements Message 
{
	public void gn()
	{
		System.out.println("helper class gud night");
	} //implementation method must be public
}

// Sourcefile TestClient1java.java
package com.dss.testclient1;
import com.dss.declarations.message ;;
public class TestClient1 implements message
{
	void morn(){System.out.println("Good morning");}
	void even(){System.out.println("Good evening");}
	void gn(){System.out.println("Good night");}
	public static void main(String[] args) {
		System.out.println("Hello world");
		TestClient1 t = new TestClient1();
		t.morn();
		t.even();
		t.gn();
	}
}


// Sourcefile polymorphTestClient2java.java
package com.dss.helper;
import com.dss.helper.Helper ;;
public class TestClient2 extends Helper
{
	void morn(){System.out.println("Good morning");}
	void even(){System.out.println("Good evening");}
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		TestClient1 t = new TestClient1();
		t.morn();
		t.even();
		t.gn();
	
	}
}
--------------------------------------------------------------------------------------------------------------
Array
There are 3 parts to work with array
1) Declaration
   int{} a;
2) Instantiation
   a = new int{};
3) Initialization (means assign values)
   a{0}= 10;
   a{1}= 20; etc.
   
another format for array declaration is as below
int{} a = {10, 20, 30, 40, 50, 60} // Here we are declaring and intialising together

example1:

public class Array1 {
	public static void main(String[] args) {
		int[] a = {10,20,30,40}; //integer array a = assign the values 
		//To print the array we have three approach
		// 1st approach
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		// 2nd approach by for loop
		for (int i = 0; i < a.length ;i++) //index starts from zero upto length(var name) will be incremented
		{
			System.out.println(a[i]);
		}
		
		//3rd approch is for each loop 
		for (int aa :a) // right hand side of collon is data which we want to print i.e "a" (reference variable)and left hand side is int data 
		{
			System.out.println(aa);
		}
	}

}

example2:


public class Array2 {
	public static void main(String[] args) {
		int[] a= new int [5]; //instantiation i.e declare integer with size of 5. Array is created with default values of 0
		for(int aa:a);
		{
			System.out.println(aa);
		}
		boolean[] b = new boolean [3];
		for (boolean bb : b);
		{
			System.out.println(bb);
		}
		A[] a1 = new A[3]; // A is a user defined type
		for (A a2:a1);
		{
			System.out.println(a2);
		}
	
	}

}
/********************************************************************************************************************************************

Creating jar file:
Steps: 
1) compile java file. 
	eg: javac abc.java
2) create jar file:
	eg: jar -cvf julee.jar abc.class

If we want to compile a java class present in c:/Desktop/xyz.java which uses another java classes method of some jar file saved in D:/Julee/julee.jar
Comilation of xyz.java can be done as follows:

 
*********************************************************************************************************************************/
public class abc  //saved in D:/Julee/julee.jar
{
	void add(x int, y int)
	{
		System.out.println(x+y);
	}
	void multiply(x int, y int)
	{
		System.out.println(x*y);
	}
}

/*************************************************************************
c:/Desktop >javac xyz.java (invalid sysntax)
c:/Desktop >javac -cp D:/Julee xyz.java (invalid sysntax: -cp stands for classpathh)
c:/Desktop >javac -cp D:/Julee/julee.jar xyz.java (valid sysntax)

Now run the class:
c:/Desktop >java -cp .; D:/Julee/julee.jar; xyz  (-cp . means find class file(xyz.class) in current working directory)
**************************************************************************/
class xyz //saved in c:/Desktop/xyz.java
{
	public static void main()
	{

		abc.add(10,20);
		abc.multiply(20,5);
	}
}
/*************************************************************************************************************************
Create Jar file:
jar -cvf  Test1.jar Test.class
jar -cvf  Test1.jar Test.class Test1.class
jar -cvf  Test1.jar *.class
jar -cvf  Test1.jar *.*

Extract Jar:
jar -xvf  Test1.jar 

Display content of Jar:
jar -tvf  Test1.jar 




