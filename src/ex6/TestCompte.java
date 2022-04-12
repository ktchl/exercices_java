package ex6;

/*
 * 1- Créer une classe java nommée Compte qui représente un compte bancaire de visibilité public, ayant pour 
 * attributs: public Double solde
 * 2- Créer un constructeur ayant comme paramètre solde.
 * 3- Créer une méthode deposer() du type void qui gère les versements.
 * 4- Créer une méthode retirer() du type void qui gère les retraits. 
 * 5- Créer une méthode afficher() du type void permettant d'afficher le solde
 * 6- Donner le code complet de la classe Compte.
 * 7- Créer une classe TestCompte permettant de tester le compte en effectuant un versement puis un retrait.
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
