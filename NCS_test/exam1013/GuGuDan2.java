package exam1013;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class GuGuDan2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\JAVA0719-0102\\document\\test\\gugudan2.txt");
		Reader reader = new FileReader("C:\\JAVA0719-0102\\document\\test\\gugudan2.txt");

	      String temp = "";
	      // 곱
	      for(int i = 1; i <= 9; i++) {
	         // 단
	         for(int j = 1; j <= 9; j++) {
	            //System.out.println(j + "*" + i + "=" + (j * i) + "\t");
	            temp = j + "*" + i + "=" + (j * i) + "\t";
	            writer.write(temp);
	         }
	         // System.out.println();
	         writer.write("\r\n");
	      }
	      writer.flush();
	      writer.close();
	      
	      
	      int readCharNum = 0;
	      char[] cbuf = new char[100];
	      String data ="";
	      while(true) {
	         readCharNum = reader.read(cbuf);
	         if(readCharNum == -1) break;
	         data += new String(cbuf, 0, readCharNum);
	      }

	      System.out.println(data);

	      reader.close();
		}
	}


