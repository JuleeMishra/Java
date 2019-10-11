public class Compare{
	private Text first;
	private Text second;
	public void set(String first, String second){
		this.first = first;
		this.second = second;
	}
	
	public string get(){
		return first+" "+second ;
	}
	
	public static void main(String[] args){
		Compare.set("Julee","Kumari");
		System.out.println(Compare.get());
	}
}