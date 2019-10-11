/*java bean class/value object(VO)/buisiness object/DTO(data trans object)
Encapsulation is binding data in a single entity. example: 1) class contains group of variable,methods,constructors,instance block,static block together.
2) Packaage contains group of classes and interface
tightly encapsulated class: Contains private properties. So, no other class able to access this class properties.
Bean class is tightly encapsulated class(contains private properties) and it generally contains public setter and getter method. 
*/
class EmpBean{
	private int eid;
	private String ename;
	// Setter method will set the value of properties
	public void setEid(int eid){
		this.eid = eid ; //eid in this.eid refers to instance variable
		
	}
	public void setEname(String ename){
		this.ename = ename;
	}
	//Getter method use to get the value from properties
	public int getEid(){
		return eid;
	}
	public String getEname(){
		return ename;
	}
}