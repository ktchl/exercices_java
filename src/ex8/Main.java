package ex8;
/*
 * 1- Créer une classe Voiture java de visibilité public, ayant pour attributs : String marque, Double prix, de visibilité privée.
 * 2- Créer un constructeur sans paramètres (par défaut)
 * 3- Créer les getters et setters
 * 4- Créer une méthode void afficher() permettant d'afficher les résultats
 * 5- Donner le code final de la classe
 * 6- Créer une classe Exécution de visibilité public permettant d'exécuter les résultats.
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
