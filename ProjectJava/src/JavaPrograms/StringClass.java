package JavaPrograms;
public class StringClass {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		  String st1 = "This World is Very Nice";
		  String stt2 ="beautiful";
		  String splt[] = st1.split("Very");
		  System.out.println("String Part 1 Is -> "+splt[0]);
		  System.out.println("String Part 2 Is -> "+splt[1]);
		  
		  String stt1 ="beautiful";
		  String spli[]=st1.split("is");
		  System.out.println("String part I is-> "+spli[0]);
		  System.out.println("String part II is-> "+spli[1]);
		  
		  System.out.println("String 1 equal to String 2? -> "+stt1.equals(stt2));
		  
		  
	}

}
