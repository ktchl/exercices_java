package ex8;
/*
 * 1- Cr�er une classe Voiture java de visibilit� public, ayant pour attributs : String marque, Double prix, de visibilit� priv�e.
 * 2- Cr�er un constructeur sans param�tres (par d�faut)
 * 3- Cr�er les getters et setters
 * 4- Cr�er une m�thode void afficher() permettant d'afficher les r�sultats
 * 5- Donner le code final de la classe
 * 6- Cr�er une classe Ex�cution de visibilit� public permettant d'ex�cuter les r�sultats.
 */
public class Main {

	public static void main(String[] args) {
		Voiture voiture = new Voiture();
		voiture.setMarque("Ferrari");
		voiture.setPrix(200000.0);
		voiture.afficher();
		
		// TODO Auto-generated method stub

	}

}
