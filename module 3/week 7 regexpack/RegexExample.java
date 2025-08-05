package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(".s");
		Matcher matcher=pattern.matcher("as");
		boolean flagFirst=matcher.matches();
		
		boolean flagSecond=Pattern.compile(".s").matcher("as").matches();
		
		boolean flagThird=Pattern.matches(".s", "as");
		
		System.out.println(flagThird);
		
		System.out.println(Pattern.matches(".s", "asp"));
		
		String content="This is tobin from infopark";
		
		String p=".*park*.";
		
		boolean isMatch=Pattern.matches(p, content);
		
		System.out.println("pattern "+isMatch);
		
		System.out.println(Pattern.matches("\\d", "1"));  //digit
		System.out.println(Pattern.matches("\\D", "a"));   //non-digit
		System.out.println(Pattern.matches("\\D", "abb"));   //false, non-digit with more than one character
		
		System.out.println(Pattern.matches("\\D*", "abb"));   
		System.out.println("3 letter word "+Pattern.matches("\\D{3}", "abb"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abbc56"));   
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abbcdd56"));   
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aSSS$c56"));   
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aSSc56")); 
		
		//phone number
		System.out.println(Pattern.matches("[6789][0-9]{9}", "8156941968"));
		System.out.println(Pattern.matches("^[6-9]\\d{9}$", "8156941869")); 
		
		
}
}