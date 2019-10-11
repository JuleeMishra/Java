/*************************************************************************************************************************************************************************
 * Java predifined are supported in the form of packages. Java contains group of packages and package contains group of
 * classes and interfaces and this classes and interfaces contains group of methods. 
 * eg: java.lang package ------> string class,..,...---------->length method,toUpperCase(),..,...
 * Package is nothing but a folder containing group of classes.
 * Java contains 14 predefined main packages(like java.lang)-----> 
 * this 14 prdefined packages contain 150 sub-packages
 * 150 pakage contans around 7K classes and this 7K classes contains around 7 lac .  
 * 14 main package ---> 150 sub-package ----> 7K classes ------> 7 lac Methods.
 * There are two types of Packages in Java
 * 1) prdefined
 * 2) Userdefined package.
 * Syntax:
 * package com.ibm.bank.loans ;
 * class A{}
 * class B{}
 * 
 * Inside source file we can declare only one package and the declaration of the source file must be on the top.
 * Below are the coding convention for package declaration
 * 1) start with reverse of domain name. eg: if cts.com then write as com.cts (1st part of pkg name)
 * 2) every character of package name in lower case (2nd part of pkg name is project name)
 * 3) in last of the name always write module name.
 * eg: com.ibm.bank.loans 
 * where 
 * com.ibm is reverse of domain name
 * bank is project name
 * loans is module name 
 * Afer compilation com folder not generated. Folder is not generated why?
 * If application contains package statement, we should compile the application
 * with one additional required statement. i.e javac -d . A.java
 * where -d = create a folder (directory) structure.
 * "." = place folders in current working directory
 * Test.java = execute the Test.java file 
 * 
 * Run the package as below:
 * Step 1) D:\Academics\JavaFiles\JavaCodeJulee>javac -d . Package1.java  ----Generation of package with class inside
 * Step 2) D:\Academics\JavaFiles\JavaCodeJulee>java com.dss.java.corejava.Test   -----------> Running the required class of the package i.e running fully qualifier 
 ************************************************************************************************************************************************/
package com.dss.java.corejava ; 
	class Test{
		public static void main(String[] args) {
			System.out.println("package first example");
		}
	}
	class B{}
	class c{}
    interface It{
    	
    }

