package FileHandling1;

import java.io.FileInputStream;
import java.io.IOException;

public class Read{
	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("input");
		if(fi!=null) {
			System.out.println("file exists");
		}
		int i=0;
		//-1 is EOF
		while((i=fi.read())!=-1){
			System.out.print((char)i);
		}
	
		fi.close();
		
	}

}
