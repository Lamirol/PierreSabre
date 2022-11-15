/**
 * 
 */
package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

/**
 * @author lucas
 *
 */
public class HistoireTP4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Humain p = new Humain("Prof", "kombucha", 54);
		p.bonjour();
		p.acheter("boissons", 12);
		p.boire();
		p.acheter("jeu", 2);
		p.acheter("kimono", 50);
		Commercant c = new Commercant("Marco", 15);
		c.bonjour();
		Yakuza y = new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");
		y.bonjour();
		y.extorquer(c);
		c.recevoir(15);
		c.boire();
		Ronin r = new Ronin("Roro", 60, "shochu");
		r.bonjour();

	}

}
