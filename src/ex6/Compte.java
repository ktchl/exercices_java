package ex6;

public class Compte {

	public Double solde;

	public Compte(Double solde) {

		this.solde = solde;
	}

	public void deposer(Double versement) {

		this.solde += versement;

	}

	public void retirer(Double retirement) {
		if (solde >= retirement) {
			this.solde -= retirement;
		} else {
			System.out.println("Pas assez d'argent");
		}
	}

	public void afficher() {

		System.out.println("Voici le solde du compte: " + solde);

	}

}
