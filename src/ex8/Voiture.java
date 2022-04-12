package ex8;

public class Voiture {

	private String marque;
	private Double prix;

	public Voiture() {

	}

	public void afficher() {

		System.out.println("Marque de la voiture: " + marque + "\nPrix de la voiture: " + prix + " euros");

	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

}
