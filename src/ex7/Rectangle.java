package ex7;

public class Rectangle {

	private Double longueur;
	private Double largeur;

	public Rectangle(Double longueur, Double largeur) {

		this.longueur = longueur;
		this.largeur = largeur;

	}

	public Double surface() {

		return longueur * largeur;
	}

	public Double perimetre() {

		return 2 * (longueur + largeur);
	}

	public void afficher() {

		System.out.println("La surface du rectangle est: " + surface());
		System.out.println("Le périmètre du rectangle est: " + perimetre());

	}

	public Double getLongueur() {

		return longueur;
	}

	public void setLongueur(Double longueur) {

		this.longueur = longueur;
	}

	public Double getLargeur() {

		return largeur;
	}

	public void setLargeur(Double largeur) {

		this.largeur = largeur;
	}

}
