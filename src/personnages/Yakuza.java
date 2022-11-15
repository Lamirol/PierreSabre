/**
 * 
 */
package personnages;

/**
 * @author lucas
 *
 */
public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public int getReputation() {
		return this.reputation;
	}

	public String getClan() {
		return this.clan;
	}

	public void extorquer(Commercant c) {
		int montant = c.getArgent();
		gagnerArgent(montant);
		this.reputation++;
		parler("Tiens tiens, ne serait-ce pas un faible marchant qui passe par l�?");
		parler(c.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		c.seFaireExtorquer();
		parler("J'ai piquer les " + montant + " sous de " + c.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");
	}

	public void gagner(int gain) {
		this.reputation++;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + getClan()
				+ " ? Je l'ai d�pouill� de ses " + gain + " sous.");
	}

	public int perdre() {
		this.reputation--;
		parler("J'ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai d�shonor� le clan de " + getClan()
				+ ".");
		int argent = getArgent();
		perdreArgent(argent);
		return argent;
	}
}
