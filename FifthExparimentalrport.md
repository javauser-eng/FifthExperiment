#  2020322086 郑强 计G202 
# Java-LabReport
## 一.实验内容

+ 1.基本要求是完成教材p110页的第四题关于PC、cpu及其他模拟的程序。
+ 2.附加要求：{  
    1.类中定义不少于两个构造方法；  
    2.每个类定义不少于2个属性，且属性的类型应该多样化；     
    3.根据课堂中关于访问权限的内容，尝试定义  
&emsp;属性的修饰符多样化，类中定义方法操作属性，   
&emsp;避免直接通过“类对象.属性”的形式访问属性值；    
&emsp;且定义的方法内应该有符合常理的逻辑判断；  
    4.尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。}
    
## 二.实验设计

1.设置硬盘对象，并给硬盘对象创建amount方法。  
&emsp;设置amount方法在硬盘对象外不可访问：
```
public class HardDisk {
	private int amount;
```
2.设置CPU对象，并给CPU对象创建speed方法。  
&emsp;设置speed方法在CPU对象外不可访问：
```
public class CPU {
	private int speed;
```
3.额外创建了model、brand对象。
```
public class CPU {
	String model;
	String brand;
```
```
public class HardDisk {
	String model;
	String brand;
```
## 三.核心方法  
1.  
```
public void setCpu(CPU cpu){
		this.cpu=cpu;
	}
	public void setHardDisk(HardDisk HD){
		this.HD=HD;
	}
```
2.  
```
CPU cpu =new CPU();
HardDisk HD=new HardDisk();
```  
3.
```
PC pc=new PC();
pc.setCpu(cpu);
pc.setHardDisk(HD);
pc.show();
```
## 四.实验结果  
```
CPUspeed:2200
CPUbrand:酷睿
HDamount:希捷
HDamount:200
```  
## 五.实验感想  
1.通过这次实验我学习了public、private两种修饰符的作用区域；  
2.练习了构建方法；  
3.练习了多种类型的定义；  
4.练习了包外调用。
