package drawings.tests;

import drawings.DrawingsFrame;
import drawings.stringslist.StringsList;

public class StringsListTest02 {

	public static void main(String[] args) {
		
		StringsList stringList=new StringsList(
				"White",
				"Red",
				"Green",
				"Blue"
		);
		
		stringList.setIndex(2);
		
		DrawingsFrame frame = 
			new DrawingsFrame(stringList);
		frame.launchFrame();
		
	}
}
