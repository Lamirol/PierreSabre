/**
 * 
 */
package personnages;

/**
 * @author lucas
 *
 */
public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
	}

	public int seFaireExtorquer() {
		int argent = perdreArgent(getArgent());
		parler("J'ai tout perdu! Le monde est vraiment trop injuste ...");
		return argent;

	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! Je te remercie g�n�reux donateur!");
	}
}
