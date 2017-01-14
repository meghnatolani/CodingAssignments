
/*
 @author - meghna
 This class contains method which checks if any of the strings have a valid input or not.
 If input is not valid empty string is returned.
 
 Empty string is an invalid input as length of string is 0.
 Input -
 a="",b="",c="",d=""
 Output - ""

 Space is a valid input as length of the string is not 0.
 Input -
 a=" ",b=" ",c=" ",d=" "
 Output - "  AND  AND  AND "
*/

public class StringFunction {

	public static String JoinWithAnd(String a,String b,String c, String d){
		String output="";
		String concat=" AND ";
		int count=0;
		
		if(a!=null && a.length()>0){
			output+=a;
			count++;
		}
		if(b!=null && b.length()>0){
			if(count>0) output+=concat;
			output+=b;
			count++;
		}
		if(c!=null && c.length()>0){
			if(count>0) output+=concat;
			output+=c;
			count++;
		}
		if(d!=null && d.length()>0){
			if(count>0) output+=concat;
			output+=d;
			
		}
		return output;
	}
	public static void main(String[] args) {

		System.out.println(JoinWithAnd("A","","","D"));
	}

}
