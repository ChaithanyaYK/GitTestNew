
public class StringSwayNOthird {
public static void main(String[] args) {
	String s1="Chaithanya";
	String s2="Bruno";
	System.out.println("*********Before Swap********");
	System.out.println("String1: "+s1+" String 2:  "+s2);
	s1=s1+s2;
	
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println("*********After Swap********");

	System.out.println("String 1: "+s1);
	System.out.println("String 2: "+s2);
	
	}
}
