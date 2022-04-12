package ex1;
/*Ecrire un programme java qui demande à l'utilisateur de saisir son nom et de lui afficher 
* son nom avec le message de bienvenue.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre nom: ");
		String nom = sc.nextLine();
		System.out.println("Bienvenue: " + nom);
		
		// TODO Auto-generated method stub

	}

}
