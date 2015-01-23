package drawings.builders;

import java.util.ArrayList;

public class GenericDrawableBuilder {

	private String color = null;
	private String name = null;
	private ArrayList<String> parameters = new ArrayList<String>();

	public GenericDrawableBuilder() {
		super();
	}

	public String getColor() {
		return color;
	}

	public String getDrawableName() {
		return name;
	}

	public ArrayList<String> getParameters() {
		return parameters;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void reset(){
		color = null;
		name = null;
		parameters.clear();
	}
	
	public void addParameters(String... parameters) {
		for (int i = 0; i < parameters.length; i++) {
			this.parameters.add(parameters[i]);
		}
	}
}