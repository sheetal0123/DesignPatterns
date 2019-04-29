package velocitymanager.example1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PetDataClass {
	
	/*
	 * Data creation method
	 */
	public List<PetDomain> getData() throws IOException{
		PetDomain obj;
		List<PetDomain> ls = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+ "\\src\\test\\java\\velocitymanager\\example1\\petdata.txt")));
		
		String str;
		while((str= br.readLine())!=null) {
			obj = new PetDomain();
			String [] arr = str.split(",");
			obj.setName(arr[0]);
			obj.setPrice(Float.parseFloat(arr[1]));
			ls.add(obj);
		}

		br.close();
		return ls;
	}
	
}
