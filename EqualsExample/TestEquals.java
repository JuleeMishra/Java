/**
 * Object class equals() method do reference comparison.
 * 
 * 
 */
package Example;

class TestEquals {
	int id;
	String Sub;
	TestEquals(int id,String Sub){
		this.id=id;
		this.Sub=Sub;
	}
	public static void main(String[] args){
		
		TestEquals te = new TestEquals(11,"Greg");
		Student s1 = new Student(11,null);
		Student s2 = new Student(12,"Peter");
		/*s1 = s2;
		boolean result = s1.equals(s2); //true. Even after RollNos are different. Because 
		boolean result = s1.equals(null); //NullPointerException
		boolean result = s1.equals(te); //classCastException
		*/
		boolean result = s1.equals(s2);
		System.out.println(result);
	}
}
