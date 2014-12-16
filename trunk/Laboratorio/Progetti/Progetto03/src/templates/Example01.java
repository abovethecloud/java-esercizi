package templates;

public class Example01 {
	
	public static void main(String[] args) {
		
		TemplateClass<String> template01 = new TemplateClass<String>("Ciao", 1);
		
		TemplateClass<Integer> template02 = new TemplateClass<Integer>(1, 1);
		
		TemplateClass<Double> template03 = new TemplateClass<Double>(1.0, 1);


	}

}
