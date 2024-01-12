package allLogicalStringProgrm;

public class PalindromeOrNot {

	public static void main(String[] args) {
String abc ="Madam";
String ck = abc.toLowerCase();
char ch[]=ck.toCharArray();
String rev="";
for(int i=0; i<ch.length; i++)
	{
	rev=ch[i]+rev;
	}
System.out.println(rev);

if(rev.equals(ck))
	{
	System.out.println("String is Palindrome");
}
else
{
	System.out.println("String is not Palindrome");
}
}
}