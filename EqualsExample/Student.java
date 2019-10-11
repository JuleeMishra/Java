package EqualsExample;

class Student {
	int RollNo;
	String Name;
	Student(int RollNo, String Name){
		this.RollNo=RollNo;
		this.Name=Name;
	} 
	
	public boolean equals(Object o){
		/*Case1: s1.equals(null) ===> nullPointerException
		 * */
		if(o==null){
			return false;
		}
		/*Case2: s1.equals(s1) ===> same objects comparison
		 * to minimize timing we capture this condition in start o the code
		 * */
		if(o==this){
			return true;
		}
		/*Case3: when both objects are of different class ===>classCastException
		 * s1.equals(te)
		 * */
		if(this.getClass()!=o.getClass()){
			return false;
		}
		
		Student obj = (Student)o;
		if(this.Name==obj.Name){
			return true;
		}
		/**/
		return false;
		
	}
	
}
