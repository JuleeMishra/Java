import java.util.*;
class HashMapDemo{
	public static void main(String[] args){
		HashMap m = new HashMap();
		m.put("Julee",700);
		m.put("Ankita",800);
		m.put("Neetu",200);
		m.put("Minu",500);
		System.out.println(m); // {Ankita=800, Neetu=200, Minu=500, Julee=700}
		System.out.println(m.put("Julee",1000));// 700
		Set s = m.keySet();
		System.out.println(s); //[Ankita, Neetu, Minu, Julee]
		Collection c = m.values();
		System.out.println(c); //[800, 200, 500, 1000]
		Set s1 = m.entrySet();
		System.out.println(m); //{Ankita=800, Neetu=200, Minu=500, Julee=1000}
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"------"+m1.getValue());
			if(m1.getKey().equals("Minu")){
				m1.setValue(10000);
			}
		}
		System.out.println(m);
	}
}