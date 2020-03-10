package TpJava;

public class UneClasseMetier {

	private Affilog AT;
	public UneClasseMetier(final Affilog AT) {
		this.AT = AT;
	}
	
	public void uneMethodeMetier() {
		this.AT.affichageTemporel(": Début de uneMethodeMetier");
		
		this.AT.affichageTemporel(": Fin de uneMethodeMetier");
	}
	
	public void uneMethodeMetierSLF4J() {
		this.AT.affichageTemporelSLF4J(": Début de uneMethodeMetier");
		
		this.AT.affichageTemporelSLF4J(": Fin de uneMethodeMetier");
	}
}