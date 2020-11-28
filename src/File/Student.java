package File;

import java.util.Scanner;

public class Student {
	String name;							
	int  id;						    	
	String sex;							
	int age;						
	String classes;					
	String zhuanye;						
	public Student() {
		this.name = name;
		this.id = id;
		this.sex=sex;
		this.age=  age;
		this.classes=classes;
		this.zhuanye=zhuanye;
	}
	public static void m(){
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("输入姓名:");
		  String name=scanner.nextLine(); 
		  System.out.println("输入性别 :");
		  String sex=scanner.nextLine();
		  System.out.println("输入年龄:");
		  String age=scanner.nextLine();
		  System.out.println("输入学号:");
		  int id=scanner.nextInt();
		  System.out.println("姓名:"+name+"\t"+"性别:"+sex+"\t"+"年龄:"+age+"\t"+"学号:"+id);
		 }
}
