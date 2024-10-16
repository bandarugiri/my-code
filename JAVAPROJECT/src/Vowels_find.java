package javapractice1;

public class Vowels_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="I Love India";
int Vcount=0,Ccount=0;
 s=s.toLowerCase();
for(int i=0;i<=s.length()-1;i++) {
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	{
		Vcount++;
		
	}
	else if(s.charAt(i)>='a'||s.charAt(i)=='z' )
	{
		Ccount++;
	}
}
System.out.println(Vcount);
System.out.println(Ccount);
	}

}
