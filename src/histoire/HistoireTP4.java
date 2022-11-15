/**
 * 
 */
package histoire;

import personnages.Humain;

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
	}

}
