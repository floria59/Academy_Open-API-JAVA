package exam1013;

import java.io.FileOutputStream;
import java.io.IOException;


public class GuGuDan {

	public static void main(String[] args) throws IOException {
		
			FileOutputStream output = new FileOutputStream("C:\\JAVA0719-0102\\document\\test\\gugudan.txt");
		
			
			for(int i=2;i<10;i++){
				for(int j=1;j<10;j++){
					System.out.print(i + "*" + j + "=" + (i*j) + "\t");
					String data = i + "*" + j + "=" + (i*j) + "\t";
					output.write(data.getBytes());
				}
				System.out.print("\n");
				output.write("\n".getBytes());
			}
			output.close();

	}
}
