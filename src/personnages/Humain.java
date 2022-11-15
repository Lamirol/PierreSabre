/**
 * 
 */
package personnages;

/**
 * @author lucas
 *
 */
public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public Humain(String n, String b, int a) {
		this.nom = n;
		this.boisson = b;
		this.argent = a;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the argent
	 */
	public int getArgent() {
		return argent;
	}

	private void parler(String texte) {
		System.out.println(getNom() + " - " + texte);
	}

	public void bonjour() {
		parler("Bonjour! Je m'appelle " + getNom() + " et j'aime boire du " + this.boisson + ", j'ai " + getArgent()
				+ " sous en poche.");
	}

	public void boire() {
		parler("Mmmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix < getArgent()) {
			parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir une " + bien + " à " + prix
					+ " sous !");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à "
					+ prix + ".");
		}
	}

	public void gagnerArgent(int gain) {
		this.argent = this.argent + gain;
	}

	public void perdreArgent(int perte) {
		this.argent = this.argent - perte;
	}
}
