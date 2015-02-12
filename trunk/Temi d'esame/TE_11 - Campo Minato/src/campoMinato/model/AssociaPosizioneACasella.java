package campoMinato.model;

/**
 * Questa classe serve ad associare ad una posizione del pannello una casella
 * 
 * @author claudio
 *
 */
public class AssociaPosizioneACasella {
	
	private Campo campo;
	
	public AssociaPosizioneACasella(Campo campo) {
		this.campo = campo;
	}
	
	public Casella cheCasella(int x, int y) {

		int dimCasella = Casella.DIM_CASELLA;
		Casella casellaOutput = null;
		
		for (int i = 0; i < campo.getDim_campo(); i++) {
			for (int j = 0; j < campo.getDim_campo(); j++) {
				Casella casella = campo.getCampoDiCaselle()[i][j];
				int XCasella = casella.getX();
				int YCasella = casella.getY();

				if ( (XCasella<x && x<XCasella+dimCasella) && (YCasella<y && y<YCasella+dimCasella)) {
					casellaOutput = casella;
					return casellaOutput;
				}
			}
			
		}
		return casellaOutput;
	}

}
