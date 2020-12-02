#  2020322086 郑强 计G202 
# Java-LabReport
## 一.实验内容
+ 1.掌握字符串String及其方法的使用  
+ 2.掌握文件的读取/写入方法  
+ 3.掌握异常处理结构  

## 二.业务要求
1.在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。  
2.文件A包括两部分内容：  
一.是学生的基本信息；  
二.是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程  
&emsp;完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：  
&emsp;每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”  
&emsp;允许提供输入参数，统计古诗中某个字或词出现的次数  
&emsp;输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A  
&emsp;考虑操作中可能出现的异常，在程序中设计异常处理程序  

## 三.内容要求  
1.设计学生类（可利用之前的）；  
2.采用交互式方式实例化某学生；  
3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”  
&emsp;结果存储到学生基本信息所在的文本文件A中。  


## 四.实验设计

1.设置学生类，并定义个性属性；  
```
public class Student {
	String name;							
	int  id;						    	
	String sex;							
	int age;						
	String classes;					
	String zhuanye;		
```
2.通过Scanner类实例化学生信息交互；
```
 Scanner scanner=new Scanner(System.in);
		  System.out.println("输入姓名:");
		  String name=scanner.nextLine(); 
		  System.out.println("输入性别 :");
		  String sex=scanner.nextLine();
		  System.out.println("输入年龄:");
		  String age=scanner.nextLine();
		  System.out.println("输入学号:");
		  int id=scanner.nextInt();
```
3.实现了统计古诗中某个字或词出现的次数；
```
		int len;
		byte[] data = null;
		byte[] buffer = new byte[(int) file.length()];

		while ((len=fis.read(buffer))!=-1){
		    bos.write(buffer,0,len);
		}

		data = bos.toByteArray();
		String str = new String(data);

		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入你要查找的字或词：");
		char o = sc.next().charAt(0);
		char[] ch =str.toCharArray();
		for(int i=0;i<ch.length;i++){
		    if(o==ch[i]){
		        count++;
		    }
```
## 五.核心方法  
1.  
```
public class Txt {
	public static void txt(){
		try (FileReader fInputStream = new FileReader("D:\\changhenge\\B.txt");
			FileWriter fOutputStream  = new FileWriter("D:\\changhenge\\A.txt")){
		   StringBuffer st=new StringBuffer();
		   char[] ch=new char[14];
		  while ((fInputStream.read(ch)) !=-1) {
		    st.append(ch, 0,7);
		    st.append(",");
		    st.append(ch, 7, 7);
		    st.append("。"+"\n");
		  }
```
2.  
```
		  System.out.println(st);
	      fOutputStream.write(new String(st));
		}catch (IOException e) {
			e.printStackTrace();
		}
```  
3.
```
import java.util.Scanner;
public class Test {
	public static void main(String[] args) throws Exception {
		Student scanner= new Student();
		scanner.m();
		Txt txt= new Txt();
		txt.txt();
		
		} 
	}
```
## 六.实验结果截图 
https://github.com/javauser-eng/FifthExperiment/blob/main/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png  
https://github.com/javauser-eng/FifthExperiment/blob/main/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C2.png  
https://github.com/javauser-eng/FifthExperiment/blob/main/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C3.png    
https://github.com/javauser-eng/FifthExperiment/blob/main/%E5%AD%97%E7%AC%A6%E6%9F%A5%E8%AF%A2.png  

## 七.实验感想  
1.通过这次实验我主要学习了File类的使用方法；  
2.学会了新的方法，如：Fileread，inputStream，outputStream等；  
3.复习了Scanner类和异常处理；  
4.对文本的读写有了一些了解。
