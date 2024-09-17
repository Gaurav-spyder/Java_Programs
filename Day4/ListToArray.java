package Java_Programs.Day4;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("c++");
		languages.add("Ruby");
		languages.add("php");
		languages.add(".net");
		System.out.println(languages);
		
		int s = languages.size();
		String[] arr = new String[s];
		
		//Convert List to Array
		languages.toArray(arr);
		
		int arraylength=arr.length;
		System.out.println(arraylength);
		
		arr[7]="Go-lang";  ///gives us error because we have converted it into Array, which has fixed length i.e 6 in this case
		for (String language:languages) {
			System.out.println(language);
		}
		
		
		
			}

}
