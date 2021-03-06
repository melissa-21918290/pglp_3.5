package TpJava;

import java.time.LocalDateTime;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;



public class Affilog implements Affichage {

	final org.slf4j.Logger logger;
	
	public Affilog() {
		
		this.logger = LoggerFactory.getLogger(Affilog.class);
		
		
	}
	public void affichageTemporel(final String descriptif) {
		System.out.println(LocalDateTime.now() + descriptif);
	}
	
	public void affichageTemporelSLF4J(final String descriptif) {
		logger.info(LocalDateTime.now() + descriptif);
	}

}