package fileReader;

import java.io.File;



public class Main {

	public static void main(String[] args) throws Exception {
		File test= new File("C:\\Users\\conti\\Desktop\\todo.txt");				
			FileReader r= new FileReader(test);
			r.readLines();
			r.palindrome();
	}
}



