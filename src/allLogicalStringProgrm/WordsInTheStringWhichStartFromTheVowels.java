package allLogicalStringProgrm;

public class WordsInTheStringWhichStartFromTheVowels {

	public static void main(String[] args) {
String num ="My Name Is Aditya";
String abc = num.toLowerCase();
String Word[]= abc.split(" ");
String value="";
int length = Word.length;
//System.out.println(Word.length);
for(int i=0; i< Word.length; i++)
{
	value =Word[i];
	char ch = value.charAt(0);
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='u')
	{
		System.out.println("The words Start with the vowels is := "+value);
	}
	else
	{
		;
	}
	
}


	}

}
