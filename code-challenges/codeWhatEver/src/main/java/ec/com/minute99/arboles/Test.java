package ec.com.minute99.arboles;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		
		list.add("-3,");
		list.add("-4, 1, ");
		list.add("2,");
		
		String cad="";
		for (int i = list.size() -1; i >=0; i--) {
			
			cad+=list.get(i);
		}
		
		System.out.println(cad);
		
	}

}
