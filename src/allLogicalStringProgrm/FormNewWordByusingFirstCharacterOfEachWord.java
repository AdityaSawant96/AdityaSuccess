package allLogicalStringProgrm;

public class FormNewWordByusingFirstCharacterOfEachWord {

	public static void main(String[] args) {

		String abc="Indian Police Service";
		String[]Word=abc.split(" ");
		String Value="";
		String CombineWord="";
		
		for(int i=0; i<Word.length; i++)
		{
			Value=Word[i];
			char ch= Value.charAt(0);
			CombineWord=CombineWord+ch;
			
			
		}
		System.out.println(CombineWord);
		
		
	}

}
