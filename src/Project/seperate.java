package Project;

public class seperate {	
public static void main(String[] args) {
String s="chethan123";
char c[]=s.toCharArray();
String alphabets="";
String numbers="";

for(int i=0;i<c.length;i++) {
	if(Character.isDigit(c[i])) {
		alphabets=alphabets+c[i]+"";
	}
	else if(Character.isAlphabetic(c[i])){
		numbers=numbers+c[i]+"";
	}
}
System.out.println(alphabets);
System.out.println(numbers);
}
}
