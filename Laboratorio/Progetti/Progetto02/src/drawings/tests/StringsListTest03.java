package drawings.tests;

import javax.swing.JPanel;

import drawings.DrawingsFrame;
import drawings.stringslist.Placer;
import drawings.stringslist.StringsList;
import drawings.stringslist.VerticalPlacer;

public class StringsListTest03 {

	public static void main(String[] args) {
		
		StringsList stringList=new StringsList(
				"White",
				"Red",
				"Green",
				"Blue"
		);
		
		stringList.setIndex(2);
		
		Placer placer = new Placer();
		stringList.setPlacer(placer);
		placer.setPlacer(new VerticalPlacer());
		
		DrawingsFrame frame = 
			new DrawingsFrame(stringList);
		frame.launchFrame();
		
		JPanel panel = frame.getPanel();
		
		StringsListController controller =
			new StringsListController(
					stringList, placer, panel);
		
		frame.addKeyListener(controller);
	}
}
