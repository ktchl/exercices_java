package ex6;

/*
 * 1- Cr�er une classe java nomm�e Compte qui repr�sente un compte bancaire de visibilit� public, ayant pour 
 * attributs: public Double solde
 * 2- Cr�er un constructeur ayant comme param�tre solde.
 * 3- Cr�er une m�thode deposer() du type void qui g�re les versements.
 * 4- Cr�er une m�thode retirer() du type void qui g�re les retraits. 
 * 5- Cr�er une m�thode afficher() du type void permettant d'afficher le solde
 * 6- Donner le code complet de la classe Compte.
 * 7- Cr�er une classe TestCompte permettant de tester le compte en effectuant un versement puis un retrait.
 */
public class TestCompte {

	public static void main(String[] args) {

		Compte compte = new Compte(5000.0);
		compte.afficher();
		compte.deposer(3000.0);
		compte.afficher();
		compte.retirer(2000.0);
		compte.afficher();
		// TODO Auto-generated method stub

	}

}
