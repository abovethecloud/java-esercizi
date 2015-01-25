package drawings;

import java.util.ArrayList;

/**
 * Un'implementazione concreta di un BuilderDrawable.
 * Varianti potrebbero nascere per modificare il modo in cui, ad esempio, viene letta la stringa (se la formattazione fosse differente).
 * Potrebbe essere conveniente aggiungere una superclasse GenericDrawableBuilder che raccoglie tutti i metodi in comune quando i ConcreteBuilder diventano troppi.
 * In alternativa si potrebbe anche pensare di utilizzare una classe astratta.
 * 
 * @author claudio
 *
 */
public class BuilderDrawable1 implements IBuilderDrawable {

	private String type = null, color = null;
	private ArrayList<String> parameters = new ArrayList<String>();

	@Override
	public void setDescription(String description) {
		reset();

		String[] splits = description.split(" ");

		if (splits.length >= 2) {

			setType(splits[0]);
			setColor(splits[1]);

			for (int i = 2; i < splits.length; i++) {
				addParameter(splits[i]);
			}
		}
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	@Override
	public ArrayList<String> getParameters() {
		// TODO Auto-generated method stub
		return this.parameters;
	}

	@Override
	public void reset() {
		this.type = null;
		this.color = null;
		this.parameters.clear();
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void addParameter(String parameter) {
		
		this.parameters.add(parameter);
	}

}
