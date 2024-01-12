package allLogicalStringProgrm;

public class WordsInTheStringWhichStartFromTheVowels1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String dc[]= {"Sonal","krishna","ground","begning"};
	for(int i=0; i<dc.length; i++)
	{
if(dc[i].charAt(0)=='S'||dc[i].charAt(dc[i].length()-1)=='g')
{
	System.out.println(dc[i]);
}
}
}
}