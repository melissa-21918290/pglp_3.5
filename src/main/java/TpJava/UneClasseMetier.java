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
