package File;

import java.io.*;
import java.util.Scanner;

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
		  System.out.println(st);
	      fOutputStream.write(new String(st));
		}catch (IOException e) {
			e.printStackTrace();
		}
}
}
