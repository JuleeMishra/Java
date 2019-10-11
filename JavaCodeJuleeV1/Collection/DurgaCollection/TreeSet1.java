import java.util.*;
class myComaparator implements Comparator{
	public int compare(object obj1, object obj2){
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		if(I1 < I2)
			return +1;
		else if(I1 > I2)
			return -1;
		elsereturn 0;
	}
}