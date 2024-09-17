package Java_Programs.Day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FilenotfoundException {

	public static void main(String[] args) throws FileNotFoundException {
		File src = new File("utils\\Names1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		System.out.println(fis);
	}

}
