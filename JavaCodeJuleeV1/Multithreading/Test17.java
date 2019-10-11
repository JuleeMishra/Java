/*Thread by using anonymous inner classes approach*/
class ThreadDemo {
	public static void main(String[] args){
		Thread t1 = new Thread(){ //inner class  
			public void run(){
				System.out.println("First Thread");
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				System.out.println("Second Thread");
			}
		};
		t1.start();
		t2.start();
	}
}

/***

***/


//Above code in simplified way
/*
class ThreadDemo 
{
	public static void main(String[] args) 
	{
		new Thread() //code simplified here
		{
			public void run()
			{
				System.out.println("First Thread");
			}
		}.start(); //code simplified here
		new Thread() //code simplified here
		{
			public void run()
			{
				System.out.println("Second Thread");
			}
		}.start(); //code simplified here
	}
}
*/
