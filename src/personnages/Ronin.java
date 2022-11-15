/**
 * 
 */
package personnages;

/**
 * @author lucas
 *
 */
public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, boisson, argent);
		this.honneur = 1;
	}

	public void donner(Commercant c) {
		int argDonne = getArgent() / 10;
		parler(c.getNom() + "prend ces " + argDonne + " sous.");
		perdreArgent(argDonne);
		c.recevoir(argDonne);
	}
}
