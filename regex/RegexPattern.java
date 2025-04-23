package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String[] args) {
		String str="hello World \n Good Morning Pineapple369";
		String regex="[\\w\\s,]";
		String regex1="d&";
		
		Pattern pattern=Pattern.compile(regex);
		Pattern pattern1=Pattern.compile(regex1);
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()) {
			System.out.print(matcher.group());
		}
	}

}
