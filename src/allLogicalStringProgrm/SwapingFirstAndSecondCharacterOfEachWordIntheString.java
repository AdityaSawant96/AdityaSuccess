package allLogicalStringProgrm;

public class SwapingFirstAndSecondCharacterOfEachWordIntheString {

	public static void main(String[] args) {
String b ="Ajinkya Shethe";
char ch[]= b.toCharArray();
for(int i=0; i<ch.length; i++)
{
	int k=i;
	
	while(i<ch.length && ch[i]!=' ')
	{
	i++;
	}
	char temp =ch[k];
	ch[k]=ch[k+1];
	ch[k+1]=temp;
}

System.out.println(ch);
		
		
	}

}
