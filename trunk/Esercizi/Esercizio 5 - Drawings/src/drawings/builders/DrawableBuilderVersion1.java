package drawings.builders;


import drawings.IDrawableBuilder;

public class DrawableBuilderVersion1 extends GenericDrawableBuilder implements IDrawableBuilder{


	@Override
	public void setDescription(String description) {
		
		reset();
		
		String[] splits = description.split(" ");
		
		if(splits.length>=2){

			setName(splits[0]);
			setColor(splits[1]);
			
			for (int i = 2; i < splits.length; i++) {
				addParameters(splits[i]);
			}
		}
	}
}
