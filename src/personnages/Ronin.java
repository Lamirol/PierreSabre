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
		parler(c.getNom() + " prend ces " + argDonne + " sous.");
		perdreArgent(argDonne);
		c.recevoir(argDonne);
	}

	public void provoquer(Yakuza y) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (this.honneur * 2 > y.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(y.perdre());
			this.honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			y.gagner(getArgent());
			this.honneur--;
			this.perdreArgent(getArgent());
		}
	}
}
