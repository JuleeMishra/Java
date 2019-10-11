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
