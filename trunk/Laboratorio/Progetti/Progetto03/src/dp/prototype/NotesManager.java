package dp.prototype;



public class NotesManager {

	public enum Notes /*extends Enum*/ {
		
		// Elenco tutte le costanti (con il ";" solo in fondo. Poi gestisco l'enumerazione come una clsse)
		HALF_QUARTER_NOTE(new Note(0.5f, 0)),
		ONE_QUARTER_NOTE(new Note(1.0f, 0)),
		TWO_QUARTER_NOTE(new Note(2.0f, 0));
		
		private Note note;

		private Notes(Note note) {
			this.note = note;
		}

		public Note getNote() {
			return note;
		}

		public void setNote(Note note) {
			this.note = note;
		}
		
		
		
		
	}
	
	// La melodia è un vettore di note. Alle note servirebbe pure una posizione di partenza
	public Note[] createDefaultMelody() {
		
		Note[] notes = new Note[3];
		
		notes[0] = Notes.HALF_QUARTER_NOTE.getNote().clone();
		notes[1] = Notes.ONE_QUARTER_NOTE.getNote().clone();
		notes[2] = Notes.TWO_QUARTER_NOTE.getNote().clone();

		return notes;
		
	}
	
}
