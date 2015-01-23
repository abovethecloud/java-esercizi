package drawings.builders;


import drawings.IDrawableBuilder;

public class DrawableBuilderVersion2 extends GenericDrawableBuilder implements IDrawableBuilder{


	@Override
	public void setDescription(String description) {

		reset();
		
		String[] splits = description.split(" ");
		
		if(splits.length>=2){

			String name=splits[0];
			setName(name.substring(1, name.length()-1));
			String color=splits[1];
			setColor(color.substring(1, color.length()-1));
			
			String[] parametersSplits=splits[2].split("-");

			addParameters(parametersSplits);
		}
	}
}
