package drawings;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Questa classe, il cuore del DESIGN PATTERN BUILDER, è il DIRETTORE.
 * Il compito del direttore è quello di tenere sotto controllo il processo di generazione di un oggetto complesso composto da oggetti più semplici.
 * Il direttore si appoggia al builder (che può essere una diversa implementazione di una generica interfaccia Builder) chiedendogli di costruire un piccolo pezzo.
 * In questo caso il direttore chiede al builder di interpretare la stringa e di restituire i pezzi di stringa che interessano per poter generare il Drawable,
 * in tal modo può astrarre dal modo in cui la stringa deve essere letta, lasciando il compito al builder.
 * 
 * Allo stesso modo il DIRETTORE lascia il compito di generare l'oggetto a specifici generatori nascosti questa volta
 * non dietro un'interfaccia, ma dietro un'HashMap, più flessibile per modifiche a RunTime.
 * 
 * Volendo si potrebbe anche implementare un Singleton.
 * 
 * @author claudio
 *
 */
public class DirectorBuilderDrawable {
	
	private IBuilderDrawable builder;
	private HashMap<String, IDrawableGenerator> generatorMap = new HashMap<String, IDrawableGenerator>();
	private HashMap<String, Color> colorMap = new HashMap<String, Color>();

	/**
	 * Il Costruttore di default setta il builder specifico da usare per
	 * interpretare la stringa (si suppone di conoscere in anticipo la
	 * formattazione delle stringhe)
	 * 
	 * @param builder
	 */
	public DirectorBuilderDrawable(IBuilderDrawable builder) {
		super();
		this.builder = builder;
	}
	
	/**
	 * Metodo da invocare a RunTime nel main che aggiunge uno dei generatori possibili
	 * 
	 * @param generatorName
	 * @param generator
	 */
	public void addGenerator(String generatorName, IDrawableGenerator generator) {
		this.generatorMap.put(generatorName, generator);
	}
	
	/**
	 * Metodo da invocare a RunTime nel main che aggiunge uno dei possibili colori
	 * @param colorName
	 * @param color
	 */
	public void addColor(String colorName, Color color) {
		this.colorMap.put(colorName, color);
	}
	
	/**
	 * Il metodo piu' importante: Si occupa della costruzione effettiva del Drawable,
	 * mettendo assieme i vari pezzi. Prima chiede al ConcreteBuilder di interpretare la descrizione
	 * del Drawable, poi in base alle proprie mappe, affida i parametri e il colore all'opportuno
	 * generatore di Drawable (tutti valori restituiti dal Drawable)
	 * 
	 * @param description è una Stringa contente Tipo, Colore e Parametri del Drawable da disegnarsi
	 * @return un Drawale corrispondente alla descrizione nella stringa description
	 */
	public Drawable build(String description) {
		
		// Comunico allo specifico builder la stringa da interpretare
		this.builder.setDescription(description);
		
		// Ottengo tutti i parametri che mi servono da passare al generatore nelle Mappe
		String type = this.builder.getType();
		String color = this.builder.getColor();
		ArrayList<String> parameters = this.builder.getParameters();
		
		// Creo un drawable (per ora senza colore) utilizzando il generatore corrispondente
		// al tipo nella mappa e passandogli l'ArrayList di parametri "parameters"
		Drawable drawable = this.generatorMap.get(type).generate(parameters);		
		
		return new ColoredDrawable(this.colorMap.get(color), drawable);
	}

}
