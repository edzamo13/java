package ec.com.ezamora.codeWhatEver;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Palindrome {

	private String result;
	
	
	public static void main(String[] args) {
		Palindrome p= new Palindrome();
		System.out.println(p.ejecutar("oso"));
		
	}

	public String ejecutar(String value) {
		valueCad(value);
		return getResult();
	}

	private void valueCad(String value) {
		String cadAux = "";
		List<String> desglose = new ArrayList();

		for (int i = value.length(); i > 0; i--) {
			desglose.add(value.substring(i - 1, i));
		}

		for (String string : desglose) {
			cadAux += string;
		}
		if (cadAux.equals(value))
			setResult("Palindromo");
		else
			setResult("No es Palindromo");

	}

}
