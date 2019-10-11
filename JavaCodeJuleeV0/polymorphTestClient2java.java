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
