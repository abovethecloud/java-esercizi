package drawings;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Implementare un componente CompositeDrawableBuilder munito di una funzionalità che consenta di convertire 
 * una Stringa in un Elemento Disegnabile.
 * 
 * NOTA : non c'è scritto di fare un Drawable. 
 * 
 * NOTA (2) : Per chi guarda questa soluzione a partire da Dicembre; riflettere
 * su come questa classe soddisfa il principio OCP, e su come implementa i Design Pattern
 * Bridge e (per chi legge dalla metà di Dicembre) Builder
 * 
 * @author Alessandro
 */
public class CompositeDrawableBuilder {

	private IDrawableBuilder builder;
	
	private HashMap<String, IDrawableGenerator> generators=new HashMap<String, IDrawableGenerator>();

	private HashMap<String, Color> colors=new HashMap<String, Color>();
	
	public CompositeDrawableBuilder(IDrawableBuilder builder) {
		super();
		this.builder = builder;
	}

	public void addGenerator(String name,IDrawableGenerator generator){
		generators.put(name, generator);
	}

	public void addColor(String name,Color color){
		colors.put(name, color);
	}
	
	/**
	 * una funzionalità che consenta di convertire 
	 * una Stringa in un Elemento Disegnabile
	 * 
	 * Nota: imparare a leggere questo genere di frasi e a
	 * tradurle correttamente in metodi!!
	 * 
	 * @param description "una Stringa"
	 * @return "un Elemento Disegnabile"
	 */
	public Drawable build(String description){
		
		/* FASE 1
		 * L'interfaccia 'IDrawableBuilder' è utilizzata
		 * per astrarre sul modo in cui la stringa di descrizione 
		 * viene interpretata. Questo è un passaggio essenziale 
		 * per risolvere il Test0012
		 */
		//Chiedo al modulo astratto di interpretarmi la descrizione
		builder.setDescription(description);
		
		//Recupero (dal modulo astratto) la Stringa che descrive il colore
		String colorName=builder.getColor();
		
		//Recupero (dal modulo astratto) la Stringa che descrive il nome del Drawable
		String drawableName=builder.getDrawableName();
		
		//Recupero (dal modulo astratto) la lista dei parametri
		ArrayList<String> parameters=builder.getParameters();
		
		/* FASE 2
		 * Costruire il Drawable
		 * 
		 * Nota: l'HashMap combinata all'interfaccia 'IDrawableGenerator'
		 * è un modo efficace di evitare una catena di 'if-else' (impossibile utilizzare
		 * lo switch sulle stringhe) che sarebbe inadeguata perchè poco riconfigurabile
		 */
		IDrawableGenerator generator=generators.get(drawableName);
		
		//creo il Drawable
		Drawable drawable=generator.generate(parameters);
		
		Color color=colors.get(colorName);
		
		//creo la versione colorata del Drawable
		ColoredDrawable coloredDrawable=new ColoredDrawable(color, drawable);
		
		return coloredDrawable;
	}
}
