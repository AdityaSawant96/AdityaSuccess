package allLogicalStringProgrm;

public class PrintArrayWithEndWithSandStartWithG {

	public static void main(String[] args) {
   String []simple = {"Ending","sound","Mayur","Amey"};
   
   for(int i=0; i<simple.length; i++)
   {
	  if(simple[i].charAt(0)=='s'||simple[i].charAt(simple[i].length()-1)=='g') 
{
	System.out.println("word is:= "+simple[i]);
}
   }
   
   
   
	}

}
