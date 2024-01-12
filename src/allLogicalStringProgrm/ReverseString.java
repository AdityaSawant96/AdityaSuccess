package allLogicalStringProgrm;

public class ReverseString {

	public static void main(String[] args) {
String abc="Aditya Sawant";
String ck= abc+" ";
String rev= "";
String Word="";
for(int i=0; i<ck.length(); i++)
{
	char ch[]=ck.toCharArray();
	if(ch[i]!=' ')
	{
		Word=Word+ch[i];
	}
	else
	{
		rev=Word+" "+rev;
		Word="";
	}
}
System.out.println(rev);
	}

}

