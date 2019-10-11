/* One package can use other package class.
 * whenever you use other package classes you must import the other package
 * Default modifier in java is default
 *
**********************************************************************************************************************************************/
package com.frnds.name.corejavaproject; 
import in.jp.julee.corejavaproject1.Greet; // remember to add class name which you want to access with import package (import package_name.class)
class GreetWithName
{
public static void main(String[] args) 
{
Greet t = new Greet();
t.m1();
t.m2();
t.m3();
}
}
	
