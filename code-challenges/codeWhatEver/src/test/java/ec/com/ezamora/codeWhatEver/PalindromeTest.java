package ec.com.ezamora.codeWhatEver;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	Palindrome palindrome = new Palindrome();

	@Test
	public void test() {
		assertNotNull(palindrome.ejecutar("oso"));
		
	}
	@Test
	public void testPalindrome() {
		assertEquals(palindrome.ejecutar("oso"), "Palindromo");
	}

}
